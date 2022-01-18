import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float num1, num2, num3, num4;
        System.out.println("Informe as notas dos alunos");
            System.out.println("Digite a primera nota: ");
                num1 = teclado.nextFloat();
            System.out.println("Informe a segunda nota: ");
                num2 = teclado.nextFloat();
            System.out.println("Informe a teceira nota: ");
                num3 = teclado.nextFloat();
            System.out.println("Informe a quarta nota: ");
                num4 = teclado.nextFloat();

        float resultado = (num1 + num2 + num3 + num4) / 4;

        System.out.format("A média das notas foi de " + resultado);




    }}