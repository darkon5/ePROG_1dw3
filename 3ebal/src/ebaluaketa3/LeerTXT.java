package ebaluaketa3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerTXT {

	public static void main(String[] args) {

		Scanner tek=new Scanner (System.in);
		
		try (BufferedReader br = new BufferedReader(new FileReader("conv.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	System.out.println(line);
		    }
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		try{FileWriter fitxategia=null;
			PrintWriter pw=null;
			String input;
			fitxategia = new FileWriter("pruebax.txt");
			pw=new PrintWriter(fitxategia);
			
				System.out.println("Sartu izen bat gordetzeko:");
				input=tek.nextLine();
				pw.println(input);
							
			fitxategia.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

		tek.close();

	}

}
