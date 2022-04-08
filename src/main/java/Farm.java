import java.util.Arrays;

public class Farm {
    private Stable[] stables;
    private ChickenCoop[] chickenCoops;
    private FarmHouse farmHouse;
    private Field field;
    private IFarmVehicle[] iFarmVehicle;
    private Aircraft aircraft;

    public Farm(Stable[] stables, ChickenCoop[] chickenCoops,FarmHouse farmHouse) {
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

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public ChickenCoop[] getChickenCoop() {
        return chickenCoops;
    }

    public Stable[] getStable() {
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
