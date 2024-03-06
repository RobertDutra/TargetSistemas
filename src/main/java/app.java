import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inverter();

        System.out.println();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int n = 20;
        //int numero = 24;
        boolean verdadeiro = false;
        System.out.println();
        System.out.println("Sequência de Fibonacci com " + n + " termos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + ", ");
            if (numero == fibonacci(i)) {
                verdadeiro = true ;
            }

        }
        if(verdadeiro) {
            System.out.println();
            System.out.println("O número " + numero + " está presente na sequência de fibonacci.");
        }
        else {
            System.out.println();
            System.out.println("O número " + numero + " não está presente na sequência de fibonacci.");
        }



    }

    public static void inverter() {
        String original = "Hello, World!";
        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        }
    }

