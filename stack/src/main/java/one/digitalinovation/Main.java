package one.digitalinovation;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarro = new Stack<>();

        stackCarro.push(new Carro("Ford"));
        stackCarro.push(new Carro("Chevrolet"));
        stackCarro.push(new Carro("Fiat"));

        System.out.println(stackCarro);
        System.out.println(stackCarro.pop());
        System.out.println(stackCarro);

    }
}
