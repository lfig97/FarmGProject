public class Farmer extends Person implements IRider, IBotanist , IRideable{


//    private Crop c;


    public void mount(Rideable rideable){
        System.out.println("Im going to set up my" + rideable);
    }


    public void dismount(Rideable rideable){
        System.out.println("Let me go get off my" + rideable);
    }


//    public void plant(){
//        System.out.println("I'm going to plant a" +);
//    }

    @Override
    public void eat(Edible edible){
        System.out.println("I love eating " + edible);
    }

    @Override
    public void makeNoise (){
        System.out.println("Meep");
    }


//    public Crop getC() {
//        return c;
//    }
//
//    public void setC(Crop c) {
//        this.c = c;
//    }
}
