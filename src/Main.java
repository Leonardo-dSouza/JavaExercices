import java.util.Arrays;
import java.util.Scanner;
public class Main {

    //---------------Exercício 1 -----------------//
    public static void ex1(Scanner scanner) {
        //iniciando um vetor com 10 espaços na memoria
        int[] vetor = new int[10];

        System.out.println("Digite 10 números: ");

        //loop que aloca um valor para cada indice do vetor criado
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = scanner.nextInt();
        }

        //loop para imprimir cada indice do vetor
        //o loop funciona de forma que para cada indice do vetor, haja uma interacao
        for (int j : vetor) {
            System.out.print(j + " ");
        }
    }

    //---------------Exercício 2 -----------------//
    public static void ex2(Scanner scanner){
        // iniciando um vetor com 10 indices
        int[] vetor = new int[10];

        System.out.println("Digite 10 números");
        // adicionando valores para os indices do vetor
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Valores maiores ou igual à 20: ");
        for(int num : vetor) {
            if (num >= 20) {
                System.out.print(num + " ");
            }
        }
    }

    //---------------Exercício 3 -----------------//

    public static void ex3(Scanner scanner){
        int[] vetor = new int[10];

        int j = 0;
        for(int i = 0; i < vetor.length; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                vetor[j] = x;
                j++;
            }
        }
        System.out.printf("Quantidade de Valores armazenados: %d. O maior valor encontrado: %d. Média: %.1f",
                j,
                Arrays.stream(vetor).max().orElseThrow(),
                Arrays.stream(vetor).sum()/ (double) j);

    }

    //---------------Exercício 4 -----------------//

    public static void ex4(Scanner scanner){
        System.out.print("Digite a quandidade de números a serem digitados: ");
        int i = scanner.nextInt();
        int[] vetor = new int[i];

        for(int x = 0; x < vetor.length; x++){
            System.out.print("Digite um número: ");
            vetor[x] = scanner.nextInt();
        }
        for(int y = 0; y < (vetor.length - 2); y++){
            int temp = vetor[y];
            vetor[y] = vetor[vetor.length - 1 - y];
            vetor[vetor.length - 1 - y] = temp;
        }

        System.out.println("Sequência na ordem inversa: ");

        for(int num : vetor) {
            System.out.print(num + " ");
        }
    }

    //---------------Exercício 5 -----------------//

    public static void ex5(Scanner scanner){
        int[] array = new int[8];
        for(int i = 0; i < array.length; i++){
            System.out.print("Digite um número: ");
            array[i] = scanner.nextInt();

        }

        for(int x = 0; x < array.length / 2; x++){
            int temp = array[x];
            array[x] = array[array.length - 4 + x];
            array[array.length - 4 + x] = temp;
        }

        //1234 5678
        //5678 1234

        for(int each : array){
            System.out.print(each + " ");
        }

    }

    //---------------Exercício 6 -----------------//

    public static void ex6(Scanner scanner){
        int[] array = {2,5,4,54,43,22,5,9,30,15};
        System.out.println("Digite um número para encontrar no vetor: ");
        int find = scanner.nextInt();

        int i = 0;
        for(int each : array){
            if (each == find){
                System.out.printf("O numero foi encontrado na posicao [%d] do vetor", i);
                break;
            }else i++;
        }
    }

    //---------------Exercício 7 -----------------//

    public static void ex7(){
        int[] A = {1,2,4,6,21};
        int[] B = {2,3,6,7,9,11,15,20};

        for(int i : A){
            for(int j : B){
                if(i == j){
                    System.out.print(i + ",");
                }
            }
        }
    }

    //---------------Exercício 8 -----------------//

    public static void ex8(){
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int[] B = {1,1,1,1,1,1,1,1,1,1};

        int P = 0;
        for(int i = 0; i < A.length; i++){
            P += A[i]*B[i];
        }
        System.out.println("O Produto escalar de M por N é: " + P);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Opções: 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8");
            System.out.print("Escolha o exercício (0 para sair): ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Exercício 1\n-----------");
                    ex1(scanner);
                    break;
                case 2:
                    System.out.println("Exercício 2\n-----------");
                    ex2(scanner);
                    break;
                case 3:
                    System.out.println("Exercício 3\n-----------");
                    ex3(scanner);
                    break;
                case 4:
                    System.out.println("Exercício 4\n-----------");
                    ex4(scanner);
                    break;
                case 5:
                    System.out.println("Exercício 5\n-----------");
                    ex5(scanner);
                    break;
                case 6:
                    System.out.println("Exercício 6\n-----------");
                    ex6(scanner);
                    break;
                case 7:
                    System.out.println("Exercício 7\n-----------");
                    ex7();
                    break;
                case 8:
                    System.out.println("Exercício 8\n-----------");
                    ex8();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0); // O loop continua até que a opção 0 seja escolhida

        scanner.close(); // Fecha o scanner ao final
    }
}