package com.mecpoint.agendamento.mapper;

import com.mecpoint.core.mapper.BaseMapper;
import com.mecpoint.agendamento.dto.AgendamentoInDTO;
import com.mecpoint.agendamento.dto.AgendamentoOutDTO;
import com.mecpoint.agendamento.entities.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AgendamentoMapper extends BaseMapper<Agendamento, AgendamentoInDTO, AgendamentoOutDTO> {
    @Override
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "numeroAgd", ignore = true)
    Agendamento toEntity(AgendamentoInDTO dto);
}
