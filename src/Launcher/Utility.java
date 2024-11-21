/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Launcher;

import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Usuario
 */
public class Utility {
    
    public static void SetImageLabelForced(JLabel label, String root){
        //Obtener el icono a traves de la ruta
        ImageIcon originalIcon = new ImageIcon(root);
        // Escalar el icono
        ImageIcon scaledIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        //Aplicar el icono
        label.setIcon(scaledIcon);
        label.repaint();
    }

    public static void SetImageLabelForced(JLabel label, String root, Dimension dimension){
        //Obtener el icono a traves de la ruta
        ImageIcon originalIcon = new ImageIcon(root);
        // Escalar el icono
        ImageIcon scaledIcon = new ImageIcon(originalIcon.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH));
        //Aplicar el icono
        label.setIcon(scaledIcon);
        label.repaint();
    }  
    
    //JSON
    private static final String JSON_FILE_PATH = "src/Launcher/LauncherPrueba.json";
    
    public static String NombreImagenCarrusel(int indexSimulador) throws FileNotFoundException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) //Lee el json con BufferedReader
        {
            //Convierte la lectura del json en un string con StringBuilder
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) 
            {
                sb.append(line);
            }
            
            JSONObject simulador = new JSONObject(sb.toString())
                    .getJSONArray("grados").getJSONObject(0)
                        .getJSONArray("simuladores")
                            .getJSONObject(indexSimulador);
            
            return simulador.getString("imagen");
        } 
        catch (IOException | JSONException e) 
        {
            return "Error al leer el archivo JSON";
        }
    }    
}
