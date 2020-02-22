package com.example.atmira01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.atmira01.dto.SampleUserDto;
import com.example.atmira01.service.ISampleUserService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SampleController {
	
	@Autowired
    private ISampleUserService userService;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Listado de todos los usuarios", notes = "Listado de todos los usuario")
    public List<SampleUserDto> getUsers() {  	
        return userService.findAllUsers();
    }

}
