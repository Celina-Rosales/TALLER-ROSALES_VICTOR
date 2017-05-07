/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleroop;

import java.util.Scanner;

/**
 *
 * @author Celi
 */
public class Estudiante extends  Persona{
     Scanner leer = new Scanner(System.in);
     protected String Status;

    public Estudiante() {
        this.Status = "";
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    void status(){
        System.out.println("INGRESE EL SEMESTRE DEL ESTUDIANTE: ");
        Status = leer.next();
    }
}
