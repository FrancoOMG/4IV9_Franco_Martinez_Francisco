/*Vamos a recrear 14 programas dentro de un menu gigante para poner a pruba sus conocimientos 
de algoritmia
1.- desarrolar un programa para calcular el bono de despuesto por edad
2.- convertir numeros decimales a binarios
3.- convertit temperaturas entre los 3 principales grados C -> F y K
4.- realizar un programa para contar numero de positivos y negativos de una serie de numeros
5.- desarrollar una tiendita para agregar productos y precios
6.- desarrolar un programa para calcular el area y perimetro dd 5 diferentes figuras
7.- desarrollar una tabla ahorita aver que se me ocurre 
8.- desarrollar un rpograma para calcular el factorial con recursividad
9.- vamos hacer dibujitos wiiiii trianguro equilatero o rombo
10.- desarrollar una figura hueca
11.- 
12.- realizar un diamante
13.- desarrollar una calculadora basica + - x / para n numeros
14.- 
*/
import java.util.Scanner;

class EstructuraDatos{

    public EstructuraDatos() {
    }

    public static void main (String [] args){

    //aqui van las variables
    int opcion; 
    char letrapararepetir; 
    //aqui van los objetos
    Scanner entrada = new Scanner(System.in);
    
    //aqui va el menu

    System.out.println("Vienvenido a este programa para ver que tanto saben programar apartir de algoritmio basicos");
    System.out.println("Porfavor elija la opcion deceada");
    
    System.out.println("1.-DESCUENTO POR EDAD");
    System.out.println("2.-COMVERTIDOR A BINARIO");
    System.out.println("3.-CONVERTIDOR DE GRADOS (C, F ,K)");
    System.out.println("4.-CONTRAR NUMEROS");
    System.out.println("5.-TIENDITA KAWAI");
    System.out.println("6.-AREA Y PERIMETRO");
    System.out.println("7.-");
    System.out.println("8.-");
    System.out.println("9.-");
    System.out.println("10.-");
    System.out.println("11.-");
    System.out.println("12.-");
    System.out.println("13.-");
    System.out.println("14.- Salir");

    //entrada de dato
    opcion = entrada.nextInt();
    // ahora tengo que evaluar la entrada
        do{
        switch (opcion) {
            case 1:
                System.out.println("Ingresa tu edad (no puede ser mayor o igual a 99)");
                int edad = entrada.nextInt();
                double des = 0;
                if (edad > 0 && edad < 99){
                if (edad > 0 && edad <7){
                    des = 0.10;
                }
                else if (edad >=7 && edad <18){
                    des = 0.90;
                }      
                 else if (edad >=18 && edad <23){
                    des = 0.05;
                }
                 else if (edad >=23 && edad <46){
                    des = 0.30;
                }
                 else if (edad >=46 && edad <70){
                    des = 0.70;
                } 
                 else if (edad >=70 && edad <85){
                    des = 0.60;

                } else if (edad >=85 && edad <99){
                    des = 0.99;
                }
                System.out.println("El descuento que se le da es: " + (des*100) + "%");
            }else{
                System.out.println("Edad invalida");
            }

                break;
            case 2:
                //convertir un numero decimal a binario
                System.out.println("Ingrese un numero positivo entero que se desee comvertir a binario");
                int numbinario;
                String guardarbinario ="";
                numbinario = entrada.nextInt();
                
                if(numbinario > 0){

                    //realizamos el modulo de 2
                    while(numbinario > 0){
                        int residuo = numbinario % 2;
                        guardarbinario = residuo + guardarbinario;
                        numbinario /= 2;
                    }

                }else if(numbinario == 0){
                    guardarbinario = "0";
                }

                else {
                    //aqui no se puede 
                    guardarbinario = "No se puede convertir ese numero solo acepta positivos ";
                }

                System.out.println("El numero convertido a binario es:" + guardarbinario);
                break;
            case 3:

            System.out.println("Selecciona temperatura para comvertir (C->Celsius F-> Fahrenheit K->Kelvin)");
            System.out.println("1.K->F ");
            System.out.println("2.K->C ");
            System.out.println("3.F->K ");
            System.out.println("4.F->C ");
            System.out.println("5.C->K ");
            System.out.println("6.C->F ");

            int ConvercionT = entrada.nextInt();
            System.out.println("Ingresa la Temperatura");
            double tem = entrada.nextDouble();
            double resultado;
            switch (ConvercionT) {
                case 1:
                    resultado = (tem - 273.15)* 9/5 + 32;
                    System.out.println("La temperatura es: " + resultado);
                    break;
                case 2:
                    resultado = tem - 273.15;
                    System.out.println("La temperatura es: " + resultado);
                    break;
                case 3:
                    resultado = (tem - 32) * 5/9 + 273.15;
                    System.out.println("La temperatura es: " + resultado);
                    break;
                case 4:
                    resultado = (tem - 32) * 5/9;
                    System.out.println("La temperatura es: " + resultado);
                    break;
                case 5:
                    resultado = tem + 273.15;
                    System.out.println("La temperatura es: " + resultado);
                    break;
                case 6:
                    resultado = (tem + 9/5) + 32;
                    System.out.println("La temperatura es: " + resultado);
                    break;
            
                default:
                    break;
            }

          
                break;
            case 4:
                System.out.println("Ingresa un numero");
                int cantidad = entrada.nextInt();
                int NumNega = 0;
                int seros = 0;
                int NumPosi = 0;

                if(cantidad > 0){
                    for( int F = 1; F <= cantidad; F ++){
                        System.out.println("Ingresa el numero" + F);
                        double numero = entrada.nextDouble();
                        
                        if ( numero > 0 ){
                            NumPosi = NumPosi + 1;
                        }
                        else if (numero < 0){
                            NumNega = NumNega + 1;
                        }
                        else {
                            seros = seros + 1;
                        }
                    }
                }

                break;
            case 5:
                System.out.println("Bienvenidos a esta hermosa tiendita linda y Kawaii");
                System.out.println("Por favor ingrese cuantos elementos ca a acomprar");
                int elementosproducto;
                elementosproducto = entrada.nextInt();
                double compra = 0;
                if( elementosproducto > 0 ){
                    for(int i= 1; i<= elementosproducto;i++){
                        System.out.println("Ingresa el nombre del producto");
                        entrada.next(); // Consumir el nombre pero no almacenar
                        System.out.println("ingrese el precio");
                        double precio = entrada.nextDouble();
                        System.out.println("Ingrese la cantidad de producto");
                        int cantProducto = entrada.nextInt();
                        double subtotal = precio * cantProducto;
                        compra = subtotal;
                    }
                    System.out.println("El total de la compra es:" + compra);

                }else{
                    System.out.println("ingrese solo cantidades positivas");
                }
                
                break;
            case 6:
                System.out.println("Elija una figura para calcular el area");
                System.out.println("1.- Rectangulo");
                System.out.println("2.-Circulo");
                System.out.println("3.-Triangulo");
                System.out.println("4.-Pentagono");
                System.out.println("5.-Cuadrado");
                
                int fig = entrada.nextInt();
                double Area;
                double Per;
                switch (fig) {
                    case 1:
                        System.out.println("Ingresa l abase: ");
                        double base = entrada.nextDouble();

                        System.out.println("Ingrese la haltura: ");
                        double h = entrada.nextDouble();

                        Area = base * h;
                        Per = 2 * (base + h);

                        System.out.println("Area" + Area);
                        System.out.println("Perimetro" + Per);
                        break;
                    case 2:
                        System.out.println("Ingrese el Radio del círculo: ");
                        double R= entrada.nextDouble();

                        Area = 3.1416 * R * R;
                        Per = 2 * 3.1416 * R;

                        System.out.println("Area" + Area);
                        System.out.println("Perimetro" + Per);
                        break;

                    case 3:
                        System.out.println("Ingresa la base del triangulo: ");
                        double basTrian = entrada.nextDouble();

                        System.out.println("Ingresa la altura del triangulo: ");
                        double hTrian = entrada.nextDouble();

                        System.out.println("Lado 1");
                        double L1 = entrada.nextDouble();

                        System.out.println("Lado 2");
                        double L2 = entrada.nextDouble();

                        System.out.println("Lado 3");
                        double L3 = entrada.nextDouble();

                        Area = (basTrian * hTrian) / 2;
                        Per = L1 + L2 + L3;

                        System.out.println("Area" + Area);
                        System.out.println("Perimetro" + Per);
                        
                        
                        break;

                    case 4:
                        System.out.println("Ingrese el lado del pentagono");
                        double LPen = entrada.nextDouble();

                        System.out.println("Ingrese la apotema");
                        double Apotema = entrada.nextDouble();

                        Per = 5 * LPen;
                        Area = (Per * Apotema) / 2;
                        System.out.println("Area" + Area);
                        System.out.println("Perimetro" + Per);
                        break;

                    case 5:
                        System.out.println("Ingresa un lado del cuadrado");
                        double L = entrada.nextDouble();
                        Area = L * L;
                        Per = 4 * L;

                        System.out.println("Area" + Area);
                        System.out.println("Perimetro" + Per);
                        break;
                    default:
                        System.out.println("Ingresa un numero valido");
                        break;
                }


                break;
            case 7:

                //Tabla de multiplicar
                for (int n = 1; n <= 10; n++) {
                    
                    System.out.println(n + "   |   " + (n*10 + "   |   " + (n*100) + "   |   "+(n*1000)));
                    
                }

                break;
            case 8:

                System.out.println("Ingrese un numero");
                int factorial = entrada.nextInt();
                int fac = 1;

                for (int i = 1; i <= factorial; i++){
                    fac = fac *i;
                }
                System.out.println("Factorial: " + fac);
                break;

            case 9:
                //vamos a hacer un cuadrado magico
                System.out.println("Vamos a realizar el dibujo de u cuagrado magico");
                System.out.println("Ingrese el tamaño del cuadrado");
                int n1 = entrada.nextInt();

                if (n1 >= 1 && n1 <=20){

                    for( int i = 1; i <= n1; i++){
                        
                        for (int j = 1; j <= n1; j++){
                            System.out.println("*");
                            
                        }
                        System.out.println();
                    }
                    //se imprime
                }else{
                    System.out.println("porfavor solo ingrese numeros entre el 1 y el 20");
                }
                break;
            case 10:
                System.out.println("Ingrese el tamaño del dibujo");
                int numero = entrada.nextInt();
                if (numero >= 1 && numero <= 20){
                    for (int i = 1; i >= numero; i++){
                        for (int j= 1; j <= numero; j++){
                            if (i == 1 || i == numero || j==1 || j==numero){
                                System.out.println("*");
                            }else{
                                System.out.println(" ");
                            }
                        }
                        System.out.println();
                    }
                }
                break;
            case 11:
                break;
            case 12:

                System.out.println("Realizaremos un Diamante");
                System.out.println("Ingrese el tamaño del diamante: ");
                int Tamaño = entrada.nextInt();
                if(Tamaño >= 1 && Tamaño <= 15){   
                    for (int i =1; i<= Tamaño; i++){
                        for (int j = 1; j <= Tamaño - i; j++){
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= (2*i - 1); j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = Tamaño - 1; i >= 1; i--){
                        for (int j = 1; j <= Tamaño -i; j++){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2*i - 1); j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }else{
                    System.out.println("Porfavor solo ingrese valores entre 1 y el 15 (Enteros)");
                }
                break;
            case 13:
                System.out.println("Calculadora");

                System.out.println("Ingresa el primer numero");
                float numero2 = entrada.nextFloat();


                char continuar;
                do { 
                    System.out.println("Ingresa una operacion (+ - * /)");
                    char operacion = entrada.next().charAt(0);
                    
                    System.out.println("ingrese numero");
                    float num = entrada.nextFloat();

                    if(operacion == '+'){
                        numero2 = numero2 + num; 
                    }else if (operacion == '-'){
                        numero2 = numero2 - num;
                    }else if (operacion == '*'){
                        numero2 = numero2 * num;
                    }else if (operacion == '/'){
                        numero2 = numero2 / num;
                    }else {
                        System.out.println("Ingresa una operacion valida");
                    }
                    System.out.println("Resultado: "+ numero2);
                    System.out.println("Quieres hacer otra operacion? (s / n)");
                    continuar = entrada.next().charAt(0);
                    
                } while (continuar == 's' || continuar == 'S');
                break;            
            default:
                break;                                    
        }
       
        System.out.println("Deseas repetir el programa escribe s o S para si");
        letrapararepetir = entrada.next().charAt
        ( 0 );
        }while (letrapararepetir == 's' || letrapararepetir == 'S');

        }
    } 
