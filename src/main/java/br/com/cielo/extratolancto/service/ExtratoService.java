package br.com.cielo.extratolancto.service;

import br.com.cielo.extratolancto.service.dto.ExtratosLanctosDTO;

import java.util.List;

/**
 * Especificação do Serviço responsável de buscar os dados do Repositório e transformálos para o DTO
 *
 * @author Igor Fraga
 */
public interface ExtratoService {

    public List<ExtratosLanctosDTO> listarExtratosContas();

}
