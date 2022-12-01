package restController;

import dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import restController.Interface.IUserRestController;
import service.Interface.IUserService;

/**
 * Implementación del controlador rest para la clase usuario
 */

@RestController
public class UserRestControllerImpl implements IUserRestController {

    @Autowired
    IUserService userService;

    @RequestMapping(value = API_ENDPOINT + "/usuarios", method = RequestMethod.POST)
    public void createUser(@RequestHeader UserDTO userDTO){

        userService.checkBeforeCreateUpdate(userDTO);
    }

    @RequestMapping(value = API_ENDPOINT + "/usuarios", method = RequestMethod.GET)
    public boolean authenticateUser(@RequestHeader UserDTO userDTO){

        return userService.authenticateUser(userDTO);
    }
}
