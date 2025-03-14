package ex_02_Javabasics;

public class Lab008_Printf {
    public static void main(String[] args) {

        int x = 9;
//        System.out.printf("%d"+"*"+"1"+"="+"%d"+"\n", x,x);
//       System.out.println();
//
//        int a = x*2;
//        System.out.printf("%d"+"*"+"2"+"="+"%d"+"\n", x,a);
//
//        int b = x*3;
//        System.out.printf("%d"+"*"+"3"+"="+"%d"+"\n", x,b);
//
//        int c = x*4;
//        System.out.printf("%d"+"*"+"4"+"="+"%d"+"\n", x,c);
//
//        int d = x*5;
//        System.out.printf("%d"+"*"+"5"+"="+"%d"+"\n", x,d);
//
//        int e = x*6;
//        System.out.printf("%d"+"*"+"6"+"="+"%d"+"\n", x,e);
//
//        int f = x*7;
//        System.out.printf("%d"+"*"+"7"+"="+"%d"+"\n", x,f);
//
//        int g = x*8;
//        System.out.printf("%d"+"*"+"8"+"="+"%d"+"\n", x,g);
//
//        int h = x*9;
//        System.out.printf("%d"+"*"+"9"+"="+"%d"+"\n", x,h);
//
//        System.out.printf("%d"+"*"+"10"+"="+"%d"+"\n", x,i);
                int n=10;
        for(int i=0;i<=n;i++) {
            int a = x * i;
//            System.out.printf("%d" + "*" + "%d" + "=" + "%d" + "\n", x,i,a);
            System.out.println(x+"*"+i+"="+a);
        }
    }


}
