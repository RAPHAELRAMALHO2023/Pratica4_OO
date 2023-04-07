package br.com.projetosocial;

public class TrabalhoVoluntario {

    private float nomProjeto, descricao, datainicio, datafim,tipoTrabalho,duracaoTrabalho;


    public void validaProjeto(Boolean valida){
        if (duracaoTrabalho > 2){
            valida = false;
        }
        else valida = true;
    }
    public void imprimeProjeto(String imprime) {

        System.out.println(nomProjeto+ descricao+datainicio+datafim+tipoTrabalho+duracaoTrabalho);
    }
}