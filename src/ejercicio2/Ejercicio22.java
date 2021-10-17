package Ejercicio2;

import java.io.File;



public class Ejercicio22 {
   
    public static void main(String[] args) {
        
    
    File[] files = new File("C:\\Users\\carlo\\Documents\\NetBeansProjects"
            + "\\Ejercicio2\\src\\ejercicio2\\Ejercicio21.java").listFiles();
    if (files != null) 
       Dictador(files);
}

public static void Dictador(File[] files) {
    for (File file : files) 
        
        if (file.isDirectory()) {
            Dictador(file.listFiles());
             System.out.println("archivo----> " + file.getName());
        }  else if(file.isFile()) {
            System.out.println("Carpeta------>"+file.getName());
        }
    }

}

