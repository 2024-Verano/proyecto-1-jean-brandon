/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author derri
 */
public class JsonReader {
    
    private String fileName;
    private JSONArray mainArray;
    
    
    public JsonReader(String f){
        this.fileName = f;
        
    }
    
    /**
     * Guarda el contenido del JSONArray en el archivo JSON.
     */
    
    public void SaveJSON(){
        
        try(FileWriter file = new FileWriter(fileName)){
            file.write(mainArray.toString());
            file.flush();
            System.out.println("Archivo guardado");
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    /**
     * Agrega un nuevo objeto JSON al JSONArray principal.
     * 
     * @param jsonObject El objeto JSON a agregar.
     */
    public void addJSONObject(JSONObject jsonObject) {
        mainArray.add(jsonObject);
    }
    
   /**
     * Carga el contenido del archivo JSON al JSONArray.
     */
    
    public void LoadJSON(){
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(fileName)) {
            Object obj = parser.parse(reader);
            mainArray = (JSONArray) obj;
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
   
    /**
     * Devuelve el JSONArray principal.
     * 
     * @return El JSONArray.
     */
    public JSONArray getMainArray() {
        return mainArray;
    }

    /**
     * Establece el JSONArray principal.
     * 
     * @param mainArray El JSONArray a establecer.
     */
    public void setMainArray(JSONArray mainArray) {
        this.mainArray = mainArray;
    }
    
    /**
     * Devuelve el nombre del archivo.
     * 
     * @return El String.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Establece el nombre del archivo con el que se trabaja.
     * 
     * @param n El String a establecer.
     */
    public void setFileName(String n) {
        this.fileName = n;
    }
    
}

