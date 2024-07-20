package Challenge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Title implements Comparable {
    //variable
    private String nome;

    //gettter
    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        //objects
        var horse = new Title();
        var cat = new Title();
        var bee = new Title();

        //list
        List<Title> objectsList = new ArrayList<>();

        //adding on list
        objectsList.add(horse);
        objectsList.add(cat);
        objectsList.add(bee);

        System.out.println(objectsList);
        Collections.sort(objectsList);
        System.out.println(objectsList);

    }
}