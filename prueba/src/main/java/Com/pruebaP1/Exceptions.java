package main.java.Com.pruebaP1;

import java.util.InputMismatchException;
import java.util.Scanner; 

public class Exceptions {

    static Scanner scanner = new Scanner(System.in);

    public int readInt(String input){
        while (true) {
            try {
                System.out.print(input);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.nextLine(); // Limpia la entrada inválida
            }
        }
    }

    public double readDouble(String input){
        while(true){
            try {
                System.out.print(input);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número decimal.");
                scanner.nextLine(); // Limpia la entrada inválida
            }
        }
    }

    public String readString(String input){
        if(input.matches("\\d+")){
           return "Error: Debe ingresar un número entero.";
        } else{
           return input;    
        }
    }
}
