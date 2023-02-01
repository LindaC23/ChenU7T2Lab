import java.util.ArrayList;

public class UsedCarLot {
    // instance variables
    private ArrayList<Car> inventory;

    // constructor
    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    // getter method
    public ArrayList getInventory(){
        return inventory;
    }

    // other public methods
    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int firstIdx, int secondIdx){
        if (firstIdx < inventory.size() && secondIdx < inventory.size()){
            Car replaced = inventory.set(firstIdx, inventory.get(secondIdx));
            inventory.set(secondIdx, replaced);
            return true;
        } else {
            return false;
        }
    }
}
