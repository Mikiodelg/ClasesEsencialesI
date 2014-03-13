package edu.upc.eetac.dsa.mdelgado.ejerciciosesenciales1al7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ejercicio7 {
	

	
	public static void main( String[] args ) throws IOException
    {
		Dato d1 = new Dato();
		Dato d2= new Dato();
		
		d1.Cdato='c';
		d1.Idato=2;
		d1.Sdato="String";
		
		ByteArrayOutputStream bs= new ByteArrayOutputStream();
		ObjectOutputStream os = new ObjectOutputStream (bs);
		os.writeObject(d1);
		os.close();
		byte[] bytes =  bs.toByteArray();
		
		ByteArrayInputStream bs2= new ByteArrayInputStream(bytes); // bytes es el byte[]
		ObjectInputStream is = new ObjectInputStream(bs2);
		try {
			d2 = (Dato)is.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		is.close();
		
		System.out.println("Char: " + d2.Cdato + "\nInt: " + d2.Idato + "\nStr: " + d2.Sdato);
		
	}
}
