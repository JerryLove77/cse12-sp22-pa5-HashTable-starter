
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
        int count = 0;
        Set<String> speSet = sanctuary.keySet();
        for(String species : speSet){
            count += sanctuary.get(species);
        }
        return count;
    }

    public int rescue(String species, int num) {
        if(species == null){
            throw new IllegalArgumentException();
        }
        if(num <= 0){
            throw new IllegalArgumentException();
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

    }
}
