package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public UserDto test(){

        UserDto userDto = new UserDto();
        userDto.setAge(33);
        userDto.setName("고선호");

        return userDto;
    }
}
