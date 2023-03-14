
public class Vehicle implements Speedometer{
    //base (Class wide) variables
    protected String brandName = "";
    protected double speed = 0.0;
    protected int passengers = 0;
    protected double vehicleWeight;
    protected double cargoWeight = 0.0;

    //Base default constructor 
    public Vehicle(){
        brandName = "";
        speed = 0.0;
        passengers = 0;
    }

    public Vehicle(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight){
        brandName = inBrand;
        speed = inSpeed;
        passengers = inPassengers;
        vehicleWeight = inVehicleWeight;
    }

    //getters and setters
    public Vehicle(String inBrand){
        brandName = inBrand;
    }

    public String getBrand(){
        return brandName;
    }

    public  void setBrandName(String inBrand){
        brandName = inBrand;
    }

    public double getSpeed(){
        return  speed;
    }

    public void setSpeed(double inSpeed){
        speed = inSpeed;
    }

    public int getPassengers(){
        return  passengers;
    }

    public void setPassengers(int inPassengers){
        passengers = inPassengers;
    }

    public void setVehicleWeight(double inVehicleWeight){
        vehicleWeight = inVehicleWeight;
    }

    public double getVehicleWeight(){
        return vehicleWeight;
    }


    //Base toString
    public String toString(){
        String result = "";
        result = "Brand: \t\t\t" + getBrand() + "\n" +
                "Max Speed (mph): \t" + getSpeed() + "\n" +
                "Max Passengers: \t" + getPassengers() + "\n" +
                "Weight (lbs): \t" + getVehicleWeight() + "\n";
        return result;
    }
}
//the Speedometer interface to show the speed of any vehicle in the same way
interface Speedometer{
    public void setSpeed(double inSpeed);
    public double getSpeed();
}