package ebaluaketa3;

public class KontadoreGenerikoa<T> {
	T generikoa;
	private int kontadorea=0;
	
	public KontadoreGenerikoa(){
		kontadorea=0;
	}
	
	public KontadoreGenerikoa(int a){
		kontadorea=a;
	}
	
	public KontadoreGenerikoa(KontadoreGenerikoa<T> a){
		kontadorea=a.kontadorea;
	}

	public int getKontadorea() {
		return kontadorea;
	}

	public void setKontadorea(int kontadorea) {
		this.kontadorea = kontadorea;
	}
	
	public String toString(){
		return "Balioa: " + generikoa + ", Kontadorea: " + kontadorea;
	}
	
	

}
