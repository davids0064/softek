package com.chubb.test.jpa.respository;

import java.util.List;

import com.chubb.test.jpa.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.chubb.test.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<ClienteEntity, Integer> {

}
