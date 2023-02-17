import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaracion de variables e instancias a objetos
        Scanner entrada= new Scanner(System.in);
        int numero;
        int suma;
        String reversa;
        Operaciones operacion = new Operaciones();
        ListaNodo number = new ListaNodo();
        Nodo datoEvaluar=null;
        int [] digitos  = new int[0];

        //El usuario ingresa un numero que devolvera el numero menor, la sumatoria de todos ellos y devolvera el numero al revez.
        //ejemplo 256 => 652
        System.out.print("Ingrese el numero: ");
        numero=entrada.nextInt();
        //Crear cadena de enteros con el numero ingresado
        //int [] cadena = operacion.crearCadena(numero);

        //Asignacion de cadenas
        int tamanio=0;
        String cadena="";
        cadena= String.valueOf(numero);
        tamanio= cadena.length();
        digitos=operacion.LlenarEnteros(numero);
        number= operacion.insertarEnNodo(digitos,tamanio,0,number);
        number.getDatoMenor(datoEvaluar);

        //Salida de datos
        suma = operacion.sumarDigitos(numero);
        System.out.println("La suma es: "+ suma);
        reversa= operacion.reversa(String.valueOf(numero));
        System.out.println("Numero ingresador revertido: " + reversa);
    }
}
