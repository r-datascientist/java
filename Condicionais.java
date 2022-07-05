public class Condicionais{
    public static void main(String[] args){

        //OPERADORES CONDICIONAIS
        //&& || == > < >= <= != ! (true / false)

        //TABELA VERDADE AND &&
        /*
            V V = V
            V F = F 
            F V = F
            F F = F
        */    
        
        //TABELA VERDADE OR ||
        /*
            V V = V
            V F = V 
            F V = V
            F F = F
        */

        int nota = 50;
        int media = 60;
        int falta = 5;
        int maxFalta = 5;
        String res1;
        int res2;
        int lugar = 1;

        //OPERAÇÃO CONDICIONAL TERNARIA
        //SE VERDADEIRA A CONDIÇÃO RETORNA O PRIMEIRO VALOR SENAO O SEGUNDO
        res1 = (nota >= media ? "Aprovado" : "Reprovado");
        System.out.println("Resultado Condicional Ternária 1: " + res1);

        res2 = (nota >= media ? 1 : 0);
        System.out.println("Resultado Condicional Ternária 2: " + (res2 == 1 ? "Aprovado" : "Reprovado"));

        if(nota >= media && falta <= maxFalta){
            System.out.println("Aprovado");
        }
        else if(nota >= 40){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    
        //SWITCH CASE IRÁ AVALIAR UMA CONSTANTE E EXECUTAR O CASE CONDICIONAL OU PADRÃO
        switch(lugar){
            case 1:
                System.out.println("Primeiro Lugar!");
                break;
            case 2:
                System.out.println("Segundo Lugar!");
                break;
            case 3:
                System.out.println("Terceiro Lugar!");
                break;
            case 4:
                System.out.println("Prêmio de participação");
                break;
            default:
                System.out.println("Não ganhou prêmio...");
                break;
        }
        System.out.println("Fim do Programa!");   
    }
}