public class ListaNodo {

    Nodo primeroEnLista;


    public ListaNodo() {

        this.primeroEnLista = null;

    }

    public void ingresarNodo ( int ingresoNuevo ) {

        Nodo nuevo_nodo = new Nodo(ingresoNuevo);

        nuevo_nodo.setSiguienteEnLista(primeroEnLista);

        primeroEnLista = nuevo_nodo;

        //return recusividad(primeroEnLista);
    }


    public Nodo recusividad(Nodo primeroEnLista){

        if(primeroEnLista == null){

            return primeroEnLista;

        }else{

            System.out.print(primeroEnLista.getNodo() + "->");

            return primeroEnLista.getSiguienteEnLista();

        }

    }

    public Nodo getDatoMenor(Nodo datoEvaluar){
        if(datoEvaluar!=null && primeroEnLista.getSiguienteEnLista()==null){
            System.out.println(" El valor menor de la lista es: " + datoEvaluar.getNodo());
            return datoEvaluar;
        }

        if (datoEvaluar == null){
            datoEvaluar=primeroEnLista;
        }else   if (datoEvaluar.getNodo() < primeroEnLista.getSiguienteEnLista().getNodo()){

            primeroEnLista =  primeroEnLista.getSiguienteEnLista();

            return getDatoMenor(datoEvaluar);
        }else {
            datoEvaluar=primeroEnLista.getSiguienteEnLista();
            primeroEnLista=datoEvaluar;
        }
      return getDatoMenor(datoEvaluar);
    }



}