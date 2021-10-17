package Ejercicio2;

import java.io.File;
import java.util.Scanner;



public class Ejercicio22 {
   
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
        System.out.println("introduce el directorio");
        String directorio=sc.nextLine();
    File[] files = new File(directorio).listFiles();
    if (files != null) {
       Dictador(files);
      
    }
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

