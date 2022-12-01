package service;

import dao.Interface.IUserDao;
import dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import service.Interface.IUserService;

/**
 * Servicio para la clase usuario, que llevará a cabo la lógica de negocio y enviará instrucciones a la capa de base de datos(dao)
 */

public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    @Override
    public void checkBeforeCreateUpdate(UserDTO userDTO) {

        userDao.createUser(userDTO);
    }

    @Override
    public boolean authenticateUser(UserDTO userDTO){

       return userDao.authenticateUser(userDTO);
    }
}
