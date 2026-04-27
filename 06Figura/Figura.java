
import java.util.Scanner;


public class Figura {
     // vamos a colocar las variables globales
    double lado, altura, area, perimetro, base;
    int option;
    char letra;
    boolean esValido = false;
    // instancia 
    Scanner entrada = new Scanner(System.in);
    public void menu(){
       do{
            
        
            System.out.println("este es un program,a para calcular el area y el perimetro de figuras geometricas");
            System.out.println("1.Triangulo");
            System.out.println("2.Circulo");
            System.out.println("3.Triangulo");
            System.out.println("4.salir");
            System.out.println("Elija una");
            
            switch (option) {
                case 1://Triangulo
                    CalcularTiangulo();
                    break;
                case 2://Cuadrado
                    CalcularCuadrado();
                    break;
                case 3://Circulo
                    CalcularCirculo();
                    break;
                default:
                    System.out.println("Ayos");
                    throw new AssertionError();
            }
            System.out.println("Ingrese si quiere repetir el programa");
            letra = entrada.next().charAt(0);
         
            
        }while (letra == 's' || letra == 'S');
    }
    public void CalcularTiangulo(){
        System.out.println("Area y perimetro Triangulo");
        System.out.println("Que tipo de triangulo desea calcular");
        System.out.println("1.Equilatero");
        System.out.println("2.Isoseles");
        System.out.println("3.Escaleno");
        option = entrada.nextInt();
        switch (option) {
            case 1:
                do{
                    System.out.println("Ingresa la base del triangulo");
                    try {
                       
                        if (entrada.hasNextDouble()){
                            base = entrada.nextDouble();
                            esValido = true;
                             }
                            else{System.out.println("Ingrese unicamente numeros");
                                entrada.next();
                            }

                    } catch (Exception e) {
                        System.out.println("Ingrese numeros validos papito");
                        System.out.println("error: "+ e.getMessage());
                        System.out.println(e.getStackTrace());
                    }
                }while(!esValido);

                    //OPERACION
                
                break;
            default:
                throw new AssertionError();
        }
    }

    public void CalcularCuadrado(){
        System.out.println("Prueba");
    }

    public void CalcularCirculo(){
        System.out.println("Prueba");
        
    }
}
