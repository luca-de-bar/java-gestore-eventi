package org.milestone.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammaEventi {
    private String titolo;
    private List<Evento> eventi;
    
    // Costruttore 
    public ProgrammaEventi(String titolo) {
        this.titolo = titolo;
        this.eventi = new ArrayList<>();
    }
    
    /*
     * Class Methods
     */
    
    // Aggiungi evento
    public void aggiuntiEvento(Evento newEvento) {
        eventi.add(newEvento);
    }
    
    // Eventi presenti in una certa data
    public void eventiInData(LocalDate dataEvento) {
        for (Evento evento : eventi) {
        	if(evento.getDate() != null) {
                if (evento.getDate().equals(dataEvento)) {
                    System.out.println(evento.getTitle() + " " + evento.getDate());
                }
        	}
        }
    }
    
    // Numero eventi in lista
    public void numeroEventi() {
        int count = eventi.size();
        System.out.println("Ci sono attualmente: " + count + " eventi.");
    }
    
    // Rimuovi tutti eventi
    public void rimuoviEventi() {
        eventi.clear();
    }
}
