class Bicycle{
    // protected should be used while implementing inheritance, since it helps to avail all the
    // properties of the base class to the child class
    protected int gear;
    protected int speed;

    //constructor

    public Bicycle(int startSpeed, int startGear){
        gear=startGear;
        speed=startSpeed;
    }

    // three methods for different functionalities
    public void setGear(int newValue){
        gear=newValue;
    }
    public void applyBreak(int decrement){
        speed -=decrement;
    }
    public void speedUp(int increment){
        speed+=increment;
    }
}