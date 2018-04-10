public class Lizard extends Element{
    public Lizard(){
        super.setName("Lizard");
    }

    @Override
    public void compareTo(Element e) {

        if(this.getName().equals(e.getName())){
            Outcome outcome = new Outcome("Lizard equals lizard", "tie");

        }else if(e.getName().equals("Scissors")){
            Outcome outcome = new Outcome("Scissors decapitate lizard", "lose");

        }else if(e.getName().equals("Paper")){
            Outcome outcome = new Outcome("Lizard eats paper", "win");

        }else if(e.getName().equals("Rock")){
            Outcome outcome = new Outcome("Rock crushes lizard", "lose");
        }else if(e.getName().equals("Spock")){
            Outcome outcome = new Outcome("Lizard poisons spock", "win");
        }
    }
}
