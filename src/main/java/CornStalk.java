public abstract class CornStalk extends Crop{
    private EarCorn corn;

    public Edible yield() {
        if(isHasBeenFertilized()&&isHasBeenHarvested()){
            EarCorn c = new EarCorn();
            this.corn = c;
        }
        return corn;
    }
}
