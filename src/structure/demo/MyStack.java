package structure.demo;

/**
 * 栈
 */
public class MyStack {
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    //数据入栈
    public void push(int element) {
        int newArr[] = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    //数据出栈
    public int pop() {
        if (elements.length==0){
            throw new RuntimeException("数组为空");
        }
        int element = elements[elements.length-1];
        int [] newArr= new int[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;

        return element;
    }
    public int search(){
        if (elements.length==0){
            throw new RuntimeException("数组为空");
        }
        int element = elements.length-1;
        return elements[element];
    }
}
