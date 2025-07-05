package chapter4;
import chapter4.AccessModifier;
public class ReturnType{
    void startEngine(){
        System.out.println("Engine is running");
        // return;
    }
    int getAge(){
        return (byte) 21;
        // System.out.println(); 
    }
    Avocado getAvocado(){
        return null;
    }
    boolean oddOrEven(int a){
        // boolean result = ((a%2)==0) ? true : false;
        // return result;
        return ((a%2)==0) ? true : false;
    }
    int addTwoNumbers(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        AccessModifier acm1 = new AccessModifier();
        acm1.greetMe();
        // acm1.greetMe2();
        acm1.greetMe3();
        acm1.greetMe4();
        ReturnType rt = new ReturnType();
        System.out.println("Good morning you are now "
        +rt.getAge()+" years old");
        int y = 123230,z=1;
        System.out.println("is the value "+y+
        " even number?: "+rt.oddOrEven(y));
        System.out.println("a= "+y+"\nb = "+z+
        "\na+b="+rt.addTwoNumbers(y, z));
    }
}

class Avocado{}