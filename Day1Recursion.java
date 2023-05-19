//factorial

public class Day1Recursion{
    public static void main(String[] args) {
      
        int num=5;
        // int result=0;

      int  result=fact(num);
        System.out.println(result);

    }

    public static int fact(int num) {

       if(num==0)
       {
        return 1;
       }

        return num*fact(num-1);//recursion

        // int temp=1;
        // for(int i=1;i<=num;i++)
        // {
        //     temp=temp*i;
        // }

        // return temp ;
    }
    
}