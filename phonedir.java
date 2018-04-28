/*
name: mdnazmul islam arman
Std: 900867928
purpose:
To gain experience with LinkedList and to be able to use the Java Library
Solution:
we will have a class for customer that will create an object.
the object of customer class will have first name, last name, phone number
or can be created will no value for them.
the customer object will get their value from customer input and then add the customers to the list
if user input duplicate input the program will promt.
the program will always kepp the list sorted using ast name, or not possible firstname or phone number
the program will have a current record
Data stractre used:
LinkedList
and customer class 
Input/outPut:
the program will prompt the user for last name first name ,a and phone number
the program will prompt a list of command to choose from
the user will choose from them and the program will ask fro needed input
then the program as a out put will show the list or 
show the current record of delete a record
purpose of the class:
we have developed a class customer
to hold the information for each customer
and add thses customer data type in the list

*/
import java.util.*;
public class phonedir
{
   public static void main(String[]args) throws IndexOutOfBoundsException
   {  LinkedList<customer> l1 = new LinkedList<customer>();
      customer newCus = new customer();
      if(l1.size()==0)
      {
      System.out.println("No current record");
      }
      customer currentRecord;
      currentRecord = newCus;
      boolean choice = true;
      while(choice==true)// promting the customer to choose from the list of command
      {
      String str1 = "a     Show all records";
      String str2 = "d     Delete the current record";
      String str3 = "f     Change the first name in the current record";
      String str4 = "l     Change the last name in the current record";
      String str5 = "n     Add a new record";
      String str6 = "p     Change the phone number in the current record";
      String str7 = "q     Quit:";
      String str8 = "s     Select a record from the record list to become the current record";
      System.out.println(str1);// printing the list of command
      System.out.println(str2);
      System.out.println(str3);
      System.out.println(str4);
      System.out.println(str5);
      System.out.println(str6);
      System.out.println(str7);
      System.out.println(str8);
      System.out.println("enter a command from the list above(q to quit):");
      Scanner s1 = new Scanner(System.in);
      String str9 = s1.next();
      
      if(str9.equals("a"))// if they choose to print the list
      {if(l1.size()==0)// if the list is empty
         {System.out.println("There is no record found");}
         else
         {displayRecords(l1);//if not the method will print the record in a specified format
               }}
      else if(str9.equals("d"))// if they choose to delete current
      {
      if(l1.size()==0)// if the list is empty there is no record
      {System.out.println("no record has been created yet");}
      else
      {
      System.out.println("deleted");// else the program will delete the record
      System.out.printf("%-26s%-26s%s%n",currentRecord.getfirstName(),currentRecord.getlastName(),currentRecord.getphoneNumber());
      l1.remove(currentRecord);
      int v = l1.size();
      int u =(int)(Math.random()*(v-1));
      try{
      if(u>=0)
      {currentRecord = l1.get(u);}}
      catch(Exception e)
      {System.out.println("No more records lest in the list");}
      }
      }
      else if(str9.equals("f")) //if the user choose to change the first name of current record
      { 
         if(l1.size()==0)
         {System.out.println("the list is empty");}
         else 
         {System.out.println("New first name");
         Scanner s6 = new Scanner(System.in);// the program will take the input and use it change
         String FstN = s6.next();
         currentRecord.setfirstName(FstN);
         sortList(l1);
         System.out.println("Current record is:");// print the result in a format string
         System.out.printf("%-26s%-26s%s%n",currentRecord.getfirstName(),currentRecord.getlastName(),currentRecord.getphoneNumber());
         }}
      else if(str9.equals("l"))// if the customer choose to change last name 
      {  if(l1.size()==0)
      {System.out.println("the list is empty");}
      else
         {System.out.println("New last name");
         Scanner s7 = new Scanner(System.in);
         String laststN = s7.next();// the program will chnage the last name and add it to the list
         currentRecord.setlastName(laststN);
         System.out.println("Current record is:");// print the result in a format string
         System.out.printf("%-26s%-26s%s%n",currentRecord.getfirstName(),currentRecord.getlastName(),currentRecord.getphoneNumber());
                  }}
      else if(str9.equals("n"))// if the customer choose to add new record
      {System.out.println("Enter 1st name:");
      Scanner s2 = new Scanner(System.in);
      String Fn1 = s2.next();
      System.out.println("Enter last name:");// the program will ask the user fro names and phone number and then add it to the lsit
      Scanner s3 = new Scanner(System.in);
      String Ln1 = s2.next();
      System.out.println("Enter phone number:");
      Scanner s4 = new Scanner (System.in);
      String Pn = s3.next();
      customer n1 = new customer(Fn1,Ln1,Pn);
      boolean found=find(n1,l1);
      if(found==false)
      {
      l1.add(n1);
      currentRecord = n1;
      sortList(l1);
      System.out.println("current record is:");
      System.out.printf("%-26s%-26s%s%n",Fn1,Ln1,Pn);
      }
      else
      {System.out.println("Duplicate record");}
      }
      else if(str9.equals("p"))
      {  if(l1.size()==0)
      {System.out.println("the list is empty");}
      else
         {System.out.println("New phone Number for current record");
         Scanner s8 = new Scanner(System.in);
         String phoneN = s8.next();
         currentRecord.setphoneNumber(phoneN);
         sortList(l1);
         System.out.println("Current record is:");// print the result in a format string
         System.out.printf("%-26s%-26s%s%n",currentRecord.getfirstName(),currentRecord.getlastName(),currentRecord.getphoneNumber());
         
         }}
      else if(str9.equals("q"))
      {choice = false;}
      else if(str9.equals("s"))
      {
         if(l1.size()==0)
         {System.out.println("Empty record");}
         else
         {
         System.out.println("Enter first name:");
         Scanner NewScanner = new Scanner(System.in);
         String NewfirstN = NewScanner.next();
         System.out.println("Enter last name:");
         Scanner NewScanner2 = new Scanner(System.in);
         String NewlastName = NewScanner2.next();
         customer NewCustomer = new customer(NewfirstN,NewlastName);
         int j = getInd(NewCustomer, l1);
         currentRecord = l1.get(j);
         System.out.println("New current record is");
         System.out.printf("%-26s%-26s%s%n",currentRecord.getfirstName(),currentRecord.getlastName(),currentRecord.getphoneNumber());
    }}
      else
      {System.out.println("Illegal command");}}}
            
      // the method will sort the list using last name or first name or phone number
      //the method takes a linkedlist as a parameter
  public static void sortList(LinkedList<customer>a)
  {
  int n = a.size();
      int k;
      for(int m =n;m>=0;m--)
      {
         for(int i=0; i < n-1;i++)
         {
            k=i+1;
            if(a.get(i).compareTo(a.get(k))>0)
            {
               swap(i,k,a);}}}}
               //the method swap two element in a linked list
               //it takes two integer and a linked list as a parameter    
   public static void swap(int a,int b,LinkedList<customer>u)
           {
            customer x,y;
            x=u.get(a);
            y= u.get(b);
            u.set(a,y);
            u.set(b,x);
            }
            //this method prints the list in a format strng
           // it takes a linked list as a parameter
  public static void displayRecords(LinkedList<customer> E)
   {
		String format = "%-26s%-26s%s%n";
		System.out.printf(format, "First Name","Last Name","Phone Number");
		System.out.printf(format, "---------","----------","-------------");
		
		for(int i=0;i<E.size();i++)
      {
		customer cs = E.get(i);
      String x=cs.getfirstName();
      String y =cs.getlastName();
      String z =cs.getphoneNumber();
      System.out.printf(format,x,y,z);
		}
      }
      // this method finds a customer object in the list
      // takes a cusotmer object and a linked list as parameter
   public static boolean find(customer p, LinkedList<customer>q)
   {
      int i=0;
      boolean found = false;
      while(i<q.size()&& found==false)
      {
         if(p.equals(q.get(i))==true)
         {
            found = true;
            }
          else{i++;}
         
          }
          return found;}
          //this method finds a customer object in a list using first name and ast name 
          //takes a customer object and linkedlist as a parameter
    public static boolean find2(customer p, LinkedList<customer>s)
    {
    int i=0;
    boolean found = false;
    while(i<s.size()&&found== false)
    {
      if(p.isSame(s.get(i))==true)
      {found = true;}
      else
      {i++;}
    }
    return found;
    }     
     //this method gets the index of the list 
     //takes a customer object and list linked     
   public static int getInd(customer p, LinkedList<customer>s)
   {
   int i = 0;
   boolean found= false;
   while(i<s.size()&&found== false)
    {
      if(p.isSame(s.get(i))==true)
      {return i;}
      else
      {i++;}
    }
   return i ;
   
   }      
          
          
          
          }     