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




// novo ex
import java.io.*;
import java.util.Scanner;


public class Main {


//    --------------------Exercício 1--------------------

    public static void ex1() throws IOException {
        File arquivo = new File("C:\\Users\\Leonardo\\Desktop\\Ex1.txt");
        arquivo.createNewFile();

        try {
            FileWriter fw = new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int j = 1; j <= 100; j++) {
                bw.write(j + "\n");
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    ----------------------Exercício 2----------------------

    public static void ex2() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Leonardo\\Desktop\\Ex1.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        do{
            line = br.readLine();
            if (line != null) {
                System.out.println(line);
            }
        }while (line != null);
        br.close();
    }

//    ----------------------Exercício 3----------------------

    public static void ex3() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Leonardo\\Documents\\NetBeansProjects\\moondream\\src\\main\\java\\com\\mycompany\\moondream\\Moondream.java");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int i = 0;
        do{
            line = br.readLine();
            if (line != null) {
                System.out.println("Linha " + i + ": " + line);
                i++;
            }
        }while (line != null);
        br.close();
    }

//    ----------------------Exercício 4----------------------

    public static void ex4() throws IOException {
        Scanner sc = new Scanner(System.in);
        int cont = 1;

        String[] linhas = new String[50];
        for(int i = 0; cont <= linhas.length; i++){

            System.out.print("- ");
            linhas[i] = sc.nextLine();
            cont++;

            if(linhas[i].equals("Fim")){
                System.out.println("------------");
                System.out.println("End of file");
                System.out.println("------------");
                break;
            }
        }
        if(cont >= linhas.length) {
            System.out.println("---------------------------------------");
            System.out.println("Nao ha mais como escrever (memory off)");
            System.out.println("----------------- // ------------------");
        }

        String caminhoArquivo = "C:\\Users\\Leonardo\\Desktop\\Ex4.txt";

        try( BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))){
            for(String linha : linhas){
                if(linha != null){
                    bw.write(linha);
                    bw.newLine();
                }
            }
            System.out.println("Arquivo salvo com sucesso!");
        }catch(IOException e){
            System.out.println("Ocorreu um erro de I/O: " + e.getMessage());
        }
    }

//    ----------------------Exercício 5----------------------

    static class Aluno{
        String nome;
        String nota1;
        String nota2;

        public Aluno(String nome, String nota1, String nota2){
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNota1() {
            return nota1;
        }

        public void setNota1(String nota1) {
            this.nota1 = nota1;
        }

        public String getNota2() {
            return nota2;
        }

        public void setNota2(String nota2) {
            this.nota2 = nota2;
        }

        public static double calcularMedia(String nota1, String nota2){
            return Double.parseDouble(nota1) / Double.parseDouble(nota2);
        }
    }

    public static void ex5() throws IOException {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];

        for (int i = 0; i < 10; i++) {
            String infoAluno;
            String[] valores;

            while (true) {  // Loop para validar a entrada
                System.out.println("Digite o nome e duas notas do aluno (Exemplo: joao 10 5):");
                infoAluno = sc.nextLine();
                valores = infoAluno.split(" ");

                if (valores.length == 3) {  // Verifica se foram fornecidos 3 valores
                    alunos[i] = new Aluno(valores[0], valores[1], valores[2]);
                    break;  // Saída do while após entrada válida
                } else {
                    System.out.println("O formato de notas está incorreto. Tente novamente.");
                }
            }
        }


        String caminhoArquivo = "C:\\Users\\Leonardo\\Desktop\\Ex4.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    bw.write("Nome do aluno: " + aluno.getNome() + " - " + aluno.getNota1() + " - " + aluno.getNota2() + " -- Média do aluno: " + Aluno.calcularMedia(aluno.getNota1(), aluno.getNota2()));
                    bw.newLine();
                }
            }
            System.out.println("Arquivo salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro de I/O: " + e.getMessage());
        }
    }


        public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Opções: 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8");
            System.out.print("Escolha o exercício (0 para sair): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Exercício 1\n-----------");
                    ex1();
                    break;
                case 2:
                    System.out.println("Exercício 2\n-----------");
                ex2();
                    break;
                case 3:
                    System.out.println("Exercício 3\n-----------");
                ex3();
                    break;
                case 4:
                    System.out.println("Exercício 4\n-----------");
                ex4();
                    break;
                case 5:
                    System.out.println("Exercício 5\n-----------");
                ex5();
                    break;
                case 6:
                    System.out.println("Exercício 6\n-----------");
//                ex6(scanner);
                    break;
                case 7:
                    System.out.println("Exercício 7\n-----------");
//                ex7();
                    break;
                case 8:
                    System.out.println("Exercício 8\n-----------");
//                ex8();
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

