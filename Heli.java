public class Heli extends Plane{

    int propellers;
    public Heli(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight,  String inElevation, int inPropellers ){
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inElevation); //uses the super constructor
        propellers = inPropellers;
    }

    //getters and setters
    public void setPropellers(int inPropellers){
        propellers = inPropellers;
    }

    public int getPropellers(){
        return propellers;
    }

    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "\nPropellers :\t\t" + this.getPropellers();
        return  result ;
    }
}
