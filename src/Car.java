public class Car {
    // instance variables
    private String model;
    private int miles;

    // constructor
    public Car (String model, int miles){
        this.model = model;
        this.miles = miles;
    }

    // toString method
    public String toString(){
        return model + " " + miles + "mi";
    }
}
