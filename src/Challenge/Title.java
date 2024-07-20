package Challenge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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
        //more objects
        var chicken = new Title("Chicken");
        var dog = new Title("Dog");
        var worm = new Title("Worm");

        //lists
        List<Title> objectsList = new ArrayList<>();
        List<Title> otherList = new LinkedList<>();

        //adding on list
        objectsList.add(ant);
        objectsList.add(cat);
        objectsList.add(bee);
        //adding on another list
        otherList.add(chicken);
        otherList.add(worm);
        otherList.add(dog);

        //loop to printing each object without order
        for (Title title : objectsList) {
            System.out.println("List without order: " +title.getNome());
        }

        //calling method
        Collections.sort(objectsList);
        //loop to printing each object with order
        for (Title title : objectsList) {
            System.out.println("List with order: " +title.getNome());
        }

        //loop to printing each object of another list without order
        for (Title title : otherList) {
            System.out.println("List without order: " +title.getNome());
        }

        //calling method of another list
        Collections.sort(otherList);
        //loop to printing each object of another list with order
        for (Title title : otherList) {
            System.out.println("List with order: " +title.getNome());
        }

        //polimorfism with Lists
        List<String> list;

        list = new ArrayList<>();
        list.add("a");
        System.out.println(list);

        list = new LinkedList<>();
        list.add("b");
        System.out.println(list);
    }
}