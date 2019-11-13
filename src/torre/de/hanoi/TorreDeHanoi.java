package torre.de.hanoi;

import java.util.Scanner;

/**
 *
 * @author lbord
 */


// RECURSIVA


public class TorreDeHanoi {
    
 
    // executando o hanoi
    public static void main(String[] args) {
 
        int n; 
 
        // recebe o número de discos digitado pelo usuário atraves desse scanner
 
    Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de discos: ");
        n = entrada.nextInt();
 
        // executa o hanoi!
        TorreDeHanoi.hanoi(n, 1, 3, 2);
    }
    private static void movimento(int pinoOrigem, int pinoDestino) {
        // essa é a estrutura que vai ser para cada movimento
        System.out.println("movimento de "+ pinoOrigem +" para "+ pinoDestino);
    }
    
    static void hanoi(int n, int pinoOrigem, int pinoAuxiliar, int pinoDestino) {
 
        if (n > 0) {
            //formula recursiva consiste em começar de tras para frente.
            //para isso chamamos a propria funcao dentro de si propria
            
            hanoi(n - 1, pinoOrigem, pinoAuxiliar, pinoDestino);
            //chama funçao de movimento com os parametros de origem e destino
                movimento(pinoOrigem, pinoDestino);
            //mudança da ordem e menos um para o contador e assim a ordem segue
            //sucessivamente até a organizacao final
            hanoi(n - 1, pinoAuxiliar, pinoDestino, pinoOrigem);
        }
 
    }
}
