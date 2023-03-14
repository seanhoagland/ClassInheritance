public class Plane extends Vehicle{

    String elevation;

    public Plane(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight,  String inElevation ){
        super(inBrand, inSpeed, inPassengers, inVehicleWeight); //uses the super constructor
        elevation = inElevation;
    }

    //getters and setters
    public void setElevation(String inElevation){
        elevation = inElevation;
    }

    public String getElevation(){
        return elevation;
    }


    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "Elevation (ft) :\t" + this.getElevation();
        return  result ;
    }
}
