public class Farmer extends Person implements IRider, IBotanist,IEater{
    private Crop crop;
    private CropRow cropRow;

    public void mount(IRideable rideable){
        System.out.println("Im going to set up my" + rideable);
    }


    public void dismount(IRideable rideable){
        System.out.println("Let me go get off my" + rideable);
    }


    public void plant(){
        System.out.println("I'm going to plant a " +getCrop() +"in"+getCropRow());
    }

    @Override
    public void eat(Edible edible){
        System.out.println("I love eating " + edible);
    }

    @Override
    public void makeNoise (){
        System.out.println("Meep");
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public CropRow getCropRow() {
        return cropRow;
    }

    public void setCropRow(CropRow cropRow) {
        this.cropRow = cropRow;
    }
}
