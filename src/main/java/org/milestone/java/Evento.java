package org.milestone.java;
import java.time.LocalDate;

public class Evento {
    private String title;
    private LocalDate insertedDate;
    private int availableSeats;
    private int bookedSeats = 0;
    
    // Constructor
    public Evento(String title, LocalDate insertedDate, int availableSeats) {
        this.title = title;
        validateDate(insertedDate);
        validateSeats(availableSeats);
    }
    
    //Validazione Date e Seats
    private void validateDate(LocalDate date) {
        if (!date.isAfter(LocalDate.now())) {
            System.out.println("Non puoi inserire una data uguale o passata rispetto a quella attuale");
        } else {
            this.insertedDate = date;
        }
    }
    
    private void validateSeats(int seats) {
        if (seats <= 0) {
          System.out.println("Non puoi inserire un numero negativo o uguale a 0");
        } else {
            this.availableSeats = seats;
        }
    }
    
    // Getter Methods
    public String getTitle() {
        return this.title;
    }
    
    public LocalDate getDate() {
        return this.insertedDate;
    }
    
    public void  getAvailableSeats() {
        System.out.println("I posti attualmente disponibili sono : " + this.availableSeats);
    }
    
    public void getBookedSeats() {
        System.out.println("I posti attualmente prenotati sono : " + this.bookedSeats);
    }
    
    // Setter Methods
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    
    public void setDate(LocalDate newDate) {
        validateDate(newDate);
    }
    
    // Class Methods : prenota
    public void prenota() {
        if (insertedDate.isBefore(LocalDate.now())) {
            System.out.println("L'evento è già passato.");
        } else if (bookedSeats >= availableSeats) {
            System.out.println("Non ci sono attualmente posti disponibili.");
        } else {
            bookedSeats++;
            System.out.println("Posto prenotato correttamente, gli attuali posti prenotati sono : " + this.bookedSeats);
        }
    }
    
    public void prenota(int newBookedSeats) {
    	this.bookedSeats+=newBookedSeats;
    }
    
    // Class Methods : disdici
    public void disdici() {
        if (insertedDate.isBefore(LocalDate.now())) {
            System.out.println("L'evento è già passato.");
        } else if (bookedSeats == 0) {
            System.out.println("Non ci sono prenotazioni da disdire.");
        } else {
            bookedSeats--;
            System.out.println("Posto disdetto correttamente, gli attuali posti prenotati sono : " + this.bookedSeats);
        }
    }
    
    public void disdici (int newBookedSeats) {
    	if(bookedSeats<=0) {
    		System.out.println("Non ci sono posti prenotati, non ne puoi disdire.");
    	} else {
    		this.bookedSeats-=newBookedSeats;
    	}
    }
    
    @Override
    public String toString() {
        return insertedDate + " - " + title;
    }
}
