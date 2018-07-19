package com.hand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringBuilder sb = new StringBuilder();
        byte count = 0;
        for(int i=101;i<=200;i++){
            if(isPrime(i)){
                if(count==0){
                    sb.append(i);
                }else{
                    sb.append(","+i);
                }
                count++;
            }
        }
        System.out.println( "101-200间总共有"+count+"个素数，分别是:"+sb.toString());
    }
    private static Boolean isPrime(int num){
        if(num<=0) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
