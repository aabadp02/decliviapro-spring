package dao;

import converters.UserDTOEntityConverter;
import dao.Interface.IUserDao;
import dto.UserDTO;
import entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Implementación de la capa de acceso a datos de usuarios
 */

public class UserDaoImpl implements IUserDao {

    //Objeto que servirá para trabajar con la capa de persistencia de hibernate
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createUser(UserDTO userDTO) {

        //Transformamos el DTO en una entidad, ya que es lo que queremos persistir
        UserEntity userEntity = UserDTOEntityConverter.createEntity(userDTO);

        entityManager.merge(userEntity);
    }

    @Override
    public boolean authenticateUser(UserDTO userDTO) {

        //Construimos la consulta a la base de datos para comprobar si existe el usuario cuyo nick es el mismo del usuario pasado por parámetro
        String query = "SELECT a.nick FROM Users a WHERE a.nick = :p1";

        List<UserDTO> result = entityManager.createQuery(query).setParameter("p1", userDTO.getNick()).getResultList();

        //Si la lista está vacía o si la contraseña no es correcta, devolveremos false. De lo contrario, devolveremos true
        return !result.isEmpty() && result.get(0).getPassword().equals(userDTO.getPassword());
    }
}
