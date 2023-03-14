public class SuperCars extends Car{

    String color = "";
    boolean turbo = false;

    public SuperCars(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight,  double inMPG, String inColor){
        super(inBrand, inSpeed, inPassengers, inVehicleWeight,  inMPG); //uses the super constructor
        color = inColor;

    }

    //getters and setters
    public String getColor(){
        return color;
    }

    public void setColor(String inColor){
        color = inColor;
    }

    public void setTurbo(boolean inTurbo){
        turbo = inTurbo;
    }

    public double getSpeed() {
        if (turbo)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }

    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "\nColor :\t\t\t" + this.getColor();
        return  result ;
    }
}
