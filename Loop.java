import java.util.Scanner;

public class Loop {
    public static void main(String[] args){

        //DECLARANDO E ESTANCIANDO OBJETO SCAN
        //PARA RECEBER ENTRADA DE VALOR DO TECLADO ATRAVES DA CLASSE SYSTEM.IN
        Scanner scan = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0;
        String nome = "", res = "";
        final int MEDIA = 60;

        //SAIDA PARA IMPRESSAO NO TERMINAL
        System.out.println("Digite o nome do aluno: ");
        
        //NEXTLINE PARA RECEBER ENTRADA DO TECLADO E QUEBRAR A LINHA
        nome = scan.nextLine();

        System.out.println("Digite nota 1: ");
        //NEXT.INT PARA RECEBER ENTRADA DO TECLADO E RETORNAR INTEIRO           
        n1 = scan.nextInt();
        System.out.println("Digite nota 2: ");
        n2 = scan.nextInt();
        System.out.println("Digite nota 3: ");
        n3 = scan.nextInt();
        System.out.println("Digite nota 4: ");
        n4 = scan.nextInt();
        soma = n1 + n2 + n3 + n4;

        if(soma >= MEDIA)
        {
            res = "aprovado";
        }
        else if(soma >= 40)
        {
            res = "recuperacao";
        }
        else
        {
            res = "reprovado";
        }
        System.out.printf("Aluno %s foi %s com nota %d", nome, res, soma);
    }
}
