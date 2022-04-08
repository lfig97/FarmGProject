public class Farm {
    private Stable stable;
    private ChickenCoop chickenCoop;
    private FarmHouse farmHouse;

    public Farm(Stable stable, ChickenCoop chickenCoop,FarmHouse farmHouse) {
        this.stable = stable;
        this.chickenCoop = chickenCoop;
        this.farmHouse = farmHouse;
    }


    public ChickenCoop getChickenCoop() {
        return chickenCoop;
    }

    public Stable getStable() {
        return stable;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}
