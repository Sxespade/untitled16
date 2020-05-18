package lesson3.Task3;

import lesson3.Task1.queue.QueueImpl;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {

    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public E removeLeft() {
        return super.remove();
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        if (tail < 0) tail = data.length - 1;

        size--;
        return data[tail--];
    }

    @Override
    public boolean insertLeft(E value) {
        return super.insert(value);
    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {return false;}

        if (head - 1 < 0) head = data.length;

        data[--head] = value;
        size++;
        return  true;

    }
}
