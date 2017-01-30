/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package store;

/**
 * @authors Henry Dench [c], Matthew Gutkin, Sam Meyerwitz
 * @author Period 8
 */
public class StoreClass {
    private String location, owner, phone;
    private String[] items = new String[4];
    
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
    
}
