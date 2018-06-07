/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simbolos;
import java.io.*;


/**
 *
 * @author Dell E5420
 */
public class Abrir_archivo {
    FileInputStream entrada;
    FileOutputStream salida;
    File Archivo;
    
    public String Abrir(File Archivo){
        String cadena="";
        try{
            entrada=new FileInputStream(Archivo);
            int asc=0;
            while((asc=entrada.read())!=-1){
            char caract=(char)asc;
            cadena+=caract;
            }
        }catch(Exception e){
        }
        return cadena;
    }
    
    
    
}
