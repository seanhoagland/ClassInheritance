public class Yacht extends Boat{

    int length;

    public Yacht(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight,  int inStories, int inLength){
        super(inBrand, inSpeed, inPassengers, inVehicleWeight, inStories); //uses the super constructor
        length = inLength;

    }

    //getters and setters
    public void setDisplacement(int inLength){
        length = inLength;
    }

    public int getLength(){
        return length;
    }

    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "\nLength (ft) :\t" + this.getLength();
        return  result;
    }
}
