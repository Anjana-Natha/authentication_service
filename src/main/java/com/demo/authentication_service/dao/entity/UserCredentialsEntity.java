package com.demo.authentication_service.dao.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document

public class UserCredentialsEntity {
	@Id
	private String id;
	private String name;
	private String password;

}
