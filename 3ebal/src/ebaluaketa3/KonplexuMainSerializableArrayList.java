package ebaluaketa3;

import java.io.*;
import java.util.ArrayList;

public class KonplexuMainSerializableArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<konplexu> list=new ArrayList<konplexu>();


		konplexu k_loaded=new konplexu();
		
		
		konplexu k1=new konplexu(1,2);
		konplexu k2=new konplexu(3,4);
		konplexu k3=new konplexu(5,6);
		konplexu k4=new konplexu(7,8);
		konplexu k5=new konplexu(9,0);

		list.add(k1);
		list.add(k2);
		list.add(k3);
		list.add(k4);
		list.add(k5);
		
		
		try{
			FileOutputStream fos=new FileOutputStream ("konplexuak.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
				//idatzi fitxategian
			oos.writeObject(list);
			oos.close();
		}catch (IOException ioe) {
			
			//ioe.printStackTrace();
		}
		

		try{
			FileInputStream fis=new FileInputStream ("konplexuak.dat");
			ObjectInputStream ois=new ObjectInputStream (fis);
			//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
			list=(ArrayList<konplexu>)ois.readObject(); 
			ois.close();
			}catch (IOException | ClassNotFoundException ioe) {
				//ioe.printStackTrace();
			}
		
		for (int i = 0; i < list.size(); i++) {
			k_loaded=list.get(i);
			k_loaded.konpGetPrint();
		}
		
		k_loaded.konpGetPrint();
		
	}

}
