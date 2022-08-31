/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenor;

import java.util.*;

/**
 *
 * @author jose4
 */
public class MayorMenorCodigo {
    // ATRIBUTOS O VARIABLES
    int n1, n2, n3, mayor, menor;
    int suma, resta;
    Scanner lector = new Scanner(System.in);

    // CONSTRUCTOR
    public MayorMenorCodigo() {
    }

    // METODOS SET Y GET
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public Scanner getLector() {
        return lector;
    }

    public void setLector(Scanner lector) {
        this.lector = lector;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    // METODOS
    //CONSULTA DATOS A USUARIO
    public void ConsultaNumeros() {
        System.out.println("Por favor, digite tres numeros enteros, diferentes y multiplos de cinco: ");
        n1 = lector.nextInt();
        n2 = lector.nextInt();
        n3 = lector.nextInt();
    }

    //VALIDACIONES
    public void Resultados() {
        if (n1 != n2 && n1 != n3 && n2 != n3) {
            System.out.println("los numeros son diferentes");
            if (n1 % 5 == 0) {
                System.out.print(n1);
                System.out.print(" ");
                System.out.println("es multiplo de cinco");
            } else {
                System.out.print(n1);
                System.out.print(" ");
                System.out.println("No es multiplo de cinco");
            }
            if (n2 % 5 == 0) {
                System.out.print(n2);
                System.out.print(" ");
                System.out.println("es multiplo de cinco");
            } else {
                System.out.print(n2);
                System.out.print(" ");
                System.out.println("No es multiplo de cinco");
            }
            if (n3 % 5 == 0) {
                System.out.print(n3);
                System.out.print(" ");
                System.out.println("es multiplo de cinco");
            } else {
                System.out.print(n3);
                System.out.print(" ");
                System.out.println("No es multiplo de cinco");
            }
            if (n1 < n2 && n1 < n3) {
                menor = n1;
                System.out.println("El menor es: " + menor);
            } else {
                if (n2 < n1 && n2 < n3) {
                    menor = n2;
                    System.out.println("El menor es: " + menor);
                } else {
                    if (n3 < n1 && n3 < n2) {
                        menor = n3;
                        System.out.println("El menor es: " + menor);
                    }
                }
            }
            if (n1 > n2 && n1 > n3) {
                mayor = n1;
                System.out.println("El mayor es: " + mayor);
            } else {
                if (n2 > n1 && n2 > n3) {
                    mayor = n2;
                    System.out.println("El mayor es: " + mayor);
                } else {
                    if (n3 > n1 && n3 > n2) {
                        mayor = n3;
                        System.out.println("El mayor es: " + mayor);
                    }
                }
            }
            if (menor > 10) {
                suma = mayor + 10;
                System.out.println("La suma del numero mayor es: " + suma);
            }
            if (mayor < 50) {
                resta = menor - 5;
                System.out.println("La resta del numero menor es: " + resta);
            }
        } else {
            System.out.println("los numeros no son diferentes, por favor ingrese de nuevo los datos");
        }
    }
}
