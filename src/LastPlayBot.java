import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LastPlayBot extends Player {
    boolean first = true;
    public LastPlayBot(){
        super.setName("LastPlayBot");
    }

    @Override
    public Element play() {
        List<String> keysAsArray = new ArrayList<>(Main.moves.keySet());
        Random randomizer = new Random();
        Element move = new Element();

        if(first){
            move = Main.moves.get(keysAsArray.get(randomizer.nextInt(keysAsArray.size())));
            first = false;
        }else{
            move = Main.lastPlay;
        }
        return move;
    }
}
