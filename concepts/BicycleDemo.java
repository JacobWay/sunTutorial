public class BicycleDemo{
    public static void main(String[] args){
        Bicycle bicycle1 = new Bicycle();

        bicycle1.changeCadence(5);
        bicycle1.printStates();

        Bicycle bicycle2 = new Bicycle();

        bicycle2.changeCadence(5);
        bicycle2.printStates();
    }
}
