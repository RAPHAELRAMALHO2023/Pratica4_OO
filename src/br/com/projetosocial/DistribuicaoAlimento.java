package br.com.projetosocial;
    public class DistribuicaoAlimento extends Projeto{

        String descAlimento;
        Float qtde;

        public void validaProjeto(Boolean valida){
            if (dataFim != null){
                valida = false;
            }
            else valida = true;
        }
        public void imprimeProjeto(String imprime) {

            System.out.println(nomeProjeto + descricao + dataInico + dataFim + descAlimento + qtde);
        }
    }
