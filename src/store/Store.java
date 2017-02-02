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
        
        //Prompt and adding store information
        System.out.print("What is the name of the store owner? ");
        String owner = r.nextLine();
        System.out.print("Where is the store? ");
        String loc = r.nextLine();
        System.out.print("What is the store's phone number? ");
        String phone = r.nextLine();
        StoreClass store = new StoreClass(loc, owner, phone);
        
        boolean flag = true;
        while (flag) {
            flag = false;
            //Prompt for ading, removing, searching for, and buying items
            System.out.print("Would you like to add, search for, remove, or buy items? (A/S/R/B) ");
            String input1 = r.nextLine();
            String desc = "", bu  = "", item = "";
            double pr = 0, sa = 0;
            if(input1.equals("A") || input1.equals("a"))
            {
                store.addItem(); //Adds store item, input in Store class 'add'
            }
            else if(input1.equals("S") || input1.equals("s"))
            {
                System.out.print("Enter the name of the item: ");
                item = r.nextLine();
                store.findItem(item); //Searches for item
            }
            else if(input1.equals("R") || input1.equals("r"))
            {
                System.out.print("Enter the name of the item: ");
                item = r.nextLine();
                store.removeItem(item);
            }
            else if(input1.equals("B") || input1.equals("b"))
            {

            }
            System.out.println("Would you like to perform more actions? (Y/N) ");
            String yorn = r.nextLine();
            if (yorn.equals("Y") || yorn.equals("y")) {flag = true;}
        }
    }

}
