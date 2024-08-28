package com.gorillas.rest_template.dto;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;

@Data
public class UserDTO {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private String avatar;
}
