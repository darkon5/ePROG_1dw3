package ebaluaketa3;

import java.io.*;
import java.util.Scanner;

public class IzenAbizenFitxategia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		boolean loop=true;
		boolean getFlag=false;
		boolean queryFlag=false;
		String input="nah";
		String lerroa=null;
		String izenafitx=null;
		String izena;
		boolean badago=false;
		
		File fitxategiairakurri= null;
		FileReader fr = null;
		BufferedReader br = null;
		fitxategiairakurri= new File ("izenak.txt");
		fr = new FileReader(fitxategiairakurri);
		br = new BufferedReader(fr);
		
		FileWriter fitxategia=null;
		PrintWriter pw=null;
		fitxategia = new FileWriter("izenabizenak.txt");
		pw=new PrintWriter(fitxategia);
		Scanner tek=new Scanner (System.in);
		
		while (loop) {

			System.out.println("1) Datuak sartu");
			

			input=tek.nextLine();
			
			if (input.equals("1")){
				getFlag=true;
			}else if(input.equals("2")){
				queryFlag=true;
			}else if(input.equals("0")){
				getFlag=false;
				loop=false;
			}
			
		
			while (queryFlag) {
				System.out.println("Sartu izen edo abizena bilatzeko:");
				input=tek.nextLine();
				while((lerroa=br.readLine())!=null){
					int espazioa=lerroa.indexOf(" ");
					izenafitx=lerroa.substring(0, espazioa);
					
					if (input.equals(izenafitx)){
						
					}
				}
				
				if (input.equals("")){
					queryFlag=false;
				}else{
					pw.println(input);
				}
			}
			
			while (getFlag) {
				System.out.println("Sartu izen-abizenak gordetzeko:");
				input=tek.nextLine();
				if (input.equals("")){
					getFlag=false;
				}else{
					pw.println(input);
				}
			}
		}
		br.close();
		fitxategia.close();
		tek.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
