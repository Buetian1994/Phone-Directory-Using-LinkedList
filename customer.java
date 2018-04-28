/*
this is my customer class
this class create an object to hold the information about customer
this class has get and set method
this class also has compareTo and equals method to compare two object of this class


*/
public class customer
{
   private String firstName;
   private String lastName;
   private String phoneNumber;
   
   public customer(String a, String b, String c)//constructor  
   {
      this.firstName = a;
      this.lastName = b;
      this.phoneNumber = c;
      }
     public customer()//empty constructor
     {
     }
     public customer(String p, String q)
     {
     this.firstName = p;
     this.lastName = q;
     }
     // methid to get the first name of the class object
   public String getfirstName()
   {
      return firstName;
      }
    public String getlastName()// method to get the last name of the class object
    {
      return lastName;
     }
    public String getphoneNumber()// this method returns the last name of the object
    {
      return phoneNumber;
      }
    public void setfirstName(String d)
    {
      firstName = d;
      }
    public void setlastName(String e)
    {
      lastName = e;
      }
    public void setphoneNumber(String f)
    {
      phoneNumber = f;
      }
    public int compareTo(customer a)// compareTo method rewritten to compare two object of customer class
    {
    if(this.getlastName().compareTo(a.getlastName())!=0)// this compare to returns int value compareing the last, first and phone number data field of customer class object
      {
         return this.getlastName().compareTo(a.getlastName());
         }
      else if(this.getfirstName().compareTo(a.getfirstName())!=0)
      {
      return this.getfirstName().compareTo(a.getfirstName());
      }
      else
      {return this.getphoneNumber().compareTo(getphoneNumber());}
    }
    public boolean equals(customer N)// equals method over written to see if two object are equals
    { String p = this.getlastName();// this method compares last name, first name and phone number to declare them equal
      String q = this.getfirstName();
      String r = N.getlastName();
      String s = N.getfirstName();
      String t = this.getphoneNumber();
      String u = N.getphoneNumber();
      if(p.equalsIgnoreCase(r)||q.equalsIgnoreCase(s)||t.equalsIgnoreCase(u))//ignoring case
      {return true ;}
      else
      {return false;}
    }
    public boolean isSame(customer N)// this is same method checks if two objects are equals comparing their first and last name
    {
    String p = this.getlastName();
    String q = this.getfirstName();
    String r = N.getlastName();
    String s = N.getfirstName();
    if(p.equalsIgnoreCase(r)||q.equalsIgnoreCase(s))
    {return true;}
    else
    {return false;}

    }
    }
      
         