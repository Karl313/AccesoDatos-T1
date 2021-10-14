package Ejercicio2; 

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** @author CFGS  */

public class Ejercicio21 { 

    public static void main(String[] args) { 
String ruta1 = "c:\\ficheros";
File ruta= new File(ruta1);
File f = new File("c:\\ficheros\\datos.txt");

if(!ruta.exists()){
    try {
        ruta.mkdir();
        f.createNewFile();  
        System.out.println("la ruta no estaba y ha sido creada junto al fichero");
    } catch (IOException ex) {
        Logger.getLogger(Ejercicio21.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else{
    f.length();
    System.out.println("creado y su peso es "+f.length());
}
    }//fin del main

}// fin de la clase
