package lesson2;

public interface Array<E> {

    int INITIAL_CAPACITY = 4;

    public E remove(int index);

    void add(E value);

    E get(int a);

    int size();

    default void display() {
        System.out.print("[");
        for (int i = 0; i < size(); i++) {
            E value = get(i);
            System.out.print(value + ", ");
        }
        System.out.println("]");
    }

    void sortBubble(boolean wasChangedMode);
    void sortSelect();
    void sortInsert();

}
