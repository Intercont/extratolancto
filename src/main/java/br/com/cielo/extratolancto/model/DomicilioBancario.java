package br.com.cielo.extratolancto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Mapeamento da estrutura do JSON originado do Sistema Legado
 *
 * @author Igor Fraga
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DomicilioBancario {

    private int codigoBanco;
    private int numeroAgencia;
    private long numeroContaCorrente;

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public long getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(long numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }
}
