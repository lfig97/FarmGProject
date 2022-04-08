public class CropDuster extends Aircraft implements IFarmVehicle{


    public void fertilize(CropRow cropRow) {
        System.out.println("fertilize" + cropRow);
    }

    public void operate(Farm f){
        System.out.println("operate on "+f);
    }

    public void makeNoise(){
        System.out.println("zzzzzzz");
    }

    @Override
    public String toString() {
        return "CropDuster";
    }
}
