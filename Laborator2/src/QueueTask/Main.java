package QueueTask;

public class Main {
    public static void main(String[] args) {

        Queue queue1 = new Queue(5);
        Queue queue2 = new Queue(6);

        queue1.push(3);
        queue1.push(5);
        queue1.push(7);
        queue1.push(12);

        queue1.pop();

        queue1.push(777);

        System.out.println("The queue has " + queue1.size() + " elements");

        while (!queue1.isEmpty()) {
            int n = queue1.pop();
            System.out.print(n);
            System.out.print(" ");
        }
    }
}
