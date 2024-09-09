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


public class CtrlVehicles {
    
    private ArrayList<Vehicles> vehicles = new ArrayList<>();
    
    public CtrlVehicles() {
        super();    
    }
    public final String path = Util.getProgramDirectory();
    public ArrayList<Vehicles> getVehicles() {
        
        String fileName =  "src/data/vehicles.txt";
                
        File file=new File(fileName); 
                    
        ArrayList<Vehicles> arrayVehicles = new ArrayList<>();
        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(file));
            String text = br.readLine();

            while(text != null) {

                String[] attr = text.split(",");
                String[] id = attr[0].split("=");
                String[] matricle = attr[1].split("=");
                String[] capacity = attr[2].split("=");
                String[] type = attr[3].split("=");
               
                
                
                switch (type[1].trim()) {
                    case "0":
                        arrayVehicles.add(new Car(id[1], matricle[1], Integer.parseInt(capacity[1])));               
                        break;
                   
                    case "1" :
                        arrayVehicles.add(new Truck(id[1],matricle[1], Integer.parseInt(capacity[1])));
                    default:
                        arrayVehicles.add(new Bike(id[1], matricle[1], Integer.parseInt(capacity[1])));               
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
        
        return arrayVehicles;
    }   
    
    public Vehicles getVehicle(String id) {
        Vehicles vehicle = null;
        ArrayList<Vehicles> arrayVehicles = this.getVehicles();
        
        for (int i = 0; i < arrayVehicles.size(); i++) {
            vehicle = arrayVehicles.get(i);
            if (vehicle.getId().equals(id)) {
                break;
            }
        }        
        
        return vehicle;
    }
    
   public boolean saveVehicles(ArrayList<Vehicles> vehicles) {
        this.vehicles = vehicles;
        
        boolean res = false;
        
        String fileName = "src/data/vehicles.txt";
        
     try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File file=new File(fileName); 
            
            Util utl = new Util();
            utl.prepareFolder(file, path);          
            
            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter write = new FileWriter(file, true);
            String type = "4";

            for (int i=0; i<this.vehicles.size(); i++) {                
                Vehicles veh = this.vehicles.get(i);
                
                if (veh instanceof Car) {
                    type = "0";
                 
                } else if(veh instanceof Truck) {
                    type = "1";
                }else{
                    type = "2";
                }

                write.write("id="+veh.getId()+",matricle="+veh.getMatricle()+ ",capacity =" + Integer.toString(veh.getCapacity())+ ",type="+ type +"\r\n");                
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
