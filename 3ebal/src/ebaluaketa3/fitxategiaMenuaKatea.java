package ebaluaketa3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class fitxategiaMenuaKatea {

	public static void main(String[] args) {
		boolean menu=true;
		int selection;
		int hashFileIn,hashFileOut;
		String input=null;
		
		ArrayList<String> list = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("ARRAYLIST.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	list.add(line);
		    }
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		hashFileIn=list.hashCode();
		
		Scanner tek=new Scanner (System.in);

		System.out.println("kaixo o/");
		
		while (menu){

			System.out.println();
			System.out.println("1.- Gehitu katea");
			System.out.println("2.- Bilatu katea");
			System.out.println("3.- Ezabatu katea");
			System.out.println("0.- Irten");
			System.out.println();
			System.out.print(">");
			
			selection=tek.nextInt();
			
			switch (selection){
				case 1:
					tek.nextLine();
					System.out.println();
					System.out.println("Sartu sarrera berria:");
					input=tek.nextLine();
					list.add(input);
					break;
				case 2:
					tek.nextLine();
					System.out.println();
					System.out.println("Bilaketa:");
					System.out.print(">");
					input=tek.nextLine();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).contains(input)){
							System.out.println("("+ (i+1) + " pos)"+"	>"+list.get(i) );
						}
						
					}
					break;
				case 3:
					tek.nextLine();
					System.out.println();
					System.out.println("Ezabatu:");
					System.out.print(">");
					input=tek.nextLine();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).equals(input)){
							list.remove(i);
						}
						break;
					}
					break;
				case 0:
					menu=false;
					break;
			}
			
		}

		System.out.println();
		
		hashFileOut=list.hashCode();
		if (hashFileIn==hashFileOut){
			System.out.println("Matched! Not saving...");
		}else{
			System.out.println("Mismatch detected, saving...");
			
		try{FileWriter fitxategia=null;
			PrintWriter pw=null;
			fitxategia = new FileWriter("ARRAYLIST.txt");
			pw=new PrintWriter(fitxategia);
			for (int i = 0; i < list.size(); i++) {
				pw.println(list.get(i));
			}
							
			fitxategia.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		System.out.println("Saved file! Terminating...");
		
		tek.close();

	}

}
