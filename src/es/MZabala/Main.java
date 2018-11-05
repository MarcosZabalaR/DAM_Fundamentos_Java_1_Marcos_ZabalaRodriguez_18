package es.MZabala;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido, por favor introduzca una fecha a corroborar.");
        Scanner sc = new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        check(day,month,year);
    }

    /*
    Función main donde pediremos las variables día, mes y año al usuario.
     */

    private static void check(int day, int month, int year) {
        if(year<0){
            System.out.println("El año es incorrecto.");
        }else{
            if((month==2 && day>28)||(month==4 && day>30)||(month==6 && day>30)||(month==9 && day>30)||(month==10 && day>30)|| day<0){
                System.out.println("El día es incorrecto.");
            }else{
                if(month<0||month>12){
                    System.out.println("El mes es incorrecto.");
                }else{
                    day++;
                    if((month==2 && day>28)||(month==4 && day>30)||(month==6 && day>30)||(month==9 && day>30)||(month==10 && day>30)|| day<0){
                        day=1;
                        month++;
                        if(month>12){
                            month=1;
                            year++;
                        }
                    }
                    System.out.println("La fecha es: " +day +"  "+month+"  "+year);
                }
            }
        }
    }

    /*
    Aquí comprobaremos que las variables son correctas y mostramos el día siguiente al introducido.
     */
}
