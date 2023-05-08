import java.util.Scanner;

public class CalcularImc {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double altura, peso;
    String nome;

    System.out.println("\tBem-vindo(a) á caculadora de IMC!");
    System.out.println("\nQual o seu nome?");
    nome = scanner.next();
    System.out.println("\nQual a sua altura(em metros)?");
    altura = scanner.nextDouble();
    System.out.println("\nQual o seu peso(em kg)?");
    peso = scanner.nextDouble();

   double imc =  peso / (altura * altura);
    System.out.println("\nO seu IMC é: " + imc);

    scanner.close();

    if(imc < 18.5) {
        System.out.println("\n\t\t________________MAGREZA_______________________\nDe acordo com a Organização Mundial da Saúde, seu IMC está abaixo do recomendado para a sua altura");
    }
    else if(imc >= 18.5 || imc <= 24.9) {
        System.out.println("\nNORMAL\n\tDe acordo com a Organização Mundial da Saúde, seu IMC é considerado normal para a sua altura.");
    }
    else if( imc >= 25 || imc <= 29.9) {
        System.out.println("\nSOBREPESO\n\tDe acordo com a Organização Mundial da Saúde, seu IMC está acima do recomendado para a sua altura.");
    }
    else if( imc >= 30 || imc <= 34.9) {
        System.out.println("\nOBESIDADE GRAU I\n\tDe acordo com a Organização Mundial da Saúde, seu IMC está acima do recomendado para a sua altura.");
    }
    else if(imc >= 35 || imc <= 40) {
        System.out.println("\nOBESIDADE GRAU II\n\tDe acordo com a Organização Mundial da Saúde, seu IMC está acima do recomendado para a sua altura.");
    } 
    else if(imc > 40) {
        System.out.println("\nOBESIDADE GRAU III\n\tDe acordo com a Organização Mundial da Saúde, seu IMC está acima do recomendado para a sua altura.");

    }


}
}
