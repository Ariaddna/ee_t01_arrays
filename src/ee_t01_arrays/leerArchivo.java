package ee_t01_arrays;



	import java.io.*;
	import javax.swing.*;
	public class leerArchivo   {
	    String l;
	    String arr[];
	    int n[];
	    public void archivo(String nombre){
	       
	        try{
	            FileReader fr = new FileReader(nombre);
	            BufferedReader br = new BufferedReader(fr);
	            l=br.readLine();
	            while(l!=null){
	                   System.out.println(l);
	                   arr=l.split("");
	                   l=br.readLine();
	            }
	            
	            
	            n=new int[arr.length];
	            
	        }
	        
	        catch(FileNotFoundException f){
	            JOptionPane.showMessageDialog(null,"Exception "+f);
	        
	        }catch(IOException i){
	        
	        	JOptionPane.showMessageDialog(null,"Exception "+i);
	        
	        }
	    }

	
	
	
	
	
	public void ordenar(){
        int tempo;
        for(int i=0; i<n.length; i++){
            n[i]=Integer.parseInt(arr[i]);
            for(int j=0; j<n.length; j++){
                if(n[i]>n[j]){
                    tempo=n[i];
                    n[i]=n[j];
                    n[j]=tempo;
                }
            }
        }
    }
    public void mostrar(){
        for(int i=0; i<n.length; i++){
            System.out.println(n[i]);
        }
    }
    
	}


