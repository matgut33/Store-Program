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

import java.util.Scanner;
import store.ItemClass;
public class StoreClass {
    private int cItems = 0;
    private String location, owner, phone;
    private int itemcounter = 1;
    private ItemClass[] items = new ItemClass[101];
    Scanner r = new Scanner(System.in);
    
    public StoreClass() {
        location = "Unknown";
        owner = "Unknown";
        phone = "Unknown";
    }
    
    public StoreClass(String l, String o, String p) {
        location = l;
        owner = o;
        phone = p;
    }
    
    public void setLocation(String l) {
        location  = l;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setOwner(String o) {
        owner = o;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void setPhone(String p) {
        phone = p;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void addItem() {
        System.out.print("Enter the name of the item: ");
        String name = r.nextLine();
        System.out.print("Enter the description of the item: ");
        String desc = r.nextLine();
        System.out.print("Who is the buyer? ");
        String buyer = r.nextLine();
        System.out.print("How much does it cost? $");
        String price = r.nextLine();
        System.out.print("What is the sale price? $");
        String sale = r.nextLine();
        items[cItems].setName(name);
        items[cItems].setDesc(desc);
        items[cItems].setBuyer(buyer);
        items[cItems].setPrice(price);
        items[cItems].setSalesprice(sale);
        cItems++;
    }
    
    public void removeItem(String item) {
        boolean found = findItem(item);
        if (found == false) {
            System.out.println("ERROR: ITEM NOT FOUND");
        }
        else {
            int nItem = 0;
            int num = 0;
        while (num < 100) {
            if (items[num].getName().equalsIgnoreCase(item))  {
                nItem = num;
                break;
            }
            num ++;
        }
            items[cItems].setName("");
            items[cItems].setDesc("");
            items[cItems].setBuyer("");
            items[cItems].setPrice("");
            items[cItems].setSalesprice("");
        }
    }
    
    public boolean findItem(String item) {
        try {    
            boolean q = false;
            String name = item;
            int num = 0;
            while (num < 90) {
                if (items[num].getName().equalsIgnoreCase(name))  
                {
                    q = true;
                    break;
                }
                else
                {
                    q = false;
                }
                num ++;
            }
            System.out.println("Item Removed!");
            return q;
        } catch (NullPointerException e) {
            return false;
        }
        
    }
    
    public void buyItem(String item) {
        boolean found = findItem(item);
        if (found == false) {
            System.out.println("ERROR: ITEM NOT FOUND");
        }
        else {
            int nItem = 0;
            int num = 0;
        while (num < 100) {
            if (items[num].getName().equalsIgnoreCase(item))  {
                nItem = num;
                break;
            }
            num ++;
        }
        System.out.println("Item '" + item + "' has been bought for $" + items[num].getSalesprice() + " dollars" );
        }
    }
}
