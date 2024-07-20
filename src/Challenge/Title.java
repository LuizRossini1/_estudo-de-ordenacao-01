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

    public static void main(String[] args) {
        //objects
        var ant = new Title("ant");
        var cat = new Title("cat");
        var bee = new Title("bee");

        //list
        List<Title> objectsList = new ArrayList<>();

        //adding on list
        objectsList.add(ant);
        objectsList.add(cat);
        objectsList.add(bee);

        //loop to printing each object
        for (Title title : objectsList) {
            System.out.println(title.getNome());
        }
        //calling method
        Collections.sort(objectsList);

        //loop to printing each object
        for (Title title : objectsList) {
            System.out.println(title.getNome());
        }
    }
}