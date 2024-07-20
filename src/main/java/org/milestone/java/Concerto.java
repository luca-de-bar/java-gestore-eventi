package org.milestone.java;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {
	
	private LocalTime ora;
	private double prezzo;

	public Concerto(String title, LocalDate insertedDate, int availableSeats, LocalTime ora, double prezzo) {
		super(title, insertedDate, availableSeats);
		this.ora = ora;
		this.prezzo = prezzo;
	}
	
	//Getter Methods
	public LocalTime getOra() {
		return this.ora;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	//Setter Methods
	public void setOra(LocalTime newOra) {
		this.ora = newOra;
	}
	
	public void setPrezzo(double newPrice) {
		this.prezzo = newPrice;
	}
	
	//Class Methods
	public String decimalFormatter (double decimalToFormat) {
		DecimalFormat decfor = new DecimalFormat("0.00");
		return decfor.format(decimalToFormat);
	}
	
	
	@Override
	public String toString() {
		return "La data del concerto è " + this.getDate() + " " + this.ora + " - " + this.getTitle() + " Il prezzo è di " + decimalFormatter(this.prezzo) + "€";
	}
}
