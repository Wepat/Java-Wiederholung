package kapitel_5;

import java.awt.Color;

import Interfaces.Waschbar;

public abstract class Kleidung implements Waschbar {
	
	private Color color;
	private boolean istTrocken;

	public Kleidung() {
		this.istTrocken = true;
		this.color = Color.black;
	}

	public Kleidung(String s) {
		this();
		this.color = stringZuFarbe(s);
	}

	public Kleidung(Color color) {
		this();
		this.color = color;

	}

	public boolean istTrocken() {
		return istTrocken;
	}

	public void trockne() {
		this.istTrocken = true;
	}

	public void wasche() {
		this.istTrocken = false;
		this.color = this.color.brighter();
	}

	public Color getFarbe() {
		return this.color;
	}

	public void setFarbe(String neuefarbe) {
		this.color = stringZuFarbe(neuefarbe);
	}

	public static Color stringZuFarbe(String s) {
		String[] farben = { "rot", "blau", "grün", "gelb" };
		Color[] color = { Color.red, Color.blue, Color.green, Color.yellow };
		Color returncolor = null;

		for (int i = 0; i < farben.length; i++) {
			if (farben[i].equalsIgnoreCase(s.trim())) {
				returncolor = color[i];
				break;
			} else
				returncolor = Color.black;
		}
		return returncolor;
	}
	
	
	
}
