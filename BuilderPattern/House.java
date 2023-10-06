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
public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;
    
    public void setFoundation(String foundation){
        this.foundation = foundation;
    }
    
    public void setStructure(String structure){
        this.structure = structure;
    }
    
    public void setRoof(String roof){
        this.roof = roof;
    }
    
    public void setInterior(String foundation){
        this.interior = interior;
    }
    
    public String toString(){
        return "House[Foundation: "+foundation+", Structure: "+structure+", Roof: "+roof+", Interior: "+interior+"]";
    }
}
