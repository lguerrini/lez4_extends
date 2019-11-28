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
public class Persona {
  protected String cognome;  
  protected String nome;  
  protected String luogoNascita; 
  protected LocalDate dataNascita; 
  
    public Persona(String cognome, String nome, String luogoNascita, LocalDate dataNascita) {
        this.cognome = cognome;
        this.nome = nome;
        this.luogoNascita = luogoNascita;
        this.dataNascita = dataNascita;
    }
    
    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }
  
  
  
}
