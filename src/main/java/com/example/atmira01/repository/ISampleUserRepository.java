package com.example.atmira01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.atmira01.dto.SampleUserDto;

@Repository
public interface ISampleUserRepository extends JpaRepository<SampleUserDto, Long> {

}
