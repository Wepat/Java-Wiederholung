package app;

import java.awt.Color;

import kapitel_5.Kleidung;
import kapitel_5.Socke;
import kapitel_5.Waescheleine;

public class App {

	public static void main(String[] args) {
		Socke s1 = new Socke("rot");
		Socke s2 = new Socke(Color.blue);
		Kleidung s3 = new Socke();
		Kleidung s4 = new Socke("grün");
		Socke s5 = new Socke ();
		Waescheleine waescheleine = new Waescheleine();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
		
		s1.wasche();
		s2.wasche();
		s3.wasche();
		s4.wasche();
		s5.wasche();
		
		waescheleine.add(s1);
		waescheleine.add(s2);
		waescheleine.add(s3);
		waescheleine.add(s4);
		waescheleine.add(s5);
		
		waescheleine.trockne();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		System.out.println(s5.toString());
	}

}
