package Interview;

public class Test2 {
	public static void main(String args []) {
		String h= "a,b,c,d,e,f,g";
		String [] hh=h.split(",");
		for(int i =0; i<hh.length; i++) {
			System.out.print(hh[i]+1+",");
		}
	}
}
