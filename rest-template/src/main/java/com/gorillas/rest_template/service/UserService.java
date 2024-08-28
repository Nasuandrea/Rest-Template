package com.gorillas.rest_template.service;

import com.gorillas.rest_template.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Value("${spring.external.service.base-url}")
    private String basePath;

    private final RestTemplate restTemplate;


    public List<UserDTO> getUsers(){
        UserDTO[] response = restTemplate.getForObject(basePath,UserDTO[].class);
        return Arrays.asList(response);
    }

    public void saveUser(UserDTO user){
        restTemplate.postForObject(basePath,user,UserDTO.class);
    }

    public void updateUser(UserDTO user, Integer id){
        restTemplate.put(basePath+"/"+id,user);
    }

    public void deleteUser(Integer id){
        restTemplate.delete(basePath+"/"+id);
    }
}
