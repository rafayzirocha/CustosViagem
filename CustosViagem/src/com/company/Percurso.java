package com.company;

import javax.swing.*;

public class Percurso {
    // atributos
    private  double kmPercorrido;
    private double valorCombustivel;
    private double valorPedagio;

    //construtor
    public Percurso(double kmPercorrido, double valorCombustivel, double valorPedagio) {
        this.kmPercorrido = kmPercorrido;
        this.valorCombustivel = valorCombustivel;
        this.valorPedagio = valorPedagio;
    }

    //metodos de acesso
    public double getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(double kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }
    public void cadastarPercurso(){
        this.kmPercorrido = Double.parseDouble(JOptionPane.showInputDialog("Digite o Km percorrido: "));
        this.valorCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Combustível: "));
        this.valorPedagio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pedágio: "));
    }

    public void listarPercurso(){
        JOptionPane.showMessageDialog(null,"Km Percorrido: "
                + this.kmPercorrido +"\nValor do Combustível:"
                +this.valorCombustivel +"\nValor do Pedágio: "+this.valorPedagio);
    }
}