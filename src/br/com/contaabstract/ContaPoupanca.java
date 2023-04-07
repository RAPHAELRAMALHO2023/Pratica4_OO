package br.com.contaabstract;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

        public void imprimeExtrato () {
            System.out.println("### EXTRATO DA CONTA ###");

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaa HH:mm");

            Date date = new Date();
            System.out.println("Saldo :" +this.getSaldo());
            System.out.println("Data: " + sdf.format(date));

        }

}
