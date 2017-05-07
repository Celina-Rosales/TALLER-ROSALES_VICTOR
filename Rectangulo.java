/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleroop;

/**
 *
 * @author Celi
 */
public class Rectangulo {
    double altura;
    double ancho;

    public Rectangulo() {
        this.altura = 1.00d;
        this.ancho = 1.00d;
    }

    public Rectangulo(double altura,double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }
    
    public double getArea(){
        return ancho * altura;
    }
    
    public double getPerimetro(){
        return 2 * ancho + altura * 2;
    }
    
    public static void main(String [] args){
        Rectangulo rect = new Rectangulo();
        rect.getArea();
        rect.getPerimetro();
    }
}

