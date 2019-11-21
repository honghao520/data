package structure.demo;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack.pop());
        System.out.println(myStack.search());
    }
}
