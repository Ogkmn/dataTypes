public class Main {
    public static void main(String[] args){
        Airplane airplane = new Airplane("Boeing - 747",224);
        airplane.land();
        airplane.unloadPassengers();
        airplane.loadPassengers(-1);
        airplane.loadPassengers(225);
        airplane.loadPassengers(224);
        airplane.loadPassengers(1);
        airplane.takeoff();
        airplane.unloadPassengers();
        airplane.land();
        airplane.unloadPassengers();
    }
}