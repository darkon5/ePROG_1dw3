package ebaluaketa3;

public class KlaseGenerikoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//klase generikoaren funtzionamendua konprobatzen du
		int i=5;
		double d=3.14;
		String s="Kaixo mundua";
		//IdatziGenerikoa objektu bat eratuko du
		IdatziGenerikoa ig=new IdatziGenerikoa();
		//Integer
		ig.idatzi(i);
		//Double
		ig.idatzi(d);
		//String
		ig.idatzi(s);
	}

}
