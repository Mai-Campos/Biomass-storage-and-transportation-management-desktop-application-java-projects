/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;


public abstract class Store {
    
    

    
    private String id;
    private String name;
    private int capacity;
    private int personal;

  

    public Store(String id, String name, int capacity, int personal) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.personal = personal;
    }

    public Store() {
        
    }
    
      public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
