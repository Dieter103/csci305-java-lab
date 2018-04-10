public class Spock extends Element{
    public Spock(){
        super.setName("Spock");
    }

    @Override
    public void compareTo(Element e) {

        if(this.getName().equals(e.getName())){
            Outcome outcome = new Outcome("Spock equals spock", "tie");

        }else if(e.getName().equals("Scissors")){
            Outcome outcome = new Outcome("Spock smashes scissors", "win");

        }else if(e.getName().equals("Paper")){
            Outcome outcome = new Outcome("Paper disproves spock", "lose");

        }else if(e.getName().equals("Rock")){
            Outcome outcome = new Outcome("Spock vaporizes rock", "win");
        }else if(e.getName().equals("Spock")){
            Outcome outcome = new Outcome("Lizard poisons spock", "lose");
        }
    }
}
