import java.util.*;
class NewNode
{
   int data;
   NewNode next;
   NewNode prev;
   
   public NewNode(NewNode next,NewNode prev,int data)
   {
       this.prev=prev;
       this.next=next;
       this.data=data;
   }
}
class MyLinkdList
{
     NewNode head=null; 
   public void insert(int data)
   {
        NewNode temp=new NewNode(null,null,data);
        if(head==null)
        {
            head=temp;
        }
        else
        {
             NewNode curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=temp;
            temp.prev=curr;
        }
        System.out.println("Data Is Inserted");
     }
     public void display()
     {
        NewNode temp=head;
        while(temp!=null)
        {
           System.out.println(" "+temp.data);
           temp=temp.next;
           
        }
     }
}
class ParformOpretion
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Insert data");
        MyLinkdList list=new MyLinkdList();
        list.insert(10);
        list.insert(20);
        System.out.println("Display data");
        list.display();
     }
}