import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
    private ArrayList<Horse>[] stables;
    private ArrayList<Chicken>[] chickenCoops;
    private FarmHouse farmHouse;
    private ArrayList<CropRow> field;
    private IFarmVehicle[] iFarmVehicle;
    private Aircraft aircraft;

    public Farm(ArrayList<Horse>[] stables, ArrayList<Chicken>[] chickenCoops, FarmHouse farmHouse) {
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public IFarmVehicle[] getiFarmVehicle() {
        return iFarmVehicle;
    }

    public void setiFarmVehicle(IFarmVehicle[] iFarmVehicle) {
        this.iFarmVehicle = iFarmVehicle;
    }

    public ArrayList<CropRow> getField() {
        return field;
    }

    public void setField(ArrayList<CropRow> field) {
        this.field = field;
    }

    public ArrayList<Chicken>[] getChickenCoop() {
        return chickenCoops;
    }

    public ArrayList<Horse>[] getStable() {
        return stables;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "stables=" + Arrays.toString(stables) +
                ", chickenCoops=" + Arrays.toString(chickenCoops) +
                ", farmHouse=" + farmHouse +
                ", field=" + field +
                ", iFarmVehicle=" + Arrays.toString(iFarmVehicle) +
                ", aircraft=" + aircraft +
                '}';
    }
}
