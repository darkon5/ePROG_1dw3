package ebaluaketa3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class fitxategiakopia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tek=new Scanner (System.in);
		String source;
		String copy;
		boolean err=false;

		System.out.println("Nondik? (adb. izenak.txt)");
		source=tek.nextLine();
		System.out.println("Nora? (adb. copy.txt)");
		copy=tek.nextLine();
		System.out.println();
		System.out.println("Kopia egiten... Fitxategiaren data:");
		
		try (BufferedReader br = new BufferedReader(new FileReader(source))) {
		    String line;
		    
		    FileWriter fitxategia=null;
			PrintWriter pw=null;
			
			try {				
				fitxategia = new FileWriter(copy);
				pw=new PrintWriter(fitxategia);	    
			} catch (IOException ioe) {
				//ioe.printStackTrace();
				System.out.println("ERROR>errorea idazten fitxategia");
				err=true; //jakiteko errore bat gertatu dela, eta idazterakoan gertatu dela
				br.close();				
			}
			
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	System.out.println("> " + line);
		    	
				pw.println(line);
		    }

			fitxategia.close();

			System.out.println();
			System.out.println("Kopia eginda!! Gordeta " + copy);
		} catch (IOException ioe) {
			//ioe.printStackTrace();
			if (!err){System.out.println("ERROR>errorea irakurtzen fitxategia");}
		}
		

		tek.close();

	}

}
