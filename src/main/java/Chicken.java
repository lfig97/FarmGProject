public class Chicken extends Animal implements IProduce{

    private boolean hasBeenFertilized;
    private EdibleEgg edibleEgg;
    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    @Override
    public Edible yield(){
        if (hasBeenFertilized == false){
            EdibleEgg edibleEgg = new EdibleEgg();
            this.edibleEgg = edibleEgg;
        }
     return this.edibleEgg;
    }



































}
