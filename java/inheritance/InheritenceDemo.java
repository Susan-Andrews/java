class InheritenceDemo{
    public static void main (String[] args){
        MountainBike mb = new MountainBike(20,10,1);
        System.out.println("Gear is : "+ mb.gear);
        System.out.println("Seat height is : "+ mb.seatHeight);  
        System.out.println("Bike speed is : "+ mb.speed);
        
        mb.applyBreak(1);
        System.out.println("Bike speed after applying break is : "+ mb.speed); 
          
            }
}
