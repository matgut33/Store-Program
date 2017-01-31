/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package store;

import java.util.Scanner;

/**
 * @authors Henry Dench [c], Matthew Gutkin, Sam Meyerowitz
 * @author Period 8
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in); //Used as main scanner for all inputs.
        
        System.out.print("Would you like to add, search for, remove, or buy items? (A/S/R/B) ");
        String input1 = r.nextLine();
        String desc = "", bu  = "";
        double pr = 0, sa = 0;
        if(input1.equals("A") || input1.equals("a"))
        {
            StoreClass add = new StoreClass();
            add.addItem(desc, bu, pr, sa);
        }
        else if(input1.equals("S") || input1.equals("s"))
        {
            
        }
        else if(input1.equals("R") || input1.equals("r"))
        {
            
        }
        else if(input1.equals("B") || input1.equals("b"))
        {
            
        }
    }

}
