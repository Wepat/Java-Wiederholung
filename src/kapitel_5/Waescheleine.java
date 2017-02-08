package kapitel_5;
import static java.lang.System.out;

public class Waescheleine {
	private final int MAX = 10;
	
	private Kleidung[] waescheleine;
	
	public Waescheleine(){
		waescheleine = new Kleidung[MAX];
	}
	
	public void add(Kleidung kleidung) throws ZuVielAufgehangenException{
		
		for(int i = 0; i < MAX; i++){
			if(waescheleine[i] == null){		
				try {
					waescheleine[i] = kleidung;
					break;
				} catch (ZuVielAufgehangenException e) {
					out.println(e);
					break;
				}
			}
		}
	}
	
	public Kleidung getKleidung(int index){
		return waescheleine[index];
	}
	
	public int length(){
		return waescheleine.length;
	}
	
	public void trockne(){
		for(int i = 0; i < MAX; i++)	{
			if(waescheleine[i] != null){
				waescheleine[i].trockne();
			}
		}
	}
}
