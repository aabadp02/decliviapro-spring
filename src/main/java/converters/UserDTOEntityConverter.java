package converters;

import dto.UserDTO;
import entity.UserEntity;

/**
 * Clase para convertir el DTO usuario a entidad y viceversa
 */

public class UserDTOEntityConverter {

    public static UserDTO createDTO(UserEntity userEntity){

        UserDTO userDTO = new UserDTO();

        userDTO.setId(userEntity.getId());
        userDTO.setNick(userEntity.getNick());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setCreationDate(userEntity.getCreationDate());

        return userDTO;
    }

    public static UserEntity createEntity(UserDTO userDTO){

        UserEntity userEntity = new UserEntity();

        userEntity.setId(userDTO.getId());
        userEntity.setNick(userDTO.getNick());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setCreationDate(userDTO.getCreationDate());

        return userEntity;
    }


}
