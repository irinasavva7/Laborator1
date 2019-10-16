package QueueTask;

public class Queue {
        int maxSize;
        int[] queueArray;
        int front;
        int back;
        int numberOfItems;

        public Queue(int size) {
            maxSize = size;
            queueArray = new int[maxSize];
            front = 0;
            back = -1;
            numberOfItems = 0;
        }

        public void push(int elementAdded) {
            if (back == maxSize - 1)
                back = -1;
            queueArray[++back] = elementAdded;
            numberOfItems++;
        }


        public int pop() {
            int temp = queueArray[front++];
            if (front == maxSize)
                front = 0;
            numberOfItems--;
            return temp;
        }


        public boolean isEmpty() {
            return (numberOfItems == 0);
        }

        public int size() {
            return numberOfItems;
        }
    }
