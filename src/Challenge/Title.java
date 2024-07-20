package Challenge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Title implements Comparable<Title> {
    //variable
    private String nome;

    //constructor
    public Title(String nome) {
        this.nome = nome;
    }

    //gettter
    public String getNome() {
        return this.nome;
    }

    @Override
    public int compareTo(Title other) {
        return this.nome.compareTo(other.nome);
    }

    @Override
    public String toString() {
        return nome;
    }

    public static void main(String[] args) {
        //objects
        var horse = new Title("horse");
        var cat = new Title("cat");
        var bee = new Title("bee");

        //list
        List<Title> objectsList = new ArrayList<>();

        //adding on list
        objectsList.add(horse);
        objectsList.add(cat);
        objectsList.add(bee);

        //printing list without order
        System.out.println(objectsList);
    }
}