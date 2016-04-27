package ebaluaketa3;
import java.io.*;
import java.util.Scanner;

public class IzenFitxategia {

	public static void main(String[] args) {
		try{
		boolean keepo=true;
		String input="nah";
		
		FileWriter fitxategia=null;
		PrintWriter pw=null;
		fitxategia = new FileWriter("prueba.txt");
		pw=new PrintWriter(fitxategia);
		
		Scanner tek=new Scanner (System.in);
		
		while (keepo) {
			System.out.println("Sartu izen bat gordetzeko:");
			input=tek.nextLine();
			if (input.equals("")){
				keepo=false;
			}else{
				pw.println(input);
			}
		}
		
		fitxategia.close();
		tek.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

}
	
}
