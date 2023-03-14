public class Submarine extends Boat{

    int displacement;

    public Submarine(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight,  int inStories, int inDisplacement ){
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inStories); //uses the super constructor
        displacement = inDisplacement;
    }

    //getters and setters
    public void setDisplacement(int inDisplacement){
        displacement = inDisplacement;
    }

    public int getDisplacement(){
        return displacement;
    }

    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "\nDisplacement (tons) :\t" + this.getDisplacement();
        return  result;
    }
}
