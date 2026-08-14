/*
Q25.Problem Statement 
Develop a patient management system using Vector and POJO class Patient. 
Fields 
 int patientId 
 String name 
 int age 
 String disease 
Operations 
1. Add patients 
2. Display patients 
3. Find oldest patient 
4. Search by disease 
5. Count patients above age 50 
Input 
3 patients 
101 Ravi 65 Diabetes 
102 Anil 45 Fever 
103 Sunil 72 BP 
Disease search: 
BP 
Output 
Patient List: 
101 Ravi 65 Diabetes 
102 Anil 45 Fever 
103 Sunil 72 BP 
Oldest Patient: 
Sunil 
BP Patients: 
Sunil 
Patients above 50: 
2                    */
import java.util.*;
class Patient
{
    private int patientId;
    private String name;
    private int age;
    private String disease;
       
   public Patient(String Id,String name,String age,String disease)
   {
         this.patientId=Integer.parseInt(Id);
         this.name=name;
         this.age=Integer.parseInt(age);
         this.disease=disease;
   }
   public Patient(){}
     
   public String getName()
   {
       return name;
   }
   public int getPatientId()
   {
      return patientId;
   }
   public String getDesease()
   {
      return disease;
   }
   public int  getAge()
   {
      return age;
   }
    
}
class PatientApp
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          ArrayList v=new ArrayList();
          Patient p=new Patient();
          do
          {
                System.out.println("1. Add patients ");
                System.out.println("2. Display patients ");
                System.out.println("3. Find oldest patient ");
                System.out.println("4. Search by disease ");
                System.out.println("5. Count patients above age 50 ");
                
                System.out.println("Enter the choice ");
                int choice = sc.nextInt();
                switch(choice )
                {
                   case 1:
                            System.out.println("Id Name Age Desease");
                            sc.nextLine();
                            v.add(new Patient(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));

                           break;
                   case 2:
                           System.out.println("Display all Patient ");
                           for(Object o: v)
                           {
                              p=(Patient)o;
                              System.out.println(p.getPatientId()+" "+p.getName()+" "+p.getAge()+" "+p.getDesease());
                           }
                           break;
                   case 3:
                           int Max=0;
                           for(Object o:v )
                           {
                               p=(Patient)o;
                              if(p.getAge()>Max)
                              {
                                  Max=p.getAge();
                              }
                           }
                           for(Object o:v)
                           {
                               p=(Patient)o;
                              if(p.getAge()==Max)
                              {
                                 System.out.println(p.getPatientId()+" "+p.getName()+" "+p.getAge()+" "+p.getDesease());
                              }
                          }
                           break;
                   case 4:
                            System.out.println("Enter the desease Name ");
                            sc.nextLine();
                            String desName=sc.nextLine();
                           for(Object o:v)
                           {
                               p=(Patient)o;
                              if(desName.equals(p.getAge()))
                              {
                                 System.out.println(p.getPatientId()+" "+p.getName()+" "+p.getAge()+" "+p.getDesease());
                              }
                          }
                           break;
                   case 5:
                            int count=0;
                           for(Object o:v)
                           {
                               p=(Patient)o;
                              if(p.getAge()>50)
                              {
                                 count++;
                              }
                          }
                           System.out.println("Patient Count = "+count);
                           break;
                   default:
                           System.out.println("this is the wrong choice");
                }
          }while(true);
     }
}