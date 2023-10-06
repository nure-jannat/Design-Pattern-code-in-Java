
package BuilderPattern;


public class SimpleHouseBulder implements HouseBuilder{
    private House house;
    public SimpleHouseBulder(){
        this.house = new House();
    }
    
     public void buildFoundation(){
         house.setFoundation("Simple Foundation");
     }
    public void buildStructure(){
        house.setStructure("Simpple Structure");
    }
    public void buildFoof(){
        house.setRoof("Simple Roof");
    }
    public void buildInterior(){
        house.setInterior("Simple Interior");
    }
    public House getHouse(){
       return house; 
    }
}
