// Car Class inherits from Vehicle Class
public class Car extends Vehicle{

    boolean spoiler = false;
    boolean stereo = false;
    double mpg = 0.0;

    public Car(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight, double inMPG){
        super(inBrand, inSpeed, inPassengers, inVehicleWeight); //uses the super constructor
        mpg = inMPG;
    }

    //getters and setters
    public void setSpoiler(boolean inSpoiler){
        spoiler = inSpoiler;
    }

    public boolean getSpoiler(){
        return spoiler;
    }

    public void setStereo(boolean inStereo){
        stereo = inStereo;
    }

    public boolean getStereo(){
        return  stereo;
    }

    //changes speed based on spoiler
    @Override
    public double getSpeed() {
        if (spoiler)
            return super.getSpeed() + 20;
        else
            return super.getSpeed();
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getMPG(){
        if(stereo) {
            return mpg - (mpg / 10);
        }
        else {
            return mpg;
        }
    }
    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "MPG :\t\t\t" + this.getMPG();
        return  result ;
    }
}
