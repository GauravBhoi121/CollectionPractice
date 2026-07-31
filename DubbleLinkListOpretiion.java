import java.util.*;
class Noden
{
    int data;
    Noden prev;
    Noden next;
    public Noden(Noden prev,Noden next,int data)
    {
        this.prev=prev;
        this.next=next;
        this.data=data;
    }
}
class DList
{
    Noden head=null;
    Noden last=null;
    public void insert(int data)
    {
        Noden n=new Noden(null,null,data);
        if(head==null)
        {
             
             head=n;
             last=n;
        }
        else 
        {
           last.next=n;
            n.prev=last;
            last=n;
        }
          
    }
    public void display()
    {
        Noden curr=head;
        while(curr!=null)
        {
            System.out.println(" "+curr.data);
            curr=curr.next;
        }
    }
    public void insertBigining(int data)
    {
        Noden temp=new Noden(null,null,data);
        if(head!=null)
        {
          temp.next=head;
          head.prev=temp;
        }
        head=temp;
        
    }
    public void revers()
    {
        Noden curr=last;
        while(curr!=null)
        {
             System.out.println(""+curr.data);
             curr=curr.prev;
        }  
    }
}
class DubbleLinkListOpretiion
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         DList dlist=new DList();
         do
         {
            System.out.println("1.Insert data in Bigining ");
            System.out.println("2.Insert data in End ");
            System.out.println("3.Display data in forword Direction");
            System.out.println("4.Display data in BackWord Direction");
            System.out.println("5.");
            int choice =sc.nextInt();
            switch(choice)
            {
                  case 2:
                               int data=sc.nextInt();
                               dlist.insert(data);
                               break;
                  case 1:
                               data=sc.nextInt();
                               dlist.insertBigining(data);
                               break;
                  case 3:
                               dlist.display();
                               break;
                  case 4:
                               System.out.println("print revers ");
                               dlist.revers();
                               break;
                  default :
                             System.out.println("Wrong choice Bro");
            }  
         }while(true);
     }
}