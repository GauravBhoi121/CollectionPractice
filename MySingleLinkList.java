import java.util.*;
class NewNode
{
 // private NewNode prev;
    NewNode next;
    int data;
    public NewNode(NewNode next,int data)
    {
      //this.prev=prev;
        this.next=next;
        this.data=data;
    }    
}
class SingleList
{
       NewNode head=null;
       public void addLast(int data)
       {
           NewNode temp=new NewNode(null,data);
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
           }
                
       }
       public void print()
       {
           if(head==null)
           {
             System.out.println("there is no data in the node ");
           }
           else
           {
              NewNode curr=head;
              while(curr!=null)
              {
                 
                 System.out.println(" "+curr.data);
                 curr=curr.next;
                 
              }
           }
      }
      public void addFirst(int data)
      {
            if(head==null)
            {
               
            }
            else
            {
                 
            }    
      }
      public void toFind(int element)
      {
          
      }     
}
class MySingleLinkList
{
         public static void main(String args[])
         {
                  Scanner sc=new Scanner(System.in);
                  SingleList l=new SingleList();
                  l.addLast(10);
                  l.addLast(20);
                  l.addLast(30); 
                  l.addLast(40);
                  
                  System.out.println("Display The List "); 
                  l.print();
         }
}