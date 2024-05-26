package com.codedecode.userinfo.mapper;

import com.codedecode.userinfo.entity.User;
import com.codedecode.userinfo.entity.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapUserDTOToUser(UserDTO userDTO);
    UserDTO mapUserTOUserDTO(User user);
}
