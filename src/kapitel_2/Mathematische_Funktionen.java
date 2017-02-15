package kapitel_2;

public class Mathematische_Funktionen {
	
	public long getMin(long z1, long z2, long z3){
		long dingdong = Math.min(z1, z2);
		
		return (dingdong > z3)? z3 : dingdong;
	}
}