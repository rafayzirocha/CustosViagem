package com.company;

import javax.swing.*;

public class Custo {
    //atributos
    private double totalPercurso;

    //construtor
    public Custo(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    //metodos de acesso
    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public void calcularViagem(Percurso p) {
        this.totalPercurso = p.getKmPercorrido() / 12 * p.getValorCombustivel() + p.getValorPedagio();
        JOptionPane.showMessageDialog(null,"Total gasto na Viagem"
                +this.totalPercurso);
    }
}
