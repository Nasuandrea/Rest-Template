package com.gorillas.rest_template.service;

import com.gorillas.rest_template.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final RestTemplate restTemplate;


    public List<UserDTO> getUsers(){
        return null;
    }

    public void saveUser(UserDTO user){}

    public void updateUser(UserDTO user, Integer id){}

    public void deleteUser(Integer id){}
}
