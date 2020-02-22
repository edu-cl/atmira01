package com.example.atmira01.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "USUARIO")
public class SampleUserDto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @ApiModelProperty(value = "Id de usuario", required = true)
    private Long id;

    @Column(name = "NOMBRE")
    @ApiModelProperty(value = "Nombre de usuario", required = true)
    private String nombre;

}
