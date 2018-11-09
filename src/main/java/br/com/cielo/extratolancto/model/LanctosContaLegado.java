package br.com.cielo.extratolancto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Mapeamento da estrutura do JSON originado do Sistema Legado
 *
 * @author Igor Fraga
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LanctosContaLegado {

    private TotalControleLancamento totalControleLancamento;
    private List<ControleLancamento> listaControleLancamento;
    private long indice;
    private long tamanhoPagina;
    private long totalElements;

    public TotalControleLancamento getTotalControleLancamento() {
        return totalControleLancamento;
    }

    public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    public List<ControleLancamento> getListaControleLancamento() {
        return listaControleLancamento;
    }

    public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    public long getIndice() {
        return indice;
    }

    public void setIndice(long indice) {
        this.indice = indice;
    }

    public long getTamanhoPagina() {
        return tamanhoPagina;
    }

    public void setTamanhoPagina(long tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }
}
