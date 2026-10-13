package com.chubb.test.mapper;

import com.chubb.test.dto.ClientDTO;
import com.chubb.test.jpa.entity.ClienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "surname", source = "username")
    ClienteEntity toEntity(ClientDTO dto);
    ClientDTO toDto(ClienteEntity entity);
    List<ClientDTO> toDtoList(List<ClienteEntity> entities);
}