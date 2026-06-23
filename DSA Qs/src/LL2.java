import java.util.*;

public class LL2 {
    static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addFirst("This");
        list.add("list"); // By default, add will add new node at last

        System.out.println(list);

        System.out.println(list.size());

//        for (int i=0; i<list.size(); i++){
//            System.out.print(list.get(i)+" -> ");
//        }
//        System.out.println("null");

        // Using enhanced for loop (for-each)
        for (String element : list){
            System.out.print(element+" -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }
}
