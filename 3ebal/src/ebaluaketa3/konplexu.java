package ebaluaketa3;

import java.io.Serializable;
import java.util.Scanner;

public class konplexu implements Comparable <konplexu>, Serializable {//Comparable <konplexu> {
	
		private static final long serialVersionUID= -1664926408223878238L;

		//atributuak
		private double e;
		private double i;
		private double emaitza;
		private static int z=0;
		private String prefix="knplx~ ";
		//private int silent=0;
		Scanner teklatu=new Scanner(System.in);
		
		//metodoak - konplexu eraikitzailea
		konplexu(){
			e=0;
			i=0;
			System.out.println(prefix+"Konplexu clasea inizializatua izan da daturik gabe!!");
			z++;
		}
		//beste metodoak-eraikitzaileak
		konplexu(double e, double i){
			this.e=e;
			this.i=i;
			z++;
		}
		konplexu(konplexu k){
			this.e=k.e;
			this.i=k.i;
			z++;
		}
		konplexu(konplexu ka,konplexu kb){
			this.e=ka.e+kb.e;
			this.i=ka.i+kb.i;
			z++;			
		}
		
		//funtzioak
		void konpSet(double e, double i){
			this.e=e;
			this.i=i;
			System.out.println(prefix+"Datuak ezarri egin dira: " + this.e + " + " + this.i + "i");
		}	
		void konpMuxMax(konplexu ka, konplexu kb){
			if (ka.e >= kb.e){this.e = ka.e;}else{this.e = kb.e;}
			if (ka.i >= kb.i){this.i = ka.i;}else{this.i = kb.i;}
		}
		double konpKalk(){
			return emaitza;
		}
		
		double konpGet_e(){
			return this.e;
		}
		double konpGet_i(){
			return this.i;
		}
		void konpGetPrint(){
			System.out.println(prefix+this.e + " + " + this.i + "i");
		}
		void konpGetZenbat(){
			System.out.print(prefix+z);
		}
		
		@Override
		public int hashCode(){
		final int prime=31;
		int result=1;
		long temp;
		temp=Double.doubleToLongBits(this.i);
		result=prime*result+(int)(temp>>>32);
		temp=Double.doubleToLongBits(this.e);
		result=prime*result+(int)(temp>>>32);
		return result;
		}
		
		
		@Override
		public int compareTo(konplexu k){
		if (this.e>k.e){
		return 1;
		}
		else if (e<k.e){
		return -1;
		}
		else {
		if (i>k.i){
		return 1;
		}
		else {
		if (i<k.i){
		return -1;
		}else{
		return 0;
		}
		}
		}
		}
		
		
		
}
