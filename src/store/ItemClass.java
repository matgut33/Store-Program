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
    private String description, buyer;
    private double price, salesprice;

    public ItemClass() {
        description = "Unknown";
        buyer = "Unknown";
        price = 0;
        salesprice = 0;
    }

    public void ItemClass(String d, String b, double p, double s) {
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

    public void SetPrice(double p) {
        price = p;
    }

    public double GetPrice() {
        return price;
    }

    public void SetSalesprice(double s) {
        salesprice = s;
    }

    public double GetSalesprice() {
        return salesprice;
    }

}
