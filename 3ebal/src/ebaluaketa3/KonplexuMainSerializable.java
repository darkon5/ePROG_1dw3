package ebaluaketa3;

import java.io.*;


public class KonplexuMainSerializable {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//lotura egingo dut
		
		//public class konplexu implements Serializable();
		
		konplexu k=new konplexu(8,2);
		
		try{
			FileOutputStream fos=new FileOutputStream ("konplexuak2.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
				//idatzi fitxategian
			oos.writeObject(k);
			oos.close();
		}catch (IOException ioe) {
			
			//ioe.printStackTrace();
		}
		

		try{
			FileInputStream fis=new FileInputStream ("konplexuak.dat");
			ObjectInputStream ois=new ObjectInputStream (fis);
			//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
			k=(konplexu)ois.readObject(); 
			ois.close();
			}catch (IOException | ClassNotFoundException ioe) {
				//ioe.printStackTrace();
			}
		
		k.konpGetPrint();
		
			//
	}

}
