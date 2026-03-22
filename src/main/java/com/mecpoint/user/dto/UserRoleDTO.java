package com.mecpoint.user.dto;

import com.mecpoint.user.entities.enums.UserRole;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRoleDTO {

    @NotNull
    private UserRole role;
}
