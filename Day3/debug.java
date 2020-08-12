class Stack1 {
    int top = -1;
    String[] s = new String[10];
    
    public void push(String i){
  	  s[++top] = i;
    }
    
    public String pop(){
  	  return s[top--];
    }
    
    public String top1(){
  	  return s[top];
    }
    
    public boolean isEmpty(){
  	  return (top == -1);	
    }
    
}
public class debug {

	public static void main(String[] args) {
		Stack1 stack = new Stack1();
		System.out.println("Is empty = " + stack.isEmpty());
		stack.push("aaa");
		System.out.println("Pop = " + stack.pop());
		System.out.println("Is empty = " + stack.isEmpty());

	}

}
