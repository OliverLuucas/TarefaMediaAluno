import java.util.Scanner;
public class ValidarNota {

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float n3 = teclado.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float n4 = teclado.nextFloat();

        float result = (n1 + n2 + n3 + n4) /4;

            if (result >= 7.0){
            System.out.println("Sua média foi"+ result +" e você foi APROVADO!");
        } else if(result >= 5.0){
            System.out.println("Sua média foi"+ result+ " e você está de RECUPERAÇÃO!");
        } else {
                System.out.println("Sua méida foi"+ result+ " e você foi REPROVADO!");
            }

    }


}
