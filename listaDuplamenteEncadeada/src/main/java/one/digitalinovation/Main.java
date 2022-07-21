package one.digitalinovation;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        for (int i = 0; i < 10; i++){
            minhaListaEncadeada.add(i);
        }

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(5);

        System.out.println(minhaListaEncadeada);
    }
}
