interface BicycleParts{
    public int tyres=2;
    public int maxSpeed=25;

}

interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);

}
 class Bicycle implements BicycleParts, BicycleOperations{
    int gears;
    int currentSpeed;

    Bicycle( int gears, int currentSpeed){
        this.gears=3;
        this.currentSpeed=45;

    }

    public void applyBrake(int decrement){
        currentSpeed-=decrement;
        System.out.println("current Speed=" + currentSpeed);

    }
    public void speedUp(int increment){
        currentSpeed += increment;
        System.out.println("cureent speed="+ currentSpeed);
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
    }

}

class MountainBike extends Bicycle{
    int seatHeight;

    MountainBike( int gears,int currentSpeed,int startHeight){
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }

}

public class Act4 {
    public static void main(String args[]) {
    MountainBike mb = new MountainBike(3, 0, 25);
    System.out.println(mb.bicycleDesc());
    mb.speedUp(20);
    mb.applyBrake(5);
}
    
}
