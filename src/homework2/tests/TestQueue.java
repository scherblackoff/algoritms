package homework2.tests;

import homework2.queueImpl.DequeImpl;
import homework2.queueImpl.PriorityQueue;
import homework2.queueImpl.Queue;
import homework2.queueImpl.QueueImpl;

public class TestQueue {

    public static void main(String[] args) {
        /*testQueue();*/
        testDeque();
        /*testPriorityQueue();*/
    }

    public static void testPriorityQueue(){
        Queue<Integer> priorityQueue = new PriorityQueue<>(10);
        priorityQueue.insertLeft(3);
        priorityQueue.insertLeft(1);
        priorityQueue.insertLeft(2);
        priorityQueue.insertLeft(3);
        for (int i = 0; i < 4; i++) {
            System.out.println(priorityQueue.removeRight());
        }
    }

    public static void testDeque(){
        DequeImpl<Integer> deque = new DequeImpl<>(10);
        for (int i = 0; i < 10; i++) {
            deque.insertLeft(i);
        }
        /*for (int i = 0; i < 5; i++) {
            deque.insertRight(i);
        }*/
        /*for (int i = 5; i < 10; i++) {
            System.out.println(deque.removeRight());
        }*/
        for (int i = 0; i < 6; i++) {
            System.out.println(deque.removeLeft());
        }
        for (int i = 4; i < 10; i++) {
            System.out.println(deque.insertRight(i));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(deque.removeLeft());
        }
        /*System.out.println(deque.peekHead());*/
        System.out.println(deque.size());
    }

    public static void testQueue(){
        Queue<Integer> queue = new QueueImpl<>(10);
        for (int i = 0; i < 10; i++) {
            queue.insertLeft(i);
        }

        System.out.println(queue.peekHead());

        for (int i = 0; i < 5; i++) {
            queue.removeRight();
        }

        /*System.out.println(queue.peekHead());*/

        System.out.println(queue.insertLeft(3));
        queue.insertLeft(3);

        /*System.out.println(queue.peekHead());

        System.out.println(queue.remove());

        System.out.println(queue.remove());*/

        System.out.println(queue.size());
        for (int i = 0; i < 7; i++) {
            System.out.println(queue.removeRight());
        }
    }
}
