public class Boat extends Vehicle{

    int stories;

    public Boat(String inBrand, double inSpeed, int inPassengers, double inVehicleWeight,  int inStories ){
        super(inBrand, inSpeed, inPassengers, inVehicleWeight); //uses the super constructor
        stories = inStories;
    }

    //getters and setters
    public void setStories(int inStories){
        stories = inStories;
    }

    public int getStories(){
        return stories;
    }


    //used the super toString, as well as adding the new variable to it.
    public String toString(){
        String result = super.toString() +
                "Stories :\t\t\t" + this.getStories();
        return  result ;
    }
}

