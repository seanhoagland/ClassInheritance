public class SpaceStation extends Plane{

    String weapons;

    public SpaceStation(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight,  String inElevation, String inWeapons ){
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inElevation); //uses the super constructor
        weapons = inWeapons;
    }

    //getters and setters
    public void setWeapons(String inWeapons){
        weapons = inWeapons;
    }

    public String getWeapons(){
        return weapons;
    }

    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "\nWeapons :\t\t" + this.getWeapons();
        return  result ;
    }
}
