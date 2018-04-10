import com.sun.javafx.collections.MappingChange;
import com.sun.xml.internal.bind.v2.runtime.output.NamespaceContextImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static final Map<String, Element> moves = new HashMap<String,Element>();
    static final Element lastPlay = new Element();



    public static void main(String [] args){
        moves.put("Rock", new Rock());
        moves.put("Paper", new Paper());
        moves.put("Scissors", new Scissors());
        moves.put("Lizard", new Lizard());
        moves.put("Spock", new Spock());
        System.out.println("hello world");
        Element rock = new Rock();
        Element paper = new Paper();
        Player p1 = new IterativeBot();
        Element p1Move = p1.play();


        rock.compareTo(p1Move);
        p1Move = p1.play();
        rock.compareTo(p1Move);
        p1Move = p1.play();
        rock.compareTo(p1Move);
        p1Move = p1.play();
        rock.compareTo(p1Move);
        p1Move = p1.play();
        rock.compareTo(p1Move);
        p1Move = p1.play();
        rock.compareTo(p1Move);
        p1Move = p1.play();
        rock.compareTo(p1Move);
//        rock.compareTo(paper);
//        paper.compareTo(rock);
    }
}
