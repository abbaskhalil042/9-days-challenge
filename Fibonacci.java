
    //fibonacci series.

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer, Integer> cache=new HashMap<>(0);
    public static void main(String[] args) {

        int pos = 8;
        int result = fibo(pos);

        System.out.println(result);

    }

    public static int fibo(int pos) {


        if(pos==0)
       {
         return 0;
       }

        if(pos==1 || pos ==2)
        {
            return 1;
        }

        if(cache.containsKey(pos))
        {
            return cache.get(pos);
        }
        int result=fibo(pos-1)+fibo(pos-2);
        cache.put(pos,result);
        return result;

        // int a=0;
        // int b=1;
        // int c=0;

        // //0 1 1 2
        // for(int i=2;i<=pos;i++)
        // {
        //     c=a+b;
        //     a=b;
        //     b=c;
        // }
        // return c;
    }

}


