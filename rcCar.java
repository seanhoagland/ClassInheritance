public class rcCar extends Car{

    int range;

    public rcCar(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight, double inMPG, int inRange){
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inMPG); //uses the super constructor
        range = inRange;

    }

    //getters and setters
    public void setRange(int inRange){
        range = inRange;
    }

    public int getRange(){
        return range;
    }

    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "\nRange(yds) :\t\t" + this.getRange();
        return  result ;
    }
}
