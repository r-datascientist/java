public class Print{
  public static void main(String[] args){

    //DECLARANDO VARIAVEIS
    int num = 0;
    String nome = "Curso";

    int n1,n2,n3;
    n1 = 10;
    n2 = 20;
    n3 = 30;
    int res = n1 + n2 + n3;

    //METODO PRINT IMPRIME SEM QUEBRA DE LINHA
    System.out.print("Curso de Java print");
    
    //QUEBRA DE LINHA COM CARACTER DE ESCAPE
    System.out.print("Curso de Java escape\n");

    //METODO PRINTLN IMPRIME COM QUEBRA DE LINHA
    System.out.println("Curso de Java println");

    //IMPRE COM FORMATACAO
    //%s PARA FORMATO STRING
    //%d PARA INTEIRO
    //%f PARA PONTO FLUTUANTE
    System.out.printf("Matéria:%s - Ano:%d", "Curso de Java", 2022);
    //QUEBRA DE LINHA COM ESCAPE
    System.out.printf("%nMatéria:%s - Ano:%d", nome, num+res);
  


    }  
}