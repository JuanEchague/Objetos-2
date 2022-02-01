/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Circunferencia {

    ////////////////Atributos/////////////////////////////////////////////////
    private double radio;

    //////////////////////Builders///////////////////////////////////////
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /////////////////////////////////////
    public Circunferencia() {
    }

    ////////////Getters and Setters//////////////////////////////////////////
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /////////////////////Metodos/////////////////////////////////////////
    public void crearCircurferencia() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio de la circunferrencia: ");
        this.radio = read.nextDouble();
    }

    public void calcularArea() {
        System.out.printf("El area de la circunferencia es: %.2f\n", Math.PI * Math.pow(radio, 2));

    }

    public void calcularPerimetro() {
        System.out.printf("El perimetro de la circunferencia es: %.2f\n", 2 * Math.PI * radio);

    }
}
