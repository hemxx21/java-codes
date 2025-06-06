import java.util.*;
public class Main
{
    static final int max=10;
    static int[] stack=new int[max];
    static int top=-1;
    static void push(int val){
        if(top>=max){
            System.out.println("stack overflow");
            return;
        }
        stack[++top]=val;
        System.out.println(val+" is pushed into the stack");
    }
    static void pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println(stack[top--]+" is popped");
    }
    static void peak(){
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        System.out.println("the top element is "+stack[top]);
    }
	public static void main(String[] args) {
	    push(10);
	    push(70);
	    push(60);
	    pop();
	    peak();
	}
}
