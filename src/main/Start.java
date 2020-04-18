/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.Pizza;

/**
 *
 * @author urosv
 */
public class Start {
    
    public static void main(String[] args) {
        Pizza capricosa = new Pizza.Builder(12).bacon(true).cheese(true).build();
        System.out.println(capricosa);
    }
    
}
