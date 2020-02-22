package com.example.atmira01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.atmira01.dto.SampleUserDto;
import com.example.atmira01.repository.ISampleUserRepository;

@Service
public class SampleUserServiceImpl implements ISampleUserService {
	
	@Autowired
    private ISampleUserRepository userRepository;

	@Override
	public List<SampleUserDto> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<SampleUserDto> findUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SampleUserDto saveUser(SampleUserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(SampleUserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

}
