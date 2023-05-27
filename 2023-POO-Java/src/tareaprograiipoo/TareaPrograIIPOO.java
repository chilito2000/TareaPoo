
package tareaprograiipoo;

import java.util.Scanner;

public class TareaPrograIIPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       boolean salir = false;
       int opcion,res1; 
       
       do{
           System.out.println("");
           System.out.println("=======================");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
           System.out.println("7. Matrices");
           System.out.println("8. Área y Perímetro de un Rectángulo");
           System.out.println("9. Movimiento Rectilíneo Uniforme");
           System.out.println("10. Verificar si un número es Par o Impar");
           System.out.println("11. Raíz Cúbica");
           System.out.println("12. Salir");
           System.out.println("Selecciona una opción");
           System.out.println("=======================");
           opcion = sn.nextInt();
           System.out.println("Selecciona una opcion");
      
            switch(opcion){
                case 1:
                   System.out.println("El resultado de la suma es = " + calculadora.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calculadora.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calculadora.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calculadora.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calculadora.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " +calculadora.esPrimo(11));
                    break;
                case 7:
                   int[][] matriz1 = {{1, 2}, {3, 4}};
                   int[][] matriz2 = {{5, 6}, {7, 8}};
                   int[][] resultadoMatrices = calculadora.sumarMatrices(matriz1, matriz2);
                   System.out.println("Resultado de la suma de matrices:");
                   for (int i = 0; i < resultadoMatrices.length; i++) {
                       for (int j = 0; j < resultadoMatrices[i].length; j++) {
                           System.out.print(resultadoMatrices[i][j] + " ");
                       }
                       System.out.println();
                   }
                   break;
               case 8:
                   double base = 10;
                   double altura = 5;
                   double area = calculadora.calcularAreaRectangulo(base, altura);
                   double perimetro = calculadora.calcularPerimetroRectangulo(base, altura);
                   System.out.println("Área del rectángulo: " + area);
                   System.out.println("Perímetro del rectángulo: " + perimetro);
                   break;
               case 9:
                   double velocidadInicial = 5;
                   double aceleracion = 2;
                   double tiempo = 3;
                   double distancia = calculadora.calcularDistanciaMovimientoUniforme(velocidadInicial, aceleracion, tiempo);
                   System.out.println("Distancia recorrida en movimiento rectilíneo uniforme: " + distancia);
                   break;
               case 10:
                   int numero = 7;
                   boolean esPar = calculadora.esPar(numero);
                   if (esPar) {
                       System.out.println("El número es par");
                   } else {
                       System.out.println("El número es impar");
                   }
                   break;
               case 11:
                   double numeroCubico = 27;
                   double raizCubica = calculadora.raizCubica(numeroCubico);
                   System.out.println("Raíz cúbica de " + numeroCubico + ": " + raizCubica);
                   break;
                case 12:
                    res1 = leerNumeros("tangente");
                    System.out.println(CalculadoraEspecial.tangente(res1));
                    break;
               case 13:
                   salir = true;
                   break;
               default:
                   System.out.println("Solo números entre 1 y 12");   
                
            }
       }
        while(!salir);   
        
    }
    public class CalculadoraEspecial {
    
    }
}
