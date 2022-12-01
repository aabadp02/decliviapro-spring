package dao.Interface;

import dto.UserDTO;

/**
 * Interfaz para la capa de acceso a datos de usuarios
 */

public interface IUserDao {

    //Provisional
    String COLUMN_USER_ID = "userId";

    String COLUMN_USER_NICK = "nick";
    String COLUMN_USER_EMAIL = "email";
    String COLUMN_USER_PASSWORD = "password";
    String COLUMN_USER_CREATIONDATE = "creationDate";

    /**
     * Método que lanza la consulta a la base de datos para crear un nuevo usuario
     *
     * Notar que: la entidad usuario @See: UserEntity.java cuenta también con el campo id y con el campo creationDate, pero estos no son datos que el usuario tendrá que introducir.
     * El id se autogenera y la fecha de creación la calcularemos en este propio método
     *
     * @param userDTO: objeto usuario que queremos persistir en la base de datos
     */
    public void createUser(UserDTO userDTO);

    /**
     * Método para comprobar si un usuario está en la base de datos
     *
     * @param userDTO: El usuario que queremos autenticar
     * @return True: Si los datos del usuario son válidos y existen dentro de la base de datos
     *         False: Si los datos del usuario no coinciden con ninguno de la base de datos
     */
    public boolean authenticateUser(UserDTO userDTO);


}
