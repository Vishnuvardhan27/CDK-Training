    import java.util.Scanner;  
    
    
    class Stack_Operations
    {  
        int top;   
        int maxsize = 10;  
        String[] arr = new String[maxsize];  
        Scanner sc = new Scanner(System.in);  
       
        
        boolean isEmpty()  
        {  
            return (top < 0);  
        }
        
        
        Stack_Operations()  
        {  
            top = -1;  
        } 
        
        
        boolean push (Scanner sc)  
        {  
            if(top == maxsize-1)  
            {  
                System.out.println("Overflow !!");  
                return false;  
            }  
            else   
            {  
                System.out.println("Enter Value");  
                String ss; 
                ss= sc.next();  
                top++;  
                arr[top]=ss;  
                System.out.println("String Item pushed :" + ss);  
                return true;  
            }  
        } 
        
        
        String pop ()  
        {  
            if (top == -1)  
            {  
                System.out.println("Underflow !!");  
                return "Stack is Empty";  
            }  
            else   
            {  
               
                System.out.println("Item popped " + arr[top]);
                top --;   
                return "Item Popped Successfully";  
            }  
        }  
        void display ()  
        {  
            System.out.println("Printing stack elements .....");  
            System.out.println("TOP");  
            for(int i = top; i>=0;i--)  
            {  
                System.out.print(arr[i] +" \t");  
            }  
        }  
    }  
    
    
    
    public class Stack {  
    public static void main(String[] args) {  
        int choice=0;  
        Scanner sc = new Scanner(System.in);  
        Stack_Operations s = new Stack_Operations();  
        System.out.println("*********Stack operations using array*********\n");  
        System.out.println("\n------------------------------------------------\n");  
        while(choice != 4)  
        {  
            System.out.println("\nChose one from the below options...\n");  
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");  
            System.out.println("\n Enter your choice \n");        
            choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                {   
                    s.push(sc);  
                    break;  
                }  
                case 2:  
                {  
                    s.pop();  
                    break;  
                }  
                case 3:  
                {  
                    s.display();  
                    break;  
                }  
                case 4:   
                {  
                    System.out.println("Exiting....");  
                    System.exit(0);  
                    break;   
                }  
                default:  
                {  
                    System.out.println("Please Enter valid choice ");  
                }   
            };  
        }  
    }  
    }  