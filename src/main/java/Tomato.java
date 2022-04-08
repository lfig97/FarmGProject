public class Tomato extends Crop {
    private Tomato tomato;

    @Override
    public Edible yield() {
        if (isHasBeenFertilized() && isHasBeenHarvested()) {
            Tomato tomato1 = new Tomato();
            this.tomato = tomato1;
        }
        return tomato;
    }
}
