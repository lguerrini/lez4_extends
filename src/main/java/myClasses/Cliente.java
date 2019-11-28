/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

import java.time.LocalDate;

/**
 *
 * @author tss
 */
public class Cliente extends Persona{
    private int codcliente;

    
    public Cliente(String cognome, String nome, String luogoNascita, 
            LocalDate dataNascita,int codcliente) 
    {
        super(cognome, nome, luogoNascita, dataNascita);
        this.codcliente=codcliente;
        //this.cognome="zczc"; //protected
        
    }
    public String getInfo() {
        
        return "Cliente: "+getCognome()+ " "+ getNome()+" cod cli :" +codcliente;
    }
    public int getCodcliente() {
        return codcliente;
    }
}

