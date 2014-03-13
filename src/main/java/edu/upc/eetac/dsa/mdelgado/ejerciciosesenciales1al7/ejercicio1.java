package edu.upc.eetac.dsa.mdelgado.ejerciciosesenciales1al7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;
import java.util.Date;


public class ejercicio1 {
	public static void main( String[] args ) throws IOException, BigNumberException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca la ruta del archivo:\n");
		//String sTexto = br.readLine();
		String ruta1 = "c:/Users/Miki/Desktop/texto3.txt\n";
		System.out.println("c:/Users/Miki/Desktop/texto3.txt\n");
		File f = new File("C:\\Users/Miki/Desktop/texto3.txt");
		
		System.out.println("Introduzca la ruta del archivo de imagen:\n");
		String ruta2 = "C:\\Users/Miki/Desktop/registro.txt";
		System.out.println("c:/Users/Miki/Desktop/imagen.jpg\n");
		File f2 = new File("C:\\Users/Miki/Desktop/imagen.jpg");
    	BufferedReader entrada;
    	int contadorcaracteres = 0;
    	int contadorbytes = 0;
    	String registro = "";
    	int cont1=0;
    	int cont2=0;
    	int numero1=0;
    	int numero2=0;

    	try {
    	
    		entrada = new BufferedReader( new FileReader(f) );
    		String linea;
    			while(entrada.ready()){
    				linea = entrada.readLine();
    				
    				//Codigo ejercicio 1-2-3  
    				
    				//Integer numero = Integer.valueOf(linea);
    		    	//if (numero>=1000){
    		    	//	System.out.println("El archivo contiene un numero demasiado grande " + "\n");
    		    	//	throw new BigNumberException();	
    		    	//	e.printStackTrace();
    				//	}
    				//	System.out.println(numero);
    				
    				//Codigo 4-5-6-7
    				
    				//Codigo contar bytes
    				
    				contadorcaracteres = contadorcaracteres + linea.length();
    			}
    			
    			//Codigo escritura registro.txt
    			File archivo=new File("C:\\Users/Miki/Desktop/registro.txt");
    			archivo.delete();
        		FileWriter escribir=new FileWriter(archivo,true);
            	BufferedWriter bw = new BufferedWriter(escribir); 
        		
        		registro = "Caracteres: ";
        		escribir.write(registro);
        		bw.newLine();
        		bw.flush();
        		registro = Integer.toString(contadorcaracteres);
        		escribir.write(registro);
        		bw.newLine();
        		bw.flush();
        		registro = " - Ruta: " + ruta1;
        		escribir.write(registro);
        		bw.newLine();
        		bw.flush();
        		Date fecha1 = new Date();
        		registro = " - Fecha: " + fecha1;
        		escribir.write(registro);
        		bw.newLine();
        		bw.flush();
        		bw.newLine();
        		bw.flush();
        		
        		long contb = f2.length();
        		String contb2 = Long.toString(contb);
        		contadorbytes = Integer.valueOf(contb2);
        		
        		registro = "Contador bytes: ";
        		escribir.write(registro);
        		bw.newLine();
        		bw.flush();
        		registro = Integer.toString(contadorbytes);
        		escribir.write(registro);
        		bw.newLine();
        		bw.flush();
        		registro = " - Ruta: " + ruta2;
        		escribir.write(registro);
        		bw.newLine();
        		bw.flush();
        		Date fecha2 = new Date();
        		registro = " - Fecha: " + fecha2;
        		escribir.write(registro);
        		bw.newLine();
        		bw.flush();
        		bw.newLine();
        		bw.flush();
        		
        		escribir.close();	
        		
        		//Codigo lectura + comparacon
        		File f3 = new File("C:\\Users/Miki/Desktop/registro.txt");
        		entrada = new BufferedReader( new FileReader(f3) );
        		while(entrada.ready()){
        			linea = entrada.readLine();

        			if (cont1==1){
        				numero1 = Integer.valueOf(linea);
        				System.out.println("Numero 1: "+ numero1);
        				cont1=0;
        			}
        			if (linea.equals("Caracteres: ")){
        				cont1=1;	
        			}
        			if (cont2==1){
        				numero2 = Integer.valueOf(linea);
        				System.out.println("Numero 2: "+ numero2);
        				cont2=0;
        			}
        			if (linea.equals("Contador bytes: ")){
            			cont2=1;	
        			}
        		}
        		String ruta ="";
        		if (numero1 > numero2){
        			ruta = ruta1;
        		}
        		if (numero2 > numero1){
        			ruta = ruta2;
        		}

        		System.out.println("El archivo mas grande es: "+ ruta + "\n");
    		}
    	
    	catch (FileNotFoundException e){
    		System.out.println("El archivo no se puede encontrar: " + e.getMessage() + "\n");
    		e.printStackTrace();
    	}
    	
    	catch (IOException e) {
    		System.out.println("El fichero no es valido: " + e.getMessage() + "\n");
    		e.printStackTrace();
    		}
    	
    	catch (NumberFormatException e){
    		System.out.println("El archivo contiene caracteres que no son numericos: " + e.getMessage() + "\n");
    		e.printStackTrace();
    	}
    	
    	finally{
    		System.out.println("Caracteres contados: " + contadorcaracteres);
    		System.out.println("Longitud del archivo de imagen: " + contadorbytes );
    		System.out.println("Guardando en: C:\\Users/Miki/Desktop/registro1.txt");
    		System.out.println("Cerrando");
    		br.close();
    	}
    	
    }
}
