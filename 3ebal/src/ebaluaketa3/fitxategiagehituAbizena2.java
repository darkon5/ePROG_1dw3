package ebaluaketa3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fitxategiagehituAbizena2 {

	public static void main(String[] args) {
		
		String name;
		String surname;
		String surname2;
		String fullnameNew;

		Scanner tek=new Scanner (System.in);
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader("izenak.txt"))) {
		    String line;
		    

			FileWriter fitxategia=null;
			PrintWriter pw=null;
			fitxategia = new FileWriter("IzenAbizenak.txt");
			pw=new PrintWriter(fitxategia);
			
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	System.out.println(line);
				int espazioa=line.indexOf(" ");
				name=line.substring(0, espazioa);
		    	System.out.println(name);
		    	surname=line.substring(espazioa+1);
		    	System.out.println(surname);
		    	System.out.println("Abizen berria:");
		    	surname2=tek.nextLine();
		    	fullnameNew=name + " " + surname + " " + surname2;
		    	

		    	System.out.println("Izen berria: " +fullnameNew+".");
		    	
				pw.println(fullnameNew);

		    	
		    }

			fitxategia.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		tek.close();

	}

}
