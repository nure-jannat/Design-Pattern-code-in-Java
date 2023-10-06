/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author janna
 */
public class Main {
    public static void main(String[] args){
        HouseBuilder hb = new SimpleHouseBulder();
        HouseDirector hd = new HouseDirector();
        hd.houseConstruct(hb);
        
        House house = hb.getHouse();
        System.out.println(house);
    }
    
}
