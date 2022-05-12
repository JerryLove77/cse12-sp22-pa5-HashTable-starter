/**
 * TODO: Add your file header
 * Name: Jianrui Zhang
 * ID: A16878087
 * Email: Jiz145@ucsd.edu
 * Sources used: None
 * 
 * 2-4 sentence file description here
 */
import java.util.HashMap;
import java.util.Set;

public class Sanctuary {
    
    HashMap<String, Integer> sanctuary;
    int maxAnimals;
    int maxSpecies;

    public Sanctuary(int maxAnimals, int maxSpecies) {
        if(maxAnimals < 0 || maxSpecies < 0){
            throw new IllegalArgumentException();
        }
        this.maxAnimals = maxAnimals;
        this.maxSpecies = maxSpecies;
        this.sanctuary = new HashMap<String, Integer>();
    }

    public int getNum(String species) {
        if(species == null){
            throw new IllegalArgumentException();
        }
        if(sanctuary.containsKey(species)){
            return sanctuary.get(species);
        }
        else{
            return 0;
        }
    }
    
    public int getTotalAnimals() {
        int count = 0;
        Set<String> aniset = sanctuary.keySet();
        for(String animal : aniset){
            count += sanctuary.get(animal);
        }
        return count;
    }
    
    public int getTotalSpecies() {
        return sanctuary.size();
    }

    public int rescue(String species, int num) {
        if(species == null || num <= 0){
            throw new IllegalArgumentException();
        }

        int numRescue;

        if (this.getTotalSpecies() >= this.maxSpecies || this.getTotalAnimals() >= this.maxAnimals) {
            return num;
         } // if no any space

        if (num + this.getTotalAnimals() > this.maxAnimals){ // if no enough space 
            numRescue = this.maxAnimals - this.getTotalAnimals();
            if (sanctuary.containsKey(species)) {
                this.sanctuary.replace(species, this.sanctuary.get(species), 
                this.sanctuary.get(species)+numRescue);
            }
            else if(getTotalSpecies() > maxSpecies ){
                return num;
            }
            
                sanctuary.put(species, numRescue);
                return num - numRescue;

        }

        if (sanctuary.containsKey(species)){
            this.sanctuary.replace(species, this.sanctuary.get(species) + num);
        }
        else if(getTotalSpecies() +1 > maxSpecies ){
            return num;
        }
        else{
            sanctuary.put(species, num);
        }
        return 0;

    }

    public void release(String species, int num) {
        if(species == null){
            throw new IllegalArgumentException();
        }

        if(num <= 0){
            throw new IllegalArgumentException();
        }

        if (! sanctuary.containsKey(species)) {
            throw new IllegalArgumentException();
        }

        if (num > this.sanctuary.get(species)) {
            throw new IllegalArgumentException();
        }
        
        this.sanctuary.replace(species, this.sanctuary.get(species) - num);
        if (sanctuary.get(species) == 0) {
            this.sanctuary.remove(species);
        }
    

    }
}
