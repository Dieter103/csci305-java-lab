import java.util.ArrayList;
import java.util.List;

public class IterativeBot extends Player{
    int counter = 0;
    public IterativeBot(){
        super.setName("IterativeBot");
    }

    @Override
    public Element play() {
        List<String> keysAsArray = new ArrayList<>(Main.moves.keySet());

        if(counter == 5)
            counter = 0;

        return Main.moves.get(keysAsArray.get(counter++));
    }
}
