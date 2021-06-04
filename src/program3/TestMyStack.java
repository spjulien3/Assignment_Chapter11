package program3;

public class TestMyStack {
    public static void main(String[]args) {
        MyStack stk = new MyStack();
        stk.push("Abbi");
        stk.push("Billy");
        stk.push("Candice");
        stk.push("Derrick");
        stk.push("Esther");
        System.out.println(stk);
        System.out.print(stk.pop()+" ");
        System.out.print(stk.pop()+" ");
        System.out.print(stk.pop()+" ");
        System.out.print(stk.pop()+" ");
        System.out.print(stk.pop()+" ");
        // prints Esther Derrick Candice Billy Abbi
    }
}
