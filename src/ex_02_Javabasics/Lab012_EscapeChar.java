package ex_02_Javabasics;

public class Lab012_EscapeChar {
    public static void main(String[] args) {

        // Escape char
        char new_line = '\n';
        char back_space = '\b';
        char tab_line = '\t';
        char carriage_return = '\r';

        System.out.println("Dhrithi"+new_line+"Vedhansh");
        System.out.println("DhrithiVedhansh");
        System.out.println("Dhrithi"+back_space+"Vedhansh");
        System.out.println("Dhrithi"+tab_line+"Vedhansh");
        System.out.println("Dhrithi"+"Dharani"+carriage_return+"vedhansh"+new_line+"Nag");

    }



}
