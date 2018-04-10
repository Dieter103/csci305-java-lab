public class Player extends Play {
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public Element play() {
        return new Element();
    }
}
