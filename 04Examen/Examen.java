

import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        Scanner entrada = new Scanner  (System.in);
        String nombre = "", Paterno = "", Materno = "", fecha = "", direccion = "";
        String continuar;

        do { 
            int opcion; 

            System.out.println("Menu WIII");
            System.out.println("1. Ingresar los datos del cliente");
            System.out.println("2. Tipos de piso");
            System.out.println("3. Calcular costo");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Nombre: ");
                    nombre = entrada.nextLine();
                    System.out.println("Apellido Paterno: ");
                    Paterno = entrada.nextLine();
                    System.out.println("Apellido Materno: ");
                    Materno = entrada.nextLine();
                    System.out.println("Fecha de nacimiento: ");
                    fecha = entrada.nextLine();
                    System.out.println("Direccion: ");
                    direccion = entrada.nextLine();
                    break;

                case 2:
                    System.out.println("===Tipos de piso===");
                    System.out.println("1. Porcelanato $22.35 m2");
                    System.out.println("2. Marmoleado $34.27 m2");
                    System.out.println("3. Acrilico $22.94 m2");
                    break;
                case 3:
                    int cuartos;

                    do { 
                        System.out.println("Numero de cuartos (2-4)");
                        cuartos = entrada.nextInt();
                        if(cuartos <= 1 || cuartos >= 5);
                            System.out.println("Inserta un numero del 2 al 4");
                    } while (cuartos <= 1 || cuartos >= 5);
                            double total= 0;
                            for (int j = 1; j <= cuartos; j++){
                                

                               
                               
                                
                                    System.out.println("Cuarto " + j);
                                     double largo , ancho;

                                     do { 
                                        System.out.print("Largo (max 6 m): ");
                                        largo = entrada.nextDouble();
                                        if(largo <= 0 || largo >6){
                                            System.out.println("Error: el largo debe de ser mayor a 0 y menor a 6");
                                        }
                                         
                                     } while (largo <= 0 || largo>6);
                                     do{
                                        System.out.println("Ancho (max 6m): ");
                                        ancho = entrada.nextDouble();

                                        if (ancho<=0 || ancho>6){
                                            System.out.println("el ancho deve ser mayor a 0 y menor a 6");
                                        }
                                     }while (ancho<=0 || ancho >6); 
                                        double area = largo + ancho;
                                         
                                     
                                




                                

                                int tipo;
                                double precio = 0;
                                String tipopiso = "";

                                System.out.println("Tipo de piso: ");
                                System.out.println("1. Porcelanato");
                                System.out.println("2. Marmoleado");
                                System.out.println("3. Acrilico");
                                tipo = entrada.nextInt();

                                switch (tipo){
                                    case 1:
                                        precio = 22.35;
                                        tipopiso = "Porcelanato";
                                        break;
                                    case 2:
                                        precio = 34.27;
                                        tipopiso = "Marmoleado";
                                        break;
                                    case 3:
                                        precio = 22.94;
                                        tipopiso = "Acrilico";
                                        break;
                                    default:
                                        System.out.println("Error, asignaremos Porcelanato");
                                }

                                double costo = area * precio;
                                double iva = costo * 0.16;
                                double TotalC = costo + iva;

                                total += TotalC;

                                System.out.println("Costo cuarto (" + tipopiso + "): $" + TotalC);
                            }

                            System.out.println("___Resumen___");
                            System.out.println("Cliente: "+ nombre + " " + Paterno + " " + Materno + "");
                            System.out.println("Direccion: " + direccion);
                            System.out.println("Total con IVA: $" + total);

                            System.out.println("Desea comprar? (si/no): ");
                            entrada.nextLine();
                            String respuesta = entrada.nextLine();

                            if ( respuesta.equalsIgnoreCase("si")){
                                double descuento = total * 0.0795;
                                double totalF = total - descuento;

                                System.out.println("Descuento: $" + descuento);
                                System.out.println("Total a pagar: $" + totalF);
                            }else {
                                System.out.println("Compra Cancelada");
                            }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("opcion invalida");
            }
            System.out.println("Deseas volver al menu? (si/no): ");
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("si"));
        System.out.println("Programa terminado");

    }   
}
