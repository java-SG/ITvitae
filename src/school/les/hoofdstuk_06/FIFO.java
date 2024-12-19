package school.les.hoofdstuk_06;

import java.util.ArrayList;

public class FIFO implements Queue {

    public ArrayList<Integer> numberQueue = new ArrayList<Integer>();
    public int value;

    @Override
    public void add(int value) {
        numberQueue.add(value);
        System.out.println(value + " has been added");
    }

    @Override
    public int remove(int index) {
        return numberQueue.remove(index);
    }

    @Override
    public int peek() {
        return numberQueue.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return numberQueue.isEmpty();
    }

    @Override
    public int size() {
        return numberQueue.size();
    }

    @Override
    public void print() {
        System.out.println("The Queue currently is: " + numberQueue);
    }

    @Override
    public void clear() {
        numberQueue.clear();
        System.out.println("The Queue has been cleared");
    }

    @Override
    public void clear(int n) {
        for (int i = 0; i < n && !numberQueue.isEmpty(); i++) {
            numberQueue.remove(numberQueue.size() - 1); // Removes last n-numbers of numberQueue (the ones that were in first)
        }
    }

    @Override
    public void printReverse() {
        // One line master race
        for (int i = 1; i <= (numberQueue.size() - 1); i++) System.out.print((numberQueue.isEmpty()) ? "There is no Number Queue." : ((i == 1) ? "[" : "") + numberQueue.get(numberQueue.size() - i) + (!(i == numberQueue.size() - 1) ? ", " : (", " + numberQueue.get(0) + "] the Number Queue reversed.\n")));
        /*
        for (int i = 1; i <= (numberQueue.size() - 1); i++) {
            if (numberQueue.isEmpty()) {
                System.out.print("There is no Number Queue.");
            } else {
                if (i == 1) {
                    System.out.print("[");
                }
                System.out.print(numberQueue.get(numberQueue.size() - i));
                if (!(i == numberQueue.size() - 1)) {
                    System.out.print(", ");
                } else {
                    System.out.print(", " + numberQueue.get(0) + "] the Number Queue reversed.\n");
                }
            }
        }
        */
    }

    @Override
    public String toString() {
        return numberQueue.toString();
    }

    @Override
    public void jumpTheQueue(int n, int value) {
        if (n < (numberQueue.size() - 1)) {
            numberQueue.add(n, value);
        } else {
            System.out.println("Usually when someone jumps the Queue, they actually cut ahead, but now you've just entered the Queue, like a totally insane normal person.");
            numberQueue.add(value);
        }
    }

    @Override
    public boolean equals(Queue q) {
        // ???????????????????????????????????????
        return numberQueue.equals(q);
    }

    @Override
    public int indexOf(int value) {
        return numberQueue.indexOf(value);
    }

    @Override
    public int lastIndexOf(int value) {
        return numberQueue.lastIndexOf(value);
    }
}
