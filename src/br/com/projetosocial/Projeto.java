package br.com.projetosocial;

public abstract class Projeto {
    String nomeProjeto;
    String descricao;
    String endereco;
    String dataInico;
    String dataFim;

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDataInico() {
        return dataInico;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataInico(String dataInico) {
        this.dataInico = dataInico;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
    public void validaProjeto(Boolean valida){

    }
    public void imprimeProjeto(String imprime){

    }

    public abstract void validaProjeto();
}
