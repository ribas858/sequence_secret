# Sequência Secreta
&nbsp;Acesse o problema diretamente no site pelo link abaixo.<br/>
&nbsp;&nbsp;&nbsp;https://olimpiada.ic.unicamp.br/pratique/pj/2019/f1/secreta/ <br/>
&nbsp;Caso prefira, o problema tambem está apresentado aqui, logo após a solução.

<h3>Solução</h3>

&nbsp; Minha solução foi baseada em uma lista em que se é armazedado uma sequência de tamanho e valores fornecidos pelo usuário. Com isso eu crio duas Listas, uma com a sequência e outra com os números a serem circulados. De acordo com as regras, a sequência de números circulados não pode ter dois números consecutivos iguais, diante disso eu percorro a sequência fornecida pelo usuário e comparo com os números já circulados, armazedado em outra lista. Contudo é possível obter o número máximo de números circulados na sequência, sem repeti-los consecutivamente.<br/>

&nbsp; Segue abaixo a aprensentação do problema.<br/>

<h3>Problema</h3>

&nbsp; Na calçada em frente ao Palácio Imperial, não se sabe a razão, existe uma sequência de N números desenhados no chão. A sequência tem a seguinte forma: ela começa e termina com o número 1; apenas os números 1 e 2 aparecem nela; e o número 2 aparece pelo menos uma vez. Veja um exemplo na coluna (a) da figura abaixo.

<p align="center">
  <img src="../master/s.png" width="180" alt="accessibility text">
</p>

&nbsp; Ninguém sabe o significado da sequência e, justamente por isso, várias teorias malucas surgiram. Uma delas diz que a sequência representa, na verdade, apenas um valor que estaria relacionado a um segredo dos imperadores. Esse valor é a quantidade máxima de números da sequência que poderiam ser marcados com um círculo, de modo que a sequência de números marcados não contenha dois números iguais consecutivos.

&nbsp; A coluna (b) da figura acima ilustra uma sequência de 4 números marcados que obedece a restrição acima. Só que é possível marcar 7 números, como mostra a coluna (c) da figura.

&nbsp; Neste problema, dada a sequência original de números desenhados no chão da calçada, seu programa deve computar e imprimir a quantidade máxima de números da sequência que poderiam ser marcados com um círculo sem que haja dois números iguais consecutivos na sequência marcada.

<h3>Entrada</h3>
&nbsp; A primeira linha da entrada contém um inteiro N representando o tamanho da sequência. As N linhas seguintes contêm, cada uma, um inteiro Vi, para 1 ≤ i ≤ N, definindo a sequência de números desenhados no chão da calçada imperial.

<h3>Saída</h3>
&nbsp; Seu programa deve imprimir uma linha contendo um número inteiro representando a quantidade máxima de números da sequência que poderiam ser marcados com um círculo sem que haja dois números iguais consecutivos na sequência marcada.

<h3>Restrições</h3>
3 ≤ N ≤ 500  <br/><br/>
Vi é igual a 1 ou 2, para 1 ≤ i ≤ N

<h3>Exemplos</h3>

<table>
  <tr>
    <td class="border_l border_r border_t border_b selected">
      <h4> Entrada </h4>
      <div class="wrap"><div style="margin: 10px 5px;">5<br>1<br>1<br>1<br>2<br>1
       </div>
    </td>
    <td class="border_l border_r border_t border_b selected">
      <h4> Saída </h4>
      <div class="wrap"><div style="margin: 10px 5px;">
        3
       </div>
    </td>
  </tr>
</table>

<table>
  <tr>
    <td class="border_l border_r border_t border_b selected">
      <h4> Entrada </h4>
      <div class="wrap"><div style="margin: 10px 5px;">12<br>1<br>2<br>1<br>2<br>2<br>2<br>1<br>1<br>2<br>2<br>1<br>1
       </div>
    </td>
    <td class="border_l border_r border_t border_b selected">
      <h4> Saída </h4>
      <div class="wrap"><div style="margin: 10px 5px;">
        7
       </div>
    </td>
  </tr>
</table>

<table>
  <tr>
    <td class="border_l border_r border_t border_b selected">
      <h4> Entrada </h4>
      <div class="wrap"><div style="margin: 10px 5px;">3<br>1<br>2<br>1
       </div>
    </td>
    <td class="border_l border_r border_t border_b selected">
      <h4> Saída </h4>
      <div class="wrap"><div style="margin: 10px 5px;">
        3
       </div>
    </td>
  </tr>
</table>
