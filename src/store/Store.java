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
        
        System.out.print("Would you like to add, search for, or remove items? (A/S/R) ");
        String input1 = r.nextLine();
    }

}
