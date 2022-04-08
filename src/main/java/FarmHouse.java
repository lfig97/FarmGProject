public class FarmHouse {

    private Person p;

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "FarmHouse{" +
                "p=" + p +
                '}';
    }
}
