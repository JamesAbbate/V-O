/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import java.util.ArrayList;



/**
 *
 * @author Utente
 */
public class ConfigurationSave {
   
    private ArrayList<String> CPU = new ArrayList<>();
    private ArrayList<String> MB = new ArrayList<>();
    private ArrayList<String> GC = new ArrayList<>();
    private ArrayList<String> HD = new ArrayList<>();
    private ArrayList<String> RAM = new ArrayList<>();
    private ArrayList<String> PS = new ArrayList<>();
    String model, brand;
    private Double overallPrice;
    
    
    public void addInfo(String model, String brand, Double price)
    {
        this.model = model;
        this.brand = brand;
        
    }
    
    
    public void setPrice(Double overallPrice)
    {
        this.overallPrice = overallPrice;
    }
    
    public String getPrice()
    {
        return overallPrice.toString();
    }
    

    public String getInfo()
    {
        return this.model + " " + this.brand + " ";
    }
    
   
}
