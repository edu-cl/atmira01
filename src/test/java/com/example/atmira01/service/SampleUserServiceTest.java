package com.example.atmira01.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.atmira01.dto.SampleUserDto;
import com.example.atmira01.repository.ISampleUserRepository;

@RunWith(MockitoJUnitRunner.class)
public class SampleUserServiceTest {
	
	@InjectMocks
	private SampleUserServiceImpl userService;
	
	@Mock
	private ISampleUserRepository userRepository;
	
	private List<SampleUserDto> listUsers;
	
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        
        listUsers = new ArrayList<>();
        
        SampleUserDto user1 = new SampleUserDto();		
		SampleUserDto user2 = new SampleUserDto();
		
		listUsers.add(user1);
		listUsers.add(user2);
    }
	
	@After
	public void terminated() {
		listUsers = null;
	}
	
	@Test
	public void listAllTest() {		
		
		Mockito.when(userRepository.findAll()).thenReturn(listUsers);
		
		assertEquals(listUsers.size(), userService.findAllUsers().size());
		
	}

}
