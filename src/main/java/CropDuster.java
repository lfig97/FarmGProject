public class CropDuster extends Aircraft implements IFarmVehicle{


    public void fertilize(cropRow cropRow) {
        System.out.println(fertilizing + cropRow);
    }

}
