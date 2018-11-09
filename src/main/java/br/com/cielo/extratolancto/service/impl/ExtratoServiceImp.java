package br.com.cielo.extratolancto.service.impl;

import br.com.cielo.extratolancto.model.ControleLancamento;
import br.com.cielo.extratolancto.repository.ExtratoRepository;
import br.com.cielo.extratolancto.service.ExtratoService;
import br.com.cielo.extratolancto.service.dto.ExtratosLanctosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação do Serviço responsável de buscar os dados do Repositório e transformálos para o DTO
 *
 * @author Igor Fraga
 */
@Service
public class ExtratoServiceImp implements ExtratoService {

    @Autowired
    private ExtratoRepository extratoRepository;

    @Override
    public List<ExtratosLanctosDTO> listarExtratosContas() {

        List<ExtratosLanctosDTO> listExtratosLanctosDTO = new ArrayList<>();

        for (ControleLancamento lancto : extratoRepository.getLanctosContaLegado().getListaControleLancamento()) {
            ExtratosLanctosDTO dto = new ExtratosLanctosDTO(
                    lancto.getDataLancamentoContaCorrenteCliente(),
                    lancto.getLancamentoContaCorrenteCliente().getNomeTipoOperacao().trim(),
                    lancto.getNumeroEvento(),
                    lancto.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa().trim(),
                    lancto.getDataEfetivaLancamento(),
                    new StringBuilder()
                            .append(lancto.getNomeBanco().trim())
                            .append(" ")
                            .append("Ag. ").append(lancto.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia())
                            .append(" ")
                            .append("CC. ").append(lancto.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente())
                            .toString(),
                    lancto.getValorLancamentoRemessa());

            listExtratosLanctosDTO.add(dto);
        }
        return listExtratosLanctosDTO;
    }
}
