public class Farm extends FarmHouse {


    private Stable stable;
    private ChickenCoop chickenCoop;
    private Field field;
    private Corn corn;
    private Tomato tomato;
    private Chicken chicken;
    private Horse horse;



    public Farm(Stable stable, ChickenCoop chickenCoop, Field field, Corn corn, Tomato tomato, Chicken chicken, Horse horse, FarmVehicle farmVehicle, Aircraft aircraft) {
        this.stable = stable;
        this.chickenCoop = chickenCoop;
        this.field = field;
        this.corn = corn;
        this.tomato = tomato;
        this.chicken = chicken;
        this.horse = horse;
        this.farmVehicle = farmVehicle;
        this.aircraft = aircraft;
    }



    public Stable getStable() {
        return stable;
    }

    public void setStable(Stable stable) {
        this.stable = stable;
    }

    public ChickenCoop getChickenCoop() {
        return chickenCoop;
    }

    public void setChickenCoop(ChickenCoop chickenCoop) {
        this.chickenCoop = chickenCoop;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Corn getCorn() {
        return corn;
    }

    public void setCorn(Corn corn) {
        this.corn = corn;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
    }

    public Chicken getChicken() {
        return chicken;
    }

    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public FarmVehicle getFarmVehicle() {
        return farmVehicle;
    }

    public void setFarmVehicle(FarmVehicle farmVehicle) {
        this.farmVehicle = farmVehicle;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    private FarmVehicle farmVehicle;
    private Aircraft aircraft;


}
