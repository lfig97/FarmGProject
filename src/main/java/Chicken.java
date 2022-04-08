public class Chicken extends Animal implements IProduce{

    private boolean hasBeenFertilized;
    private EdibleEgg edibleEgg;
    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void eat(Edible e){
        System.out.println("eating "+e);
    }

    public void makeNoise(){
        System.out.println("cluck cluck");
    }

    @Override
    public Edible yield(){
        if (hasBeenFertilized == false){
            EdibleEgg edibleEgg = new EdibleEgg();
            this.edibleEgg = edibleEgg;
        }
     return this.edibleEgg;
    }

    @Override
    public String toString() {
        return "Chicken";
    }
}
