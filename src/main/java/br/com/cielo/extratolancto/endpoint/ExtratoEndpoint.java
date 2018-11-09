package br.com.cielo.extratolancto.endpoint;

import br.com.cielo.extratolancto.service.ExtratoService;
import br.com.cielo.extratolancto.service.dto.ExtratosLanctosDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Estrutura de Endpoints da API
 *
 * @author Igor Fraga
 */
@Api(value = "API de Interface com Sistema Legado de Extratos")
@RestController
@RequestMapping("v1/extratos")
public class ExtratoEndpoint {

    private final ExtratoService extratoService;

    @Autowired
    public ExtratoEndpoint(ExtratoService extratoService) {
        this.extratoService = extratoService;
    }

    @ApiOperation(value = "Retorna a lista de Contas do Legado apenas com os campos e formato esperados pelo Frontend", response = ExtratosLanctosDTO[].class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Sucesso ao obter os valores"),
            @ApiResponse(code = 204, message = "Nenhum conteúdo encontrado"),
            @ApiResponse(code = 400, message = "Requisição mal formulada"),
            @ApiResponse(code = 401, message = "Não Autorizado"),
            @ApiResponse(code = 403, message = "Você não tem permissões para acessar este conteúdo"),
            @ApiResponse(code = 404, message = "Não encontrado"),
            @ApiResponse(code = 500, message = "Erro Interno. Por favor, tente novamente mais tarde")
    })
    @GetMapping
    public ResponseEntity<?> listLanctosContaLegado() {
        return new ResponseEntity<>(extratoService.listarExtratosContas(), HttpStatus.OK);
    }

}
