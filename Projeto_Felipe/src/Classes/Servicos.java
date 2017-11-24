/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author caue
 */
public class Servicos {
    
    private int numeroOrdem;
    private String cpf;
    private int codigoFuncionario;
    private String placaCarro;
    private String estado;
    private String descricao;
    private String dataServico;
    private double maoDeObra;
    private double valorTotal;

    /**
     * @return the numeroOrdem
     */
    public int getNumeroOrdem() {
        return numeroOrdem;
    }

    /**
     * @param numeroOrdem the numeroOrdem to set
     */
    public void setNumeroOrdem(int numeroOrdem) {
        this.numeroOrdem = numeroOrdem;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the codigoFuncionario
     */
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    /**
     * @param codigoFuncionario the codigoFuncionario to set
     */
    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    /**
     * @return the placaCarro
     */
    public String getPlacaCarro() {
        return placaCarro;
    }

    /**
     * @param placaCarro the placaCarro to set
     */
    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataServico
     */
    public String getDataServico() {
        return dataServico;
    }

    /**
     * @param dataServico the dataServico to set
     */
    public void setDataServico(String dataServico) {
        this.dataServico = dataServico;
    }

    /**
     * @return the maoDeObra
     */
    public double getMaoDeObra() {
        return maoDeObra;
    }

    /**
     * @param maoDeObra the maoDeObra to set
     */
    public void setMaoDeObra(double maoDeObra) {
        this.maoDeObra = maoDeObra;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

