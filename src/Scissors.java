public class Scissors extends Element{
    public Scissors(){
        super.setName("Scissors");
    }
    @Override
    public void compareTo(Element e) {

        if(this.getName().equals(e.getName())){
            Outcome outcome = new Outcome("Scissors equal scissors", "tie");

        }else if(e.getName().equals("Lizard")){
            Outcome outcome = new Outcome("Scissors decapitate lizard", "win");

        }else if(e.getName().equals("Paper")){
            Outcome outcome = new Outcome("Scissors cut paper", "win");

        }else if(e.getName().equals("Rock")){
            Outcome outcome = new Outcome("Rock crushes scissors", "lose");
        }else if(e.getName().equals("Spock")){
            Outcome outcome = new Outcome("Spock smashes scissors", "lose");
        }
    }
}
