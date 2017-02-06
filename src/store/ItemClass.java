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
    private String description, buyer, price, salesprice, name;
    

    public ItemClass() {
        description = "Unknown";
        buyer = "Unknown";
        price = "Unknown";
        salesprice = "Unknown";
        name = "Unknown";
    }

    public ItemClass(String d, String b, String p, String s, String n) {
        description = d;
        buyer = b;
        price = p;
        salesprice = s;
        name = n;
    }

    public void setDesc(String d) {
        description = d;
    }

    public String getDesc() {
        return description;
    }

    public void setBuyer(String b) {
        buyer = b;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setPrice(String p) {
        price = p;
    }

    public String getPrice() {
        return price;
    }

    public void setSalesprice(String s) {
        salesprice = s;
    }

    public String getSalesprice() {
        return salesprice;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
