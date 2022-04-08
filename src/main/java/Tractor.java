public class Tractor implements IFarmVehicle{
    @Override
    public void operate(Farm f) {
        System.out.println("Operating on "+f);
    }

    public void harvest(Crop c){
        System.out.println("Harvesting "+c);
    }

    @Override
    public String toString() {
        return "Tractor";
    }
}
