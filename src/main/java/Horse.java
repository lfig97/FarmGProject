public class Horse extends Animal implements IRideable{

    public void eat(Edible e){
        System.out.println("eating "+e );
    }

    public void makeNoise(){
        System.out.println("neighhhhh");
    }


}
