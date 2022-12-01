package service.Interface;

import dto.UserDTO;

/**
 * Interfaz del servicio que describe la lógica de negocio de la clase usuario
 *
 * @author alejandro.abad
 */

public interface IUserService{

    /**
     * Método para hacer las comprobaciones necesarias antes de añadir o modificar un usuario
     */
    public void checkBeforeCreateUpdate(UserDTO userDTO);

    /**
     * Método para loguear un usurio en la aplicación
     *
     * @param userDTO: El usuario que queremos loguear
     * @return True: si los datos del usaurio son correctos y existen en la base de datos
     *         False: Si los datos del usuario no coinciden con ninguno de la base de datos
     */
    public boolean authenticateUser(UserDTO userDTO);
}
