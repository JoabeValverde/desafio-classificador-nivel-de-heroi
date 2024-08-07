package ClassificadorHeroi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos heróis você deseja classificar? ");
        int quantidadeHerois = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer do scanner
        
        //laco for para ler e classificar os heróis
        for (int i = 1; i <= quantidadeHerois; i++){
            System.out.print(" \nClassificação do herói #" + i );
            System.out.println();
            //scanner.nextLine();
            
            
        //Solicita o nome do herói
        System.out.print("Informe o nome do herói: ");
        String nome = scanner.next();
        System.out.println();

        //Solicita a quantidade de experiência do herói
        System.out.print("Informe a quantidade de experiência do herói: ");
        int xp = scanner.nextInt();
        
        String nivel;

            // Estrutura de decisão para determinar o nível com base na XP
            if (xp < 1000) {
                nivel = "Ferro";
            } else if (xp >= 1001 && xp <= 2000) {
                nivel = "Bronze";
            } else if (xp >= 2001 && xp <= 5000) {
                nivel = "Prata";
            } else if (xp >= 5001 && xp <= 7000) {
                nivel = "Ouro";
            } else if (xp >= 7001 && xp <= 8000) {
                nivel = "Platina";
            } else if (xp >= 8001 && xp <= 9000) {
                nivel = "Ascendente";
            } else if (xp >= 9001 && xp <= 10000) {
                nivel = "Imortal";
            } else {
                nivel = "Radiante";
            }

            // Exibe a mensagem com o nível do herói
            System.out.println("O herói está no nível de " + nivel + ".");
        }
    scanner.close();}
    }
