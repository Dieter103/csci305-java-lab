public class StupidBot extends Player {
    public StupidBot(){
        super.setName("StupidBot");
    }
    @Override
    public Element play(){
        return new Rock();
    }
}
