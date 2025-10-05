import java.util.*;
class Arrayofobject
{
    String bname;
    int bid;
    boolean bkst;
    public void arrayofobject(String bname,int bid)
   {
     this.bname=bname;
     this.bid=bid+2000;
     this.bkst=true;
   }
}
class Students
{
    String sname;
    int id;
    int pass;
    int re;
    ArrayList <Integer> relist=new ArrayList<Integer>();
    Students(String sname,int id,int pass,int re)
    {
        this.sname=sname;
        this.id=id;
        this.pass=pass;
        this.re=re;
    }
}
class Librarian// extends Arrayofobject
    {
           public static  Arrayofobject[] ob=new Arrayofobject[50];
           static int h;
           public static int nn=0;
           static Scanner sc=new Scanner(System.in);
           static void report()
            {
                int i;
                //ob[gbn2].bkst=false;
                for(i=0;i<nn;i++)
                {
                  System.out.println( ob[i].bname);
                }
                System.out.println("Total number of books in the library "+nn);
                System.out.println("number of books available in the library ");
                lbview();
            }
            static boolean lbmm()
            {
             // boolean f=true;
               while(true)
               {
                System.out.println("1.Add book\n2.View Books\n3.report\n4.Logout ");
                int z=sc.nextInt();
                if(z==1)
                {
                 add();
                }
                else if(z==2)
                {
                 lbview(); 
                }
                else if(z==3)
                {        
                 report();
                }
                else if(z==4)
                {
                 return false;
                }
            }
     }
            static void add()
            {   
                int i=0;
                int kk=0;
                System.out.print("how many books to add :"); 
                int h=sc.nextInt();
                for(i=0;i<h;i++)
                {
                System.out.printf("Enter the book name :");
                String ss=sc.next();
                ob[i]=new Arrayofobject();
                ob[i].arrayofobject(ss,nn);
                nn++;
                }
                System.out.println("Book added successfully!!");
                //here h refers to no of books to get & store
                
            }
         static void lbview() 
            { 
               int i=0;
               for( i=0 ;i<nn;i++ )
                {
                  //ob[i]=new Arrayofobject();
                  if(ob[i].bkst==true)
                    {
                      System.out.println(ob[i].bid +" "+ ob[i].bname);
                    }
                }
              System.out.println("These are the books in the library.");
            } 
    }    
 class Student extends Librarian 
    {   
        static Scanner sc=new Scanner(System.in);
        public boolean stmm()
            {
              Student q=new Student();
              while(true)
               {
                   System.out.println(" 1.view books \n 2.Get book \n 3.return book \n 4.Logout");
                   boolean f=true;
                   int op=sc.nextInt();  
                   if(op==1)
                   {
                     //Librarian b=new Librarian();
                     lbview();
                    }
                    else if(op==2)
                    {   
                      get();
                     //public static void get()
                     //{
                       
                    }
                   else if(op==3)
                   {
                      System.out.println("please enter the book number: ");
                      int rbno=sc.nextInt();
                      int i;
                       int  rbno2=rbno-1;
                        for(i=0;i<=50;i++)
                            {
                              if(i==rbno2&&ob[rbno2].bkst==false)
                                {
                                  System.out.println(ob[rbno2].bname);
                                  ob[rbno2].bkst=true;
                                }
                            }
                       System.out.println("Thank you for returning the book ");
                    }
                    else
                    {
                       return false;
                    }
                }
            }        
        public static void get()
           { 
             System.out.println("please enter the book no which you want:");
             int gbn=sc.nextInt();
             int gbn2=gbn-1,i;
             for(i=0;i<=50;i++)
                {
                  if(i==gbn2&&ob[gbn2].bkst==true)
                   { 
                       System.out.println("Here is your book: "+ ob[gbn2].bname);
                       ob[gbn2].bkst=false;
                       break;
                    } 
                }
            }
           
    }
class LibraryManagementSystem extends Student
    {
      public  static int nn=0;
      public static ArrayList<Students> nme=new ArrayList<Students>(); 
      public static void main(String args[])
        { 
          Scanner sc =new Scanner(System.in);
          while(true)
            { 
              boolean f=true;
              System.out.println("Login as \n 1.Librarian \n 2.Student \n 3.exit");
              int n=sc.nextInt();
              if(n==1)
                {
                  Librarian a=new Librarian();
                  System.out.print("Enter the name : " );
                  String  name=sc.next();
                  System.out.print("Enter password : ");
                  int pass =sc.nextInt(); 
                  a.lbmm();
                }
              else if(n==2)
                {   boolean ff=true;
                   // Student q=new Student();
                    while(true)
                    {
                      System.out.println("1.Signup\n2.Sigin\n3.exit");
                      int c=sc.nextInt();
                      if(c==1)
                        {  
                         System.out.println("It's time to register your details : " );
                         //int i=0;
                          System.out.println("please enter your name : ");
                          String snme=sc.next();
                          System.out.println("please enter your ID as per your roll no: ");
                          int i=sc.nextInt();
                          // int sid=sc.nextInt();
                          System.out.println("enter your password : ");
                          int p=sc.nextInt();
                          //Students d=new Students(snme,i,p);
                          nme.add(new Students(snme,i,p,0));
                          // System.out.println(i);
                          System.out.println("Thank you for registering " );
                        }
                      else if(c==2)
                        {
                         System.out.println("welcome to library!!\nWe are happy to see u here\n  ");
                         /* System.out.println("enter your name : ");
                         String sn=sc.next();*/
                         System.out.println("Enter your ID NO :");
                         int ID=sc.nextInt(),i;
                         System.out.print("Enter the password : ");
                         int pass=sc.nextInt();
                         for(Students z:nme)
                            {
                             
                                if( ID==z.id&&pass==z.pass)
                                {
                                  while(true)
                                   {
                                       System.out.println(" 1.view books \n 2.Get book \n 3.return book \n 4.Logout");
                                       //boolean f=true;
                                       int op=sc.nextInt();  
                                       if(op==1)
                                        {
                                         //Librarian b=new Librarian();
                                         lbview();
                                        }
                                        else if(op==2)
                                        {   
                                          //get();
                                          System.out.println("please enter the book no which you want:");
                                          int gbn=sc.nextInt();
                                          int gbn2=gbn-1;
                                          for(int b=0;b<=50;b++)
                                            {
                                              if(b==gbn2&&ob[gbn2].bkst==true)
                                                { 
                                                   System.out.println("Here is your book: "+ ob[gbn2].bname);
                                                   ob[gbn2].bkst=false;
                                                //   z.relist[z.re]=b;
                                                z.relist.add(b);
                                               /* for(int m:z.relist)
                                                {
                                                    System.out.print(m);
                                                }*/
                                                   z.re++;
                                                   break;
                                                } 
                                            }
                                        }
                                       else if(op==3)
                                        {
                                          System.out.println("please enter the book number: ");
                                          int rbno=sc.nextInt();   //1
                                          //int i;
                                           int  rbno2=rbno-1;  //0
                                           if(z.re>0)
                                                {
                                                  for(int abu:z.relist)
                                                  {
                                                      // System.out.println(abu);
                                                      if(abu==rbno2)
                                                        {
                                                          ob[rbno2].bkst=true;
                                                          System.out.println(ob[rbno].bname);
                                                          //z.relist.remove(z.relist.get(abu));
                                                          System.out.println("Thank you for returning the book ");
                                                       }
                                                       else
                                                       { 
                                                          System.out.println("You haven't take any book like this.");
                                                        }
                                                    }
                                                }        
                                               else
                                               {
                                                  System.out.println("You haven't take any book");
                                                }
                                        }
                                        else
                                        {
                                           break;
                                        }
                                    }
                                }        
                                else 
                                {   
                                System.out.println("Invalid ID or password");
                                }
                            }
                            break;
                        }
                      else if(c==3)
                       {
                            System.out.println("Invalid ID or password");
                            //ff=false;
                            break;
                        }
                    }
                }
             else
                {
                    break;
                }
            }     
        }
    }

 





















































