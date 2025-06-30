import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task 1
        List<Integer> task1List = new ArrayList<>();
        task1List.add(31);
        task1List.add(65);
        task1List.add(92);
        task1List.add(24);
        task1List.add(35);

        System.out.println("Lista: " + task1List);
        System.out.println("Mínimo: " + Collections.min(task1List));
        System.out.println("Máximo: " + Collections.max(task1List));
        System.out.println("Resultado: " + (Collections.max(task1List) - Collections.min(task1List)));


    }
}