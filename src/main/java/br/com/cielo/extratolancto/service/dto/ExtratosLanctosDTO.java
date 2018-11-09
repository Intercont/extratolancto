package br.com.cielo.extratolancto.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * DTO de seleção e trannsformação dos dados a serem enviados para o Frontend
 *
 * @author Igor Fraga
 */
public class ExtratosLanctosDTO {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataLancamento;

    private String descricao;
    private long numero;
    private String situacao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataConfirmacao;

    private String dadosBancarios;
    private BigDecimal valorFinal;

    public ExtratosLanctosDTO(Date dataLancamento, String descricao, long numero, String situacao, Date dataConfirmacao, String dadosBancarios, BigDecimal valorFinal) {
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
        this.numero = numero;
        this.situacao = situacao;
        this.dataConfirmacao = dataConfirmacao;
        this.dadosBancarios = dadosBancarios;
        this.valorFinal = valorFinal;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Date getDataConfirmacao() {
        return dataConfirmacao;
    }

    public void setDataConfirmacao(Date dataConfirmacao) {
        this.dataConfirmacao = dataConfirmacao;
    }

    public String getDadosBancarios() {
        return dadosBancarios;
    }

    public void setDadosBancarios(String dadosBancarios) {
        this.dadosBancarios = dadosBancarios;
    }

    public BigDecimal getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }
}
