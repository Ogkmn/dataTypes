public class Airplane {

    private String identification;
    private int maxPassengers;
    private int currentPassengers;
    private boolean isCurrentlyFlying;
    private double cruiseSpeed;

    public Airplane(String identification, int maxPassengers){
        this.identification = identification;
        this.maxPassengers = maxPassengers;
        System.out.printf("Airplane %s with %d is created.\n",identification,maxPassengers);
    }

    /**
     *
     * @return Return true if the plane is able to load passengers, else return false;
     */
    public boolean loadPassengers(int passengers){
        if(passengers<0 || this.currentPassengers + passengers > this.maxPassengers ||  this.isCurrentlyFlying){
            System.out.printf("Airplane %s is unable to load %d passengers.\n",this.identification,passengers);
            return false;
        }
        this.currentPassengers += passengers;
        System.out.printf("Airplane %s loads %d passengers.\n",this.identification, passengers);
        return true;
    }

    /**
     *
     * @return return true if plane is able to unload passenger.
     * If the plane is not able to load of passengers,
     * for example when the plane is flying or the plane is already empty return false.
     */
    public boolean unloadPassengers(){
        if(this.isCurrentlyFlying || this.currentPassengers<1){
            System.out.printf("Airplane %s is unable to unload %d passengers.\n",this.identification,this.currentPassengers);
            return false;
        }
        System.out.printf("Airplane %s unloads %d passengers.\n",this.identification, this.currentPassengers);
        this.currentPassengers = 0;
        return true;
    }

    /**
     * I assume that my plane only can have one cruise speed (cruise speed = 100).
     * @return
     */
    public boolean takeoff(){
        if(this.isCurrentlyFlying){
            System.out.printf("Airplane %s is already flying, to able to takeoff!\n ",this.identification);
            return false;
        }
        this.isCurrentlyFlying = true;
        this.cruiseSpeed = 100;
        System.out.printf("Airplane %s takes off.\n",this.identification);
        return true;
    }

    public boolean land(){
        if(!this.isCurrentlyFlying){
            System.out.printf("Airplane %s is already landed, not able to land!\n",this.identification);
            return false;
        }
        this.isCurrentlyFlying = false;
        this.cruiseSpeed = 0;
        System.out.printf("Plane %s lands.\n", this.identification);
        return true;
    }

    public String getIdentification() {
        return identification;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public boolean isCurrentlyFlying() {
        return isCurrentlyFlying;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }
}
