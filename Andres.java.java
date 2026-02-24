import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Cual es tu edad?");
        Scanner edad = new Scanner(System.in);
        int age = edad.nextInt();

        if (age >= 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }

        if (age < 10) {
            System.out.println("eres un niño");
        } else {

            if (age > 10 && age <=17) {
                System.out.println("eres un pre adolecente");
            } else {

                if (age >= 18 && age < 30) {
                    System.out.println("Eres un adulto");
                } else {
                    System.out.println("Eres un cucho bro");
                }

            }
        }

        if (age < 10) {System.out.println("Eres un niC1o");}
        else if (age >= 10 && age < 14) {System.out.println("Eres un preadolescente");}
        else if (age >= 14 && age < 18) {System.out.println("Eres un adolescente");}
        else if (age >= 18 && age < 30) {System.out.println("Eres adulto joven");}
        else {System.out.println("Eres un cucho bro ");}

    }
}