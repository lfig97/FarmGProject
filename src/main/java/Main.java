public class Main {
    public static void main(String[] args) {
        Froilan froilan = new Froilan();
        Field field = new Field();
        CropRow[] cropRows = new CropRow[5];
        field.setCropRow(cropRows);
        cropRows[0].setCorn(new Corn());
        Tomato tomato = new Tomato();
        cropRows[1].setTomato(tomato);
        ChickenCoop[] chickenCoops = new ChickenCoop[4];
        for(ChickenCoop chickenCoops1:chickenCoops){
            chickenCoops1.setChicken(new Chicken[15]);

        }
        Stable[] stables = new Stable[3];
        for(Stable stable:stables){
            stable.setHorses(new Horse[10]);
        }
        IFarmVehicle[] iFarmVehicles = new IFarmVehicle[2];
        Aircraft aircraft = new Aircraft();
        FarmHouse farmHouse = new FarmHouse();
        Froilanda froilanda = new Froilanda();
        farmHouse.setP(froilanda);
        Farm farm = new Farm(stables,chickenCoops,farmHouse);
        farm.setField(field);
        farm.setiFarmVehicle(iFarmVehicles);
        farm.setAircraft(aircraft);

        froilan.setFarm(farm);
        froilan.toString();



    }






}
