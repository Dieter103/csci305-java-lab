public class Paper extends Element {
    public Paper(){
        super.setName("Paper");
    }
    @Override
    public void compareTo(Element e) {

        if(this.getName().equals(e.getName())){
            Outcome outcome = new Outcome("Paper equals paper", "tie");

        }else if(e.getName().equals("Lizard")){
            Outcome outcome = new Outcome("Lizard eats paper", "lose");

        }else if(e.getName().equals("Scissors")){
            Outcome outcome = new Outcome("Scissors cut paper", "lose");

        }else if(e.getName().equals("Rock")){
            Outcome outcome = new Outcome("Paper covers rock", "win");
        }else if(e.getName().equals("Spock")){
            Outcome outcome = new Outcome("Paper disproves spock", "win");
        }
    }
}
