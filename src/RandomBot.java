import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBot extends Player{
    public RandomBot(){
        super.setName("RandomBot");
    }

    @Override
    public Element play(){
        List<String> keysAsArray = new ArrayList<>(Main.moves.keySet());
        Random randomizer = new Random();


        return Main.moves.get(keysAsArray.get(randomizer.nextInt(keysAsArray.size())));
    }
}
