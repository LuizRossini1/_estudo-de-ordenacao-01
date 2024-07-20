/* 1 - Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
Em seguida, imprima a lista ordenada.

2 - Crie uma classe Title com um atributo nome do tipo String.
Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Title.

3 - No Exercício 2, crie alguns objetos da classe Title e adicione-os a uma lista.
Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

4 - Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

5 - Modifique o Exercício 4 para declarar a variável de lista como a interface List,
demonstrando o uso de polimorfismo. */
package Challenge;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //instantiating a list
        List<Integer> numberList = new ArrayList<>();

        //variables
        int numero1 = 1;
        int numero2 = 5;
        int numero3 = 10;

        //adding on list
        numberList.add(numero1);
        numberList.add(numero2);
        numberList.add(numero3);

        //printing list
        System.out.println(numberList);
    }
}