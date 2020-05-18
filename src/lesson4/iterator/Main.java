package lesson4.iterator;


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new SimpleLinkedListImpl<>();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        displayAll(list);

        ListIterator<Integer> iterator = (ListIterator<Integer>) list.iterator();
        iterator.reset();
        iterator.remove();

        displayAll(list);

        iterator.insertBefore(1);

        displayAll(list);

        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.insertAfter(6);

        displayAll(list);
    }

    private static void displayAll(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.println(value);
        }
        System.out.println("---------------");
    }
}
