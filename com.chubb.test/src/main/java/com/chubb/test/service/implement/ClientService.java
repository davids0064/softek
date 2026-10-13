package com.chubb.test.service.implement;

import java.util.List;
import java.util.Optional;


import com.chubb.test.dto.ClientDTO;
import com.chubb.test.jpa.entity.ClienteEntity;
import com.chubb.test.jpa.respository.ClientRepository;
import com.chubb.test.mapper.ClientMapper;
import com.chubb.test.service.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {

	private final ClientRepository clientRepository;
	private final ClientMapper clientMapper;

	 
	@Override
	public List<ClientDTO> findAll() {
		List<ClienteEntity> clients = clientRepository.findAll();
		return clientMapper.toDtoList(clients);
	}

	@Override
	public String save(ClientDTO dto) {
		ClienteEntity entity = clientMapper.toEntity(dto);
		ClienteEntity saved = clientRepository.save(entity);
		return "Cliente registrado con éxito con ID: " + saved.getId();
	}

	@Override
	public ResponseEntity<String> deleteClient(int id) {
		Optional<ClienteEntity> clienteEntity = clientRepository.findById(id);
		if(clienteEntity.isPresent()) {
			clientRepository.deleteById(id);
			return new ResponseEntity<>("Cliente eliminado con éxito con ID: " + id, HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>("Cliente no encontrado con ID: " + id + id, HttpStatus.NOT_FOUND);
		}
	}

}
