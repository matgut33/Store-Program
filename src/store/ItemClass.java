/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package store;

/**
 * @authors Henry Dench [c], Matthew Gutkin, Sam Meyerowitz
 * @author Period 8
 */
public class ItemClass {
    private String description, buyer, price, salesprice;
    

    public ItemClass() {
        description = "Unknown";
        buyer = "Unknown";
        price = "Unknown";
        salesprice = "Unknown";
    }

    public ItemClass(String d, String b, String p, String s) {
        description = d;
        buyer = b;
        price = p;
        salesprice = s;   
    }

    public void SetDescription(String d) {
        description = d;
    }

    public String GetDescription() {
        return description;
    }

    public void SetBuyer(String b) {
        buyer = b;
    }

    public String GetBuyer() {
        return buyer;
    }

    public void SetPrice(String p) {
        price = p;
    }

    public String GetPrice() {
        return price;
    }

    public void SetSalesprice(String s) {
        salesprice = s;
    }

    public String GetSalesprice() {
        return salesprice;
    }

}
