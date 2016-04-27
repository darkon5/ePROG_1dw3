package ebaluaketa3;
import java.io.*;
import java.util.Random;

public class BinarioGordeIrakurri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		try{			
		FileOutputStream fileoutput = new FileOutputStream("proba.bin");
		BufferedOutputStream bufferedoutput = new BufferedOutputStream(fileoutput);
		
		byte[] datuak = new byte[8];
		//datuak[0]=69;
		for(int i=0;i<8;i++){
			int n = rand.nextInt(89)+10;
			datuak[i]=(byte)n;
		}
		//new byte[8];*/
		bufferedoutput.write(datuak);
		bufferedoutput.close();
				
		FileInputStream fileinput = new FileInputStream("proba.bin");
		BufferedInputStream bufferedinput = new BufferedInputStream(fileinput);
		
		//byte[] datuak = new byte[8];
		bufferedinput.read(datuak);
		System.out.println("> Zenbaki aleatorioak!! \\o/");
		for(int i=0;i<8;i++){
			System.out.println(datuak[i]);
		}
		
		bufferedinput.close();
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
