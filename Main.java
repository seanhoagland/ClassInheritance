import sun.security.mscapi.SunMSCAPI;

public class Main {
    public static void main(String[] args){

        //creates objects and prints them out
        SuperCars lambo = new SuperCars("Lamborghini", 198.00, 2, 4844,  17.0, "Blue");
        lambo.setSpoiler(true);
        lambo.setTurbo(true);
        System.out.println(lambo + "\n\n\n");

        rcCar remoteCar = new rcCar("HSP 4WD RC Car", 43.496, 0, 5, 1.0, 50);
        System.out.println(remoteCar + "\n\n\n");

        Submarine attackSub = new Submarine("Virginia Class Submarine", 29.0, 100, 16000000, 7, 7900);
        System.out.println(attackSub + "\n\n\n");

        Yacht luxYacht = new Yacht("Luxury Yacht", 59.0, 30, 882000, 5, 150);
        System.out.println(luxYacht + "\n\n\n");

        SpaceStation deathStar = new SpaceStation("Death Star", 6.706e+8, 1452495, 1.48e17, "infinite", "Death Star Superlaser");
        System.out.println(deathStar + "\n\n\n");

        Heli helicopter = new Heli("S-92", 190, 19,15500 , "15000", 8);
        System.out.println(helicopter);
    }
}