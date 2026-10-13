package com.chubb.test.controller;

import java.util.List;

import com.chubb.test.dto.ClientDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.chubb.test.service.IClientService;

@RestController
@CrossOrigin(origins = { "http://localhost:8080" })
@RequestMapping("/api/client")
@RequiredArgsConstructor
public class ClientController {

	private final IClientService clientService;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<ClientDTO>> getClients() {
    	return ResponseEntity.ok(clientService.findAll());
    	
    }

	@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public ResponseEntity<String> saveClient(@RequestBody ClientDTO client) {
    	return new ResponseEntity<>(clientService.save(client), HttpStatus.OK);
    	
    }

	@DeleteMapping("client/{id}")
	public ResponseEntity<String> deleteClient(@PathVariable int id) {
		return clientService.deleteClient(id);
	}
	
}
