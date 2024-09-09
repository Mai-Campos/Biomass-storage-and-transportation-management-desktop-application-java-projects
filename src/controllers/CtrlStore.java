/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CtrlStore {
   

    private ArrayList<Store> stores = new ArrayList<>();
    
    public CtrlStore() {
        super();    
    }
    
     public final String path = Util.getProgramDirectory();
    public ArrayList<Store> getStores() {
        
        String fileName =  "src/data/store.txt";
                
        File file=new File(fileName); 
                    
        ArrayList<Store> arrayStores = new ArrayList<>();
        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(file));
            String text = br.readLine();

            while(text != null) {

                String[] attr = text.split(",");
                String[] id = attr[0].split("=");
                String[] name = attr[1].split("=");
                String[] capacity = attr[2].split("=");
                String[] personal = attr[3].split("=");
                String[] type = attr[4].split("=");
                
                
                switch (type[1].trim()) {
                    case "0":
                        arrayStores.add(new ForestalBiomassStore(id[1], name[1], Integer.parseInt(capacity[1]), Integer.parseInt(personal[1])));               
                        break;
                   
                    default:
                        arrayStores.add(new ResidualBiomassStore(id[1], name[1], Integer.parseInt(capacity[1]), Integer.parseInt(personal[1])));               
                        break;
                }

                // Leer la siguiente línea
                text = br.readLine();
            }            

        }               
        catch (FileNotFoundException ex) {
            System.out.println("Error: Fichero no encontrado");
        }
        // Captura de cualquier otra excepción
        catch(Exception ex) {
            System.out.println("Error de lectura del fichero...");
        }
        // Asegurar el cierre del fichero en cualquier caso
        finally {
            try {
                // Cerrar el fichero si se ha podido abrir
                if(br != null) {
                    br.close();
                }
            }
            catch (IOException ex) {
                System.out.println("Error al cerrar el fichero");
            }
        }                
        
        return arrayStores;
    }   
    
    public Store getStore(String id) {
        Store store = null;
        ArrayList<Store> arrayStores = this.getStores();
        
        for (int i = 0; i < arrayStores.size(); i++) {
            store = arrayStores.get(i);
            if (store.getId().equals(id)) {
                break;
            }
        }        
        
        return store;
    }
    
      
    
    public boolean saveStores(ArrayList<Store> stores) {
        this.stores = stores;
        
        boolean res = false;
        
        String fileName = "src/data/store.txt";
        
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File file=new File(fileName); 
            
            Util utl = new Util();
            utl.prepareFolder(file, path);          
            
            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter write = new FileWriter(file, true);
            String type = "4";

            for (int i=0; i<this.stores.size(); i++) {                
                Store stor = this.stores.get(i);
                
                if (stor instanceof ForestalBiomassStore) {
                    type = "0";
                 
                } else {
                    type = "1";
                }

                write.write("id="+stor.getId()+",name="+stor.getName()+ ",capacity =" + Integer.toString(stor.getCapacity())+ ",personal ="+Integer.toString(stor.getPersonal())+",type="+ type +"\r\n");                
            }

            //Cerramos la conexion
            write.close();   
            
            res = true;
            
            System.out.println("Información guardada con éxito");
            
        } //Si existe un problema al escribir cae aqui
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Tienda", JOptionPane.INFORMATION_MESSAGE);                            

            System.out.println("Error al escribir en el archivo de productos");
        }                                       
        
        
        return res;
    }
}
