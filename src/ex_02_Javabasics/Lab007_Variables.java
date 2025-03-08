package ex_02_Javabasics;

public class Lab007_Variables {
    public static void main(String[] args) {

        // What ever the last line has given it will take it & print in console

        int age = 99;
        age = age - 98;
//        age = 100000;
int a;
        try{
            int x=age%0;

        }catch(ArithmeticException e){
            System.out.println("my Exception : "+e);
        }

//        System.out.println("My exact age = " + age);
    }
}
