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
public class HouseDirector {
    public void houseConstruct(HouseBuilder builder){
        builder.buildFoundation();
        builder.buildStructure();
        builder.buildFoof();
        builder.buildInterior();
    }
}
