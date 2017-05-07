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
public class Empleado extends Persona{
     float salario;
     Date fecha_entrada;

    public Empleado() {
        
        this.salario = salario;
        this.fecha_entrada = fecha_entrada;
    }

    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }   
}
