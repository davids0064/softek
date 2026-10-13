package com.chubb.test.service;

import java.util.List;

import com.chubb.test.dto.ClientDTO;
import org.springframework.http.ResponseEntity;

public interface IClientService {
	List<ClientDTO> findAll();
	String save(ClientDTO client);
	ResponseEntity<String> deleteClient(int id);
}
