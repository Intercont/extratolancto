package br.com.cielo.extratolancto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Mapeamento da estrutura do JSON originado do Sistema Legado
 *
 * @author Igor Fraga
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalControleLancamento {

    private BigInteger quantidadeLancamentos;
    private BigInteger quantidadeRemessas;
    private BigDecimal valorLancamentos;

    public BigInteger getQuantidadeLancamentos() {
        return quantidadeLancamentos;
    }

    public void setQuantidadeLancamentos(BigInteger quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
    }

    public BigInteger getQuantidadeRemessas() {
        return quantidadeRemessas;
    }

    public void setQuantidadeRemessas(BigInteger quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
    }

    public BigDecimal getValorLancamentos() {
        return valorLancamentos;
    }

    public void setValorLancamentos(BigDecimal valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
    }
}
