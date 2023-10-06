/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor_Pattern;

/**
 *
 * @author janna
 */
public class Customer_A implements Shopping{

    @Override
    public void discount() {
        System.out.println("No discount available");
    }
    
}
