public class Pilot extends Person{

    private CropDuster cd;

    public CropDuster getCropDuster() {
        return cd;
    }

    public void setCropDuster(CropDuster cropDuster) {
        this.cd = cropDuster;
    }


    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {

    }
}
