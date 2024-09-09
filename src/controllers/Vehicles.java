/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;


public abstract class Vehicles {
    private String id;
    private String matricle;
    private int capacity;

    public Vehicles(String id, String matricula, int capacidad) {
        this.id = id;
        this.matricle = matricula;
        this.capacity = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricle() {
        return matricle;
    }

    public void setMatricle(String matricula) {
        this.matricle = matricula;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacidad) {
        this.capacity = capacidad;
    }
    
}
