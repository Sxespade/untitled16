package lesson3.Task3;

import lesson3.Task1.queue.Queue;

public interface Deque<E> extends Queue<E> {

    E removeLeft();
    E removeRight();

    boolean insertLeft(E value);
    boolean insertRight(E value);
}