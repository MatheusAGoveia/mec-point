package com.mecpoint.user.mapper;

import com.mecpoint.core.mapper.BaseMapper;
import com.mecpoint.user.dto.UserInDTO;
import com.mecpoint.user.dto.UserOutDTO;
import com.mecpoint.user.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper<User, UserInDTO, UserOutDTO> {
}
