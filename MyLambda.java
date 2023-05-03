import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

@FunctionalInterface
interface A{
    void show();
}
class HttpException extends RuntimeException{
    public HttpException(String str){
        super(str);
    }
}

public class MyLambda {
    public static boolean isPrime(int num){
        if(num<=1) return true;
        for(int i=2;i<num;i++){
            if(num%2 == 0) return false;

        }
        return true;
    }
    public static int countPrime(int num){
        int count =0;
        return 0;

    }
    public static void main(String a[]) {
        // A obj =()->{
        //     System.out.println("hello lambda");
        // };
        // obj.show();
        try{
            int ab = 10;
            Object a[] = new Object[5];
            int b;
            // if(b<=2) throw new HttpException("please provide greater than of 2 ");
            // int result = ab/b;
            System.out.println("Enter new Number");
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            b=Integer.parseInt(br.readLine());
            System.out.println("You Entered  : " + b);


        }catch(HttpException err){
            System.out.println(err);
        } catch(Exception e){
            System.out.println("Exception catched"+e);
        }
    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 