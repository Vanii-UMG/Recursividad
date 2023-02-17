public class Operaciones {

    public int sumarDigitos(int numero){
    if(numero<10){
         return numero;
        }else{
        return (numero % 10) + sumarDigitos(numero/10);
    }// else
    } //sumarDigitos

    //--------------------------------------------------------------------------------
    public int [] LlenarEnteros(int numero){
        int [] digitos  = new int[numero];
        int tamanio=0;
        String cadena="";
        cadena= String.valueOf(numero);
        tamanio= cadena.length();

        for (int contador=0;contador<tamanio;contador++){
                                                                      //(0,1)
                digitos[contador]= Integer.parseInt(cadena.substring(contador,contador+1));

        }
        return digitos;
    }
    //--------------------------------------------------------------------------------
    public String reversa(String numero) {
        if (numero.length() == 1)
            return numero;
        else
            return numero.charAt(numero.length()-1) + reversa(numero.substring(0,numero.length()-1));
    }

    public ListaNodo insertarEnNodo(int [] lista,int tamanio, int contador, ListaNodo nodos){
        if (contador < tamanio){
            nodos.ingresarNodo(lista[contador]);
            System.out.print(lista[contador] + "->");
            contador ++;
            return insertarEnNodo(lista,tamanio,contador,nodos);

        }

        return nodos;
    }


}//class

