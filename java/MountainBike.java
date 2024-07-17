// extend is used to extend the respective class
// since we use the bicycle class, we need to initalise its variables too along with this class variables/properties


class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int startHeight, 
                        int startSpeed,
                        int startGear) {
        // super is used to refer to base class constructor , and the arguements are the constructor arguments itself
        // super statement must be the first one inside the constructor
        super(startSpeed,startGear);
        this.seatHeight=startHeight;
                        }
    public void seatHeight(int newValue){
        seatHeight=newValue;
    }
    

}