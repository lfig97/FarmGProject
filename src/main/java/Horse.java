public class Horse extends Animal implements IRideable{
    public String name;

    public void eat(Edible e){
        System.out.println("eating "+e );
    }

    public void makeNoise(){
        System.out.println("neighhhhh");
    }

    @Override
    public String toString() {
        return "Horse";
    }
}
