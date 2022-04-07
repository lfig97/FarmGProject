public class TomatoPlant extends Crop{
    private Tomato tomato;

    public Edible yield() {
        if(isHasBeenFertilized()&&isHasBeenHarvested()){
            Tomato t = new Tomato();
            this.tomato = t;
        }
        return tomato;
    }
}
