import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Froilan froilan = new Froilan();
        ArrayList<CropRow> field = new ArrayList<CropRow>();
        CropRow row1 = new CropRow();
        CropRow row2 = new CropRow();
        CropRow row3 = new CropRow();
        CropRow row4 = new CropRow();
        CropRow row5 = new CropRow();

        row1.setCorn(new Corn());
        row2.setTomato(new Tomato());

        field.add(row1);
        field.add(row2);
        field.add(row3);
        field.add(row4);
        field.add(row5);

        ArrayList<Chicken> chickenCoop1 = new ArrayList<>();
        ArrayList<Chicken> chickenCoop2 = new ArrayList<>();
        ArrayList<Chicken> chickenCoop3 = new ArrayList<>();
        ArrayList<Chicken> chickenCoop4 = new ArrayList<>();

        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();
        Chicken chicken5 = new Chicken();
        Chicken chicken6 = new Chicken();
        Chicken chicken7 = new Chicken();
        Chicken chicken8 = new Chicken(),chicken9 = new Chicken(), chicken10 = new Chicken();
        Chicken chicken11 = new Chicken(), chicken12 = new Chicken(), chicken13 = new Chicken();
        Chicken chicken14 = new Chicken(), chicken15 = new Chicken();

        chickenCoop1.add(chicken1);
        chickenCoop1.add(chicken2);
        chickenCoop1.add(chicken3);

        chickenCoop2.add(chicken4);
        chickenCoop2.add(chicken5);
        chickenCoop2.add(chicken6);

        chickenCoop3.add(chicken7);
        chickenCoop3.add(chicken8);
        chickenCoop3.add(chicken9);

        chickenCoop4.add(chicken10);
        chickenCoop4.add(chicken11);
        chickenCoop4.add(chicken12);
        chickenCoop4.add(chicken13);
        chickenCoop4.add(chicken14);
        chickenCoop4.add(chicken15);

        ArrayList<Horse> stable1 = new ArrayList<>();
        ArrayList<Horse> stable2 = new ArrayList<>();
        ArrayList<Horse> stable3 = new ArrayList<>();

        Horse horse1 = new Horse(), horse2 = new Horse(), horse3 = new Horse(), horse4 = new Horse();
        Horse horse5 = new Horse(),horse6 = new Horse(), horse7 = new Horse(),horse8 = new Horse(), horse9 = new Horse(), horse10 = new Horse();

        stable1.add(horse1);
        stable1.add(horse2);
        stable1.add(horse3);
        stable1.add(horse4);
        stable1.add(horse5);
        stable1.add(horse6);
        stable1.add(horse7);
        stable1.add(horse8);

        stable2.add(horse9);
        stable3.add(horse10);


        IFarmVehicle cropDuster1 = new CropDuster() {
            @Override
            public void operate(Farm f) {

            }
        };
        IFarmVehicle tractor = new Tractor() {
            @Override
            public void operate(Farm f) {

            }
        };
        Aircraft aircraft = new CropDuster();
        FarmHouse farmHouse = new FarmHouse();
        Froilanda froilanda = new Froilanda();
        farmHouse.setP(froilanda);
        
        ArrayList<Horse>[] stables = new ArrayList[]{stable1, stable2, stable3};
        ArrayList<Chicken>[] chickenCoops = new ArrayList[]{chickenCoop1,chickenCoop2,chickenCoop3,chickenCoop4};
        
        Farm farm = new Farm(stables,chickenCoops,farmHouse);
        farm.setField(field);
        
        IFarmVehicle[] iFarmVehicles = {cropDuster1,tractor};
        farm.setiFarmVehicle(iFarmVehicles);
        farm.setAircraft(aircraft);
        CropDuster cropDuster = new CropDuster();
        froilanda.setCropDuster(cropDuster);
        froilan.setFarm(farm);
        System.out.println(froilan);



    }






}
