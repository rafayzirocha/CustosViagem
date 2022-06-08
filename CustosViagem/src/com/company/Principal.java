package com.company;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {

        Percurso perc = new Percurso(0.0,0.0,0.0);
        Custo custos = new Custo(0.0);

        int op;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite: \n1 - CADASTRAR PERCURSO \n2 - LISTAR PERCURSO \n3 - CALCULAR VIAGEM \n0 - Sair"));

            switch (op){
                case 1:
                    perc.cadastarPercurso();
                    break;
                case 2:
                    perc.listarPercurso();
                    break;
                case 3:
                    custos.calcularViagem(perc);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(
                            null, "Finalizando o programa..." );
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null, "Opção Inválida..." );
                    break;
            }
        }
        while(op!=0);
    }
}
