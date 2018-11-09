package br.com.cielo.extratolancto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Mapeamento da estrutura do JSON originado do Sistema Legado
 *
 * @author Igor Fraga
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LanctosContaCorrenteCliente {

    private long numeroRemessaBanco;
    private String nomeSituacaoRemessa;
    private DomicilioBancario dadosDomicilioBancario;
    private String nomeTipoOperacao;

    public long getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }

    public void setNumeroRemessaBanco(long numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }

    public String getNomeSituacaoRemessa() {
        return nomeSituacaoRemessa;
    }

    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }

    public DomicilioBancario getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    public void setDadosDomicilioBancario(DomicilioBancario dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }

    public String getNomeTipoOperacao() {
        return nomeTipoOperacao;
    }

    public void setNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
    }
}
