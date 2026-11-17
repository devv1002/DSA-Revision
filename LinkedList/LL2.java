import java.util.*;

class LL2 {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addLast("is");
        System.out.println(list);

        System.out.println(list.size());

        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");


        list.removeFirst();                           //deleting
        list.remove(1);                               //1st index ki value remove hojayegi
        System.out.println(list);
    }
}