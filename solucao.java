// Lucas Ribas - UnB - 2021
/////////////////////////// javac solucao.java /// java solucao //////////////

// Minha solução baseia-se em uma lista onde é armazenada uma sequência
// de tamanho e valores fornecidos pelo usuário. Com isso, criei duas listas,
// uma com a sequência e outra com os números a serem circulados. De acordo 
// com as regras, a sequência de números circulados não pode ter dois números 
// consecutivos iguais, diante disso, percorri a sequência fornecida pelo
// usuário e comparei com os números já circulados, armazenados em outra lista.
// Contudo, é possível obter o máximo de números circulados na sequência, 
// sem repeti-los consecutivamente.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solucao {
    
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<Integer>();  // Lista para armazenar a sequência
        List<Integer> circle = new ArrayList<Integer>();    // Lista para armazenar os valores circulados na sequência
        Scanner s = new Scanner(System.in);
        boolean ok = false;                                 // Flag para a leitura do valor do tamanho para a sequência
        int size, vi;                                       // Variável(size) tamanho da sequência e variavel(vi) items da sequência
        
        size = 0;
        while(!ok) {                                // Enquanto o usuário não inserir um valor entre 3 e 500, o código não progride
            try {                                   //
                size = s.nextInt();                 // Lê o tamanho sugerido pelo usuário
                if ( size >= 3 && size <= 500){
                    ok = true;
                } else {
                    System.out.println("Apenas Valores entre 3 e 500\nTente de novo!\n");
                }
            } catch (Exception e) {                 // Tratamento de erros, caso o usuário insira um valor não inteiro. ex: a, 1.2, $...
                s.nextLine();
                System.out.println("Valor invádlido!!\nApenas números inteiros!!\nErro: -> " + e.getMessage() + "\n\nTente de novo!\n");
            }
        }

        for (int i=1; i<=size; i++) {               // Popula a lista/sequência com tamanho definido pelo usuário
            try {                                   //
                vi = s.nextInt();                   // Lê o item sugerido pelo usuário
                if ( vi == 1 || vi == 2 ){          // Caso o valor inserido concorde com as regras de estar entre 1 e 2, ele é inserido
                    sequence.add(vi);
                } else {
                    System.out.println("Apenas os valores inteiros 1 ou 2");
                    i--;
                }
            } catch (Exception e) {                 // Tratamento de erros, caso o usuário insira um valor não inteiro. ex: a, 1.2, $...
                s.nextLine();
                System.out.println("Valor invádlido!!\nApenas números inteiros!!\nErro: -> " + e.getMessage() + "\nTente de novo!");
                i--;
            }
        }

        //long start_time = System.currentTimeMillis(); ==== TEMPO INCIAL DE EXECUÇÃO PARA CIRCULAR A SEQUÊNCIA

        circle.add(sequence.get(0));                                // Circula o primeiro elemento da sequência
        for (int i=0; i<sequence.size(); i++) {                     // Percorre a sequência buscando os possíveis números que possam ser marcados com um círculo
            if (sequence.get(i) != circle.get(circle.size()-1)){    // Se o elemento atual é diferente do último circulado, ele será circulado
                circle.add(sequence.get(i));
            }
        }

        System.out.println(circle.size());                          // Saída, imprime o número máximo de valores que foram circulados na sequência

        //long end_time = System.currentTimeMillis() - start_time;=========================================
        //System.out.println("Tempo de Execução: " + end_time);   ======= PIOR CASO: 2ms , MELHOR CASO: 1ms
    }
}