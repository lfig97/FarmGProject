public class CropDuster extends Aircraft implements IFarmVehicle{


    public void fertilize(CropRow cropRow) {
        System.out.println("fertilize" + cropRow);
    }

}
