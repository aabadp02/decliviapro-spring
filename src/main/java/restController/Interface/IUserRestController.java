package restController.Interface;

import dto.UserDTO;

/**
 * Interfaz para el controlador rest de la clase usuario
 */

public interface IUserRestController {

    //Endpoint de la api para las acciones de la clase usuario
    final String API_ENDPOINT = "declivia/api/v1";

    /**
     * Método para crear un usuario
     */
    public void createUser(UserDTO user);

    public boolean authenticateUser(UserDTO user);
}
