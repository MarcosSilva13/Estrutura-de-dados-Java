package one.digitalinovation;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");

        System.out.println(minhaListaEncadeada.get(0));

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(2);

        System.out.println(minhaListaEncadeada);
    }
}
