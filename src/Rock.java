public class Rock extends Element {
    public Rock(){
        super.setName("Rock");

    }
    @Override
    public void compareTo(Element e) {

        if(this.getName().equals(e.getName())){
            Outcome outcome = new Outcome("Rock equals rock", "tie");

        }else if(e.getName().equals("Lizard")){
            Outcome outcome = new Outcome("Rock crushes Lizard", "win");

        }else if(e.getName().equals("Scissors")){
            Outcome outcome = new Outcome("Rock crushes scissors", "win");

        }else if(e.getName().equals("Paper")){
            Outcome outcome = new Outcome("Paper covers rock", "lose");
        }else if(e.getName().equals("Spock")){
            Outcome outcome = new Outcome("Spock vaporizes rock", "lose");
        }
    }
}
