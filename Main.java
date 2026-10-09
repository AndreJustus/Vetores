import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n EXERCICIOS ");
            for (int i = 1; i <= 20; i++) {
                System.out.println(i + " - Exercicio " + i);
            }
            System.out.println("0 - Sair");
            System.out.print("Escolha um exercicio: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> exercicio1();
                case 2 -> exercicio2();
                case 3 -> exercicio3();
                case 4 -> exercicio4();
                case 5 -> exercicio5();
                case 6 -> exercicio6();
                case 7 -> exercicio7();
                case 8 -> exercicio8();
                case 9 -> exercicio9();
                case 10 -> exercicio10();
                case 11 -> exercicio11();
                case 12 -> exercicio12();
                case 13 -> exercicio13();
                case 14 -> exercicio14();
                case 15 -> exercicio15();
                case 16 -> exercicio16();
                case 17 -> exercicio17();
                case 18 -> exercicio18();
                case 19 -> exercicio19();
                case 20 -> exercicio20();
                case 0 -> System.out.println("Programa encerrado.");
                default -> System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }


    static void exercicio1() {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o numero da posicao " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Numeros primos e suas posicoes:");
        boolean encontrou = false;

        for (int i = 0; i < vetor.length; i++) {
            if (ehPrimo(vetor[i])) {
                System.out.println("Numero: " + vetor[i] + " - Posicao: " + i);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum numero primo foi informado.");
        }
    }


    static void exercicio2() {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        System.out.println("Preencha o vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Preencha o vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[i];
        }

        System.out.println("Vetor intercalado: " + Arrays.toString(c));
    }


    static void exercicio3() {
        int[] vetor = new int[10];
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
            soma += vetor[i];
        }

        System.out.println("Vetor: " + Arrays.toString(vetor));
        System.out.println("Media: " + (soma / 10.0));
    }


    static void exercicio4() {
        int[] vetor = new int[20];
        boolean encontrou = false;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(30) + 1;
            if (vetor[i] == 25) {
                encontrou = true;
            }
        }

        System.out.println("Vetor: " + Arrays.toString(vetor));
        if (encontrou) {
            System.out.println("O numero 25 existe no vetor.");
        } else {
            System.out.println("O numero 25 nao existe no vetor.");
        }
    }


    static void exercicio5() {
        int[] vetor = new int[15];
        int indice = -1;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50) + 1;
            if (vetor[i] == 20 && indice == -1) {
                indice = i;
            }
        }

        System.out.println("Vetor: " + Arrays.toString(vetor));
        if (indice != -1) {
            System.out.println("Numero 20 encontrado no indice: " + indice);
        } else {
            System.out.println("Numero 20 nao encontrado.");
        }
    }


    static void exercicio6() {
        int[] vetor = new int[30];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }

        System.out.println("Vetor original: " + Arrays.toString(vetor));
        System.out.print("Digite o valor que deseja remover: ");
        int valor = sc.nextInt();

        int quantidade = 0;
        for (int numero : vetor) {
            if (numero != valor) {
                quantidade++;
            }
        }

        int[] novoVetor = new int[quantidade];
        int j = 0;
        for (int numero : vetor) {
            if (numero != valor) {
                novoVetor[j] = numero;
                j++;
            }
        }

        System.out.println("Vetor apos a remocao: " + Arrays.toString(novoVetor));
        if (quantidade == vetor.length) {
            System.out.println("O valor nao estava no vetor.");
        }
    }


    static void exercicio7() {
        double[] vetor = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor decimal " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        double menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }


    static void exercicio8() {
        int[] a = new int[15];
        int[] b = new int[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }

        System.out.println("Vetor A: " + Arrays.toString(a));
        System.out.println("Vetor B reverso: " + Arrays.toString(b));
    }


    static void exercicio9() {
        System.out.print("Digite a quantidade de recibos: ");
        int quantidade = sc.nextInt();

        if (quantidade < 0) {
            System.out.println("A quantidade nao pode ser negativa.");
            return;
        }

        int contador = 1;
        while (contador <= quantidade) {
            System.out.println("Recibo numero: " + contador);
            contador++;
        }
    }


    static void exercicio10() {
        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }


    static void exercicio11() {
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a temperatura " + i + ": ");
            soma += sc.nextDouble();
        }

        System.out.println("Media das temperaturas: " + (soma / 10));
    }


    static void exercicio12() {
        System.out.println("Numeros pares de 1 a 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    static void exercicio13() {
        System.out.print("Digite um numero inteiro N: ");
        int n = sc.nextInt();

        System.out.println("Numeros primos ate " + n + ":");
        for (int numero = 2; numero <= n; numero++) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }


    static void exercicio14() {
        System.out.print("Digite o numero de etapas de producao: ");
        int etapas = sc.nextInt();

        if (etapas <= 0) {
            System.out.println("Digite um numero inteiro positivo.");
            return;
        }

        int tempoPorEtapa = 2;
        int tempoTotal = etapas * tempoPorEtapa;
        System.out.println("Tempo total de producao: " + tempoTotal + " horas.");
        System.out.println("(Considerando 2 horas por etapa.)");
    }


    static void exercicio15() {
        System.out.print("Digite a quantidade de termos de Fibonacci: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Digite um numero inteiro positivo.");
            return;
        }

        long a = 0;
        long b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();
    }


    static void exercicio16() {
        int[] respostas = new int[5];

        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Digite a resposta " + (i + 1) + ": ");
            respostas[i] = sc.nextInt();
        }

        System.out.println("Respostas na ordem inversa:");
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.println(respostas[i]);
        }
    }


    static void exercicio17() {
        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        System.out.println("Media da turma: " + (soma / notas.length));
    }


    static void exercicio18() {
        double[] temperaturas = new double[8];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        double maior = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        System.out.println("Maior temperatura registrada: " + maior);
    }


    static void exercicio19() {
        int[] codigos = {101, 205, 310, 415, 520};

        System.out.print("Digite o codigo do produto: ");
        int codigo = sc.nextInt();

        boolean encontrado = false;
        for (int item : codigos) {
            if (item == codigo) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Produto encontrado no estoque.");
        } else {
            System.out.println("Produto nao encontrado no estoque.");
        }
    }


    static void exercicio20() {
        double[] precos = new double[10];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preco do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }

        for (int i = 0; i < precos.length - 1; i++) {
            for (int j = 0; j < precos.length - 1 - i; j++) {
                if (precos[j] > precos[j + 1]) {
                    double temp = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = temp;
                }
            }
        }

        System.out.println("Precos em ordem crescente: " + Arrays.toString(precos));
    }


    static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
