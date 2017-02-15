package kapitel_5_2;

import java.awt.Color;

public class Hose extends Kleidung {
	
	private int waschzeit;
	
	public Hose() {
		super();
	}

	public Hose(String farbe) {
		super(farbe);
	}

	public Hose(Color color) {
		super(color);
	}
	
	@Override
	public void trockne(){
		super.trockne();
		System.out.println("Die Kleidung wurde getrocknet");
	}
	
	public int getWaschzeit(){
		return this.waschzeit;
	}
	
	public String toString(){
		String ausgabe = "";
		ausgabe += "Die Socke hat die Farbe: " + super.getFarbe() + "\n";
		ausgabe += "Sie ist ";
		
		if(super.istTrocken()){
			ausgabe += "trocken";
		}else ausgabe += "nass";
		
		ausgabe += "Sie hat die Waschzeit: " + getWaschzeit() + " Minuten";
		
		return ausgabe;
	}

	@Override
	public void setzeWaschzeit(int waschzeit) {
		this.waschzeit = waschzeit;
	}
}
