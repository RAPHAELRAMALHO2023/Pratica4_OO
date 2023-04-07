package br.com.contabancariainterface;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanne
 */
public class GeradorDeExtratos{
    public void geradorConta(Conta conta){
        System.out.println("Saldo Atual: " + conta.getSaldo());
    }

}