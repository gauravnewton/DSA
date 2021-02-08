import techreloded.linear.Stack;

public class DriverClass {
    public static void main(String[] args) {
        //Driver class
        Stack stack = new Stack(10);
        stack.size();
        System.out.println("isEmpty :"+stack.isEmpty());
        System.out.println("isFull :"+stack.isFull());

        stack.push(23);
        stack.size();
        stack.print();

        stack.push(12);
        stack.push(22);
        stack.push(-11);

        stack.print();

        stack.peek();

        System.out.println(stack.pop());
        stack.print();



    }
}
