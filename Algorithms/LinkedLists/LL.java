package Algorithms.LinkedLists;

import java.util.Scanner;

public class LL {
    public static <T> void print(LinkedListGeneric<?> ll) {
        Iterator it = ll.getIterator();
        while (it.has_next()) {
            System.out.println(it.get_next());
        }
    }

    public static void main(String[] args) {
        LinkedListGeneric<Number> ll = new LinkedListGeneric<Number>();
        System.out.println("1 -> insert, 2 -> remove, 3 -> print, 4 -> exit");
        Scanner sc = new Scanner(System.in);
        while (true) { // for(;;)
            int loop = sc.nextInt();
            switch (loop) {
                case 1:
                    int number = sc.nextInt();
                    Number n = new Number(number);
                    ll.insertAtFront(n);
                    break;
                case 2:
                    ll.removeFromFront();
                    break;
                case 3:
                    ll.print();
                default:
                    break;
            }
        }
    }
}

interface Iterator<I> {
    boolean has_next();

    I get_next();
}

class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number + " --> ";
    }
}

class LinkedListGeneric<T> {
    private Node head;

    LinkedListGeneric() {
        head = null;
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T d) {
            data = d;
            next = null;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public void insertAtFront(T data) {
        Node nd = new Node(data);
        if (head == null) {
            head = nd;
        } else {
            nd.next = head;
            head = nd;
        }
    }

    public void removeFromFront() {
        T removedData = head.data;
        head = head.next;
    }

    public Iterator getIterator() {
        return new LLIterator();
    }

    private class LLIterator implements Iterator {
        Node t;

        public LLIterator() {
            t = null;
        }

        public boolean has_next() {
            if (t == null && head == null) {
                return false;
            } else if (t == null && head != null) {
                return true;
            } else if (t != null && t.next == null) {
                return false;
            } else
                return true;
        }

        public T get_next() {
            if (t == null) {
                t = head;
            } else {
                t = t.next;
            }
            return t.data;
        }
    }
}
