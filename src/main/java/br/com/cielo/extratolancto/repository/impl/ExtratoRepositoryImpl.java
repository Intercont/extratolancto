package br.com.cielo.extratolancto.repository.impl;

import br.com.cielo.extratolancto.model.LanctosContaLegado;
import br.com.cielo.extratolancto.repository.ExtratoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;

/**
 * Implementação do "Repositório" fonte dos dados, captura os dados do JSON armazenado localmente na aplicação
 *
 * @author Igor Fraga
 */
@Repository
public class ExtratoRepositoryImpl implements ExtratoRepository {

    @Value("${json_source_legado}")
    private String SOURCE_PATH_TO_JSON;

    @Override
    public LanctosContaLegado getLanctosContaLegado() {

        //mapeamento dos dados do JSON
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStreamJSON = this.getClass().getClassLoader().getResourceAsStream(SOURCE_PATH_TO_JSON);

        try {
            return objectMapper.readValue(inputStreamJSON, LanctosContaLegado.class);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar JSON de dados mockados do sistema legado", e.getCause());
        }
    }
}
