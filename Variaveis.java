
//TODO ARQUIVO JAVA É UMA CLASSE
//SENDO ASSIM TODA CLASSE DEVE TER O MESMO NOME DO ARQUIVO
public class Variaveis{
    public static void main(String[] args){
        //DECLARANDO VARIAVEIS
        int num = 0;
        String nome = "Curso";

        int n1,n2,n3;
        n1 = 10;
        n2 = 20;
        n3 = 30;
        int res = n1 + n2 + n3;

        //QUEBRA DE LINHA COM ESCAPE
        System.out.printf("%nMatéria:%s - Ano:%d", nome, num+res);
    }
}