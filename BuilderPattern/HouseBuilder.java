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
public interface HouseBuilder {
    public void buildFoundation();
    public void buildStructure();
    public void buildFoof();
    public void buildInterior();
    House getHouse();

}
