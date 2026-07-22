import java.util.*;
class ListMethods
{
      List l=new ArrayList();
      public void toAdd(int element)
      {
           if(l.add(element))
           {
             System.out.println("Add Successfully.....");
           }
           else
           {
               System.out.println("Not Add");
           }
           
      }
      public void toAdd(int element,int index)
      {
           if(l.add(element,index))
           {
             System.out.println("Add Successfully.....");
           }
           else
           {
               System.out.println("Not Add");
           }
           
      }
      public void toDisplay()
      {
           Iterator i= l.iterator();
           while(i.hasNext())
           {
               Object obj=i.next();
               System.out.println(obj);
           } 
              
       }
}
class ListAllMethodsInOne
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Add Data In Collection ");
        ListMethods lm=new ListMethods();

        do
        {
         System.out.println("10. Add Element To List");
         System.out.println(" 1. add(int index, E element) \n 2. get(int index)\n 3.set(int index, E element)" );
         System.out.println(" 4. remove(int index) \n 5.indexOf() \n 6. lastIndexOf() \n 7. listIterator() \n 8. subList()");
         System.out.println("11 . For Display ");
           System.out.println("Enter the Choice what Method Will You Want to Use");
           int choice =sc.nextInt();
           switch(choice)
           {
                case 1:
                        System.out.println
                        break;
                case 2:
                        break;
                case 3:
                        break;
                case 4:
                        break;
                case 5:
                        break;
                case 6:
                        break;
                case 7:
                        break;
                case 8:
                        break;
                case 9:
                        break;
                case 10: 
                         System.out.println("Enter the Value ");
                         int value =sc.nextInt();
                         lm.toAdd();
                        break;
                case 11:
                         System.out.println("Display Elenments");
                         lm.toDisplay();
                default:
                           System.out.println("Wrong Choice ");
           }
       } while(true);
     }
}