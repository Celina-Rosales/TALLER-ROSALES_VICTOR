/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleroop;

import java.util.Date;

/**
 *
 * @author Celi
 */
public class Cuenta {
    
    private int id;
    private double saldo;
    private double interes_anual;
    private Date fecha;
   

   
    public Cuenta() {
        this.id = 0;
        this.saldo = 0;
        this.interes_anual = 0;
    }

    public Cuenta(int id, double saldo) {
        this.id = 14;
        this.saldo = 120;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public double getinteres_mensual (){
        return saldo * id * 12 /100 *365;
    }
    
    public double retiro(double retiro){
        return saldo = saldo - retiro;
    }
    
     public double deposito(double deposito){
        return saldo = saldo + deposito;
    }
   
    
    public static void main (String[]args){
        Cuenta cta = new Cuenta();
        cta.getinteres_mensual();
        cta.retiro(10);
        cta.deposito(50);
        cta.getinteres_mensual();
    }
}

