class Linkedlist
{
    Node head;
    class Node
    {
        int data;
        Node next;
        
        Node(int val)
        {
            data = val;
            next = null;
        }
    }
    
    Linkedlist()
    {
        head = null;
    }
    
    void insert(int val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head = newnode;
            return;
        }
        else
        {
            newnode.next = head;
            head = newnode;
        }
    }
    
    void display()
    {
        Node temp = head;
        
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    void insertpos(int p,int val){
        Node newnode=new Node(val);
        if(p==0){
            insert(val);
            return;
        }
        else{
            Node temp=head;
            for(int i=0;i<p;i++){
                if(temp==null){
                    System.out.println("insertion not possible");
                    return;
                }
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    void delete(int p){
        Node temp=head;
        for(int i=0;i<p-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    
}

public class Main
{
    public static void main (String[] args) 
    {
        Linkedlist l = new Linkedlist();
        l.insert(100);
        l.insert(200);
        l.insert(300);
        l.display();
        System.out.println("-----------");
        l.insertpos(2,500);
        l.display();
        System.out.println("------------");
        l.delete(2);
        l.display();
    }
}
