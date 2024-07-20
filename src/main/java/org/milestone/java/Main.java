package org.milestone.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //Inizializzo scanner
        Scanner sc = new Scanner(System.in);
        // Creo nuova istanza di Evento
        LocalDate insertedDate = LocalDate.of(2024, 7, 29);
        Evento festa = new Evento("Festa di compleanno", insertedDate, 900);
        
        String userInput;
        int daPrenotareODisdire;
        
      //Prenotazione posti evento
        System.out.println("Vuoi prenotare posti per l'evento?");
        userInput = sc.nextLine().toLowerCase();
        
        if (userInput.equals("si")) {
            System.out.println("Quanti posti vuoi prenotare?");
            daPrenotareODisdire = sc.nextInt();
            
            if (daPrenotareODisdire <= 0) {
                System.out.println("Spiacente non puoi prenotare posti vuoti");
            } else {
                festa.prenota(daPrenotareODisdire);
                System.out.println("Prenotazione avvenuta con successo!");
            }
        } else if (userInput.equals("no")) {
            System.out.println("Va bene! arrivederci");
        } else {
            System.out.println("Non ho capito, puoi riscrivere?");
        }
                 
        //Disdici posti evento
        System.out.println("Vuoi disdire posti per l'evento?");
        userInput = sc.nextLine().toLowerCase();
        
        if(userInput.equals("si")) {
        	System.out.println("Quanti posti vuoi disdire?");
        	daPrenotareODisdire = sc.nextInt();
        	
        	if(daPrenotareODisdire <=0) {
        		System.out.println("Hai disdetto 0 posti, riprova.");
        	} else {
        		festa.disdici(daPrenotareODisdire);
        		System.out.println("Hai disdetto all'evento con successo");
        	}
        } else if (userInput.equals("no")) {
        	System.out.println("Hai deciso di non disdire alcun posto.");
        } else {
        	System.out.println("Non ho capito, puoi riscrivere?");
        }
        
        festa.getAvailableSeats();
        festa.getBookedSeats();
        sc.close();
        
        
        /*
         * Step 3
         */
        
        LocalTime concertoTime = LocalTime.of(15,30);
        LocalDate concertoDate = LocalDate.of(2024, 9, 12);
        Concerto drake = new Concerto("Concerto Drake", concertoDate, 900, concertoTime , 2300d);
        
        System.out.println(drake);
        
        
        
        /*
         * Step 4 BONUS
         */
        
        // Creo istanza di ProgrammaEventi
        ProgrammaEventi programma = new ProgrammaEventi("Programma Eventi 2024");
        
        // Creare alcuni eventi
        Evento evento1 = new Evento("Concerto Rock", LocalDate.of(2024, 7, 21),90);
        Evento evento2 = new Evento("Mostra d'Arte", LocalDate.of(2024, 7, 21),90);
        Evento evento3 = new Evento("Festival del Cinema", LocalDate.of(2024, 7, 21),90);
        
        // Aggiungere eventi al programma
        programma.aggiuntiEvento(evento1);
        programma.aggiuntiEvento(evento2);
        programma.aggiuntiEvento(evento3);
        
        // Stampare il numero di eventi
        programma.numeroEventi();
        
        // Stampare eventi in una certa data
        System.out.println("Eventi il 20 Luglio 2024:");
        programma.eventiInData(LocalDate.of(2024, 7, 21));
        
        // Rimuovere tutti gli eventi
        programma.rimuoviEventi();
        
        // Stampare il numero di eventi dopo la rimozione
        programma.numeroEventi();
        
        
        
    }
}
