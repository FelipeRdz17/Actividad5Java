package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Declaración de variables
        float X1,X2,addition,division,multiplication,percentage,subtraction;

        //Input de Usuario
        Scanner InputUsuario=new Scanner(System.in);

        //Mensajes del sistema
        System.out.println("¡Bienvenido! En este programa tendrás la fabulosa oportunidad realizar mediante un ambiente consola las " +
                "siguientes operaciones básicas de una calculadora como: Abstracción, Substracción, Multiplicación, Divisón y Porctenaje de dos números otorgados: ");
        System.out.println("Favor de ingresar el primer número y dar enter ");
        X1= InputUsuario.nextFloat();
        System.out.println("Favor de ingresar el segundo número y dar enter ");
        X2= InputUsuario.nextFloat();

        //Operaciones
        addition=X1+X2;
        subtraction=X1-X2;
        multiplication=X1*X2;
        division=X1/X2;
        percentage=X1%X2;

        //Resultados
        System.out.println("resultado de la abstracción de los dos números: "+ addition);
        System.out.println("resultado de la substracción de los dos números: "+ subtraction);
        System.out.println("resultado de la multiplicación de los dos números: "+ multiplication);
        System.out.println("resultado de la división de los dos números: "+ division);
        System.out.println("resultado del porcentaje de los dos números: "+ percentage);

    }
}
