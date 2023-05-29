import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  int a=10;
  int b=20;
  int c=30;
  int average=(a+b+c)/3;
  System.out.println("Average="+average);
  if(average>a && average>b && average>c)
  {
    System.out.println("avg is higher than a,b,c ");
  }
    else
  {
    if(average>a && average>b)
    {
      System.out.println("avg is higher than a,b,c");
    }
    else
    {
      if(average>a && average>c)
      {
        System.out.println("avg is higher than a,c");
      }
      else
      {
        if(average>b && average>c)
        {
          System.out.println("avg is higher than b,c");
        }
        else
        {
          if(average>a)
          {
            System.out.println("avg is just higher than a");
          }
          else
          {
            if(average>b)
            {
              System.out.println("avg is just higher than b");
            }
            else
            {
              if(average>c)
              {
                System.out.println("avg is just higher than c");
              }
            }
          }
        }
      }
    }
  }
    
  }
}


