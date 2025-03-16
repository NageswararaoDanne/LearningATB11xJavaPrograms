package ex_03_Operators;

public class Lab023_Interview_Using_Operators {
    public static void main(String[] args) {

        float dharani_salary = 1.05f;

        boolean b = !(dharani_salary > 2.06 || dharani_salary < 1);
        System.out.println(b);

        // 1.05 > 2.06 --> false
        // 1.05 < 1 ---> false
        // false || flase = false
        // !(false) = true

        System.out.println('\n');

        int nag_salary = 90;

        boolean d = !(nag_salary > 100 || nag_salary < 101);
        System.out.println(d);

        // 90 > 100 --> false
        // 90 < 101 ---> true
        // false || true = true
        // !(true) = false

        System.out.println('\t');

        int dhrithi_salary = 5;

        boolean x = !(dhrithi_salary > 4 && dhrithi_salary < 11);
        System.out.println(x);

        // 5 > 4 --> true
        // 5 < 11 ---> true
        // true && true = true
        // !(true) = false


    }
}
