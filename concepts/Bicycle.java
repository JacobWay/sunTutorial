public class Bicycle implements BicycleInterface{
    int speed = 0;
    int cadence = 0;
    int gear = 1;

    public int changeCadence(int newValue){
        return cadence = newValue;
    }

    public int changeGear(int newValue){
        return gear = newValue;
    }

    public int speedup(int increment){
        return speed += increment;
    }

    public int applyBrake(int decrement){
        return speed += decrement;
    }

    public void printStates(){
        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
    }
}
