import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class GenerateInfoFiles {

    private BufferedReader lector;//lee el archivo
    private String linea; //recibe la linea de cada fila
    private String partes[] = null;//almacena cada linea leida

    public void leerArchivo(String nombreArchivo){
        try{
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while((linea = lector.readLine()) != null){
                partes = linea.split(";");
                imprimirlinea();
                System.out.println();
            }
            lector.close();
            linea = null;
            partes = null;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    

    public void imprimirlinea(){
        for(int i = 0; i < partes.length; i++){
            System.out.print(partes[i]+" | ");
        }
    }    
        
}