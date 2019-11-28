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
public class Commesso extends Persona{
    private int matricola;

    
    public Commesso(String cognome, String nome, String luogoNascita, 
            LocalDate dataNascita,int matricola) 
    {
        super(cognome, nome, luogoNascita, dataNascita);
        this.matricola=matricola;
        this.cognome="zczc"; //protected
        this.nome="wsefwsfwfe";
        
    }
    public String getInfo() {
        return "Commesso: "+getCognome()+ " "+ getNome()+" matricola :" +matricola;
    }
    public int getMatricola() {
        return matricola;
    }
}
