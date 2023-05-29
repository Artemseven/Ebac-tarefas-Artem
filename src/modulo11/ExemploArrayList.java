package modulo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

public static void main(String args[]) {
exemploListaSimples();
exemploListaSimplesOrdemAscendente();

}


private static void exemploListaSimples() {
System.out.println("***** exemploListaSimples *****");
List<String> lista = new ArrayList<String>();
lista.add("Ivan");
lista.add("David");
lista.add("Marcela");
lista.add("Jucelane");
System.out.println(lista);
System.out.println("");
}

private static void exemploListaSimplesOrdemAscendente() {
System.out.println("***** exemploListaSimplesOrdemAscendente *****");
List<String> lista = new ArrayList<>();
lista.add("Ivan");
lista.add("David");
lista.add("Marcela");
lista.add("Jucelane");
Collections.sort(lista);
System.out.println(lista);
System.out.println("");

}
}