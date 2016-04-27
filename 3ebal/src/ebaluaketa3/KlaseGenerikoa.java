package ebaluaketa3;

public class KlaseGenerikoa<T> {
	
	T baliogenerikoa;
	
	KlaseGenerikoa(T balioa){ 
		baliogenerikoa = balioa; 
	} 
	
	public void idatzi() { 
		System.out.println("Balioaren edukina " + baliogenerikoa + " da"); 
	} 
}
