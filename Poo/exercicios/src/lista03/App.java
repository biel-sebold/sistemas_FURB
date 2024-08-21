package Poo.exercicios.src.lista03;

import java.util.Scanner;

//O objetivo deste exercício é implementar um programa para calcular o valor de imposto de renda (IRPF) a ser pago por uma
// pessoa. O cálculo do imposto de renda baseia-se no valor de salário recebido pela pessoa. Para calcular o imposto, o governo criou uma tabela que define em que faixa o salário se enquadra. Observe a tabela 1.

//                       Tabela 1
//
// Faixa             Faixa de Salário                   Alíquota
// 1ª Faixa      Até R$ 1.903,98                         Isento
// 2ª Faixa      De R$ 1.903,99 à R$ 2.826,65             7,5%
// 3ª Faixa      De R$ 2.826,66 à R$ 3.751,05            15,0%
// 4ª Faixa      De R$ 3.751,06 à R$ 4.664,68            22,5%
// 5ª Faixa      A partir de R$ 4.664,69                 27,5%

//Por exemplo, uma pessoa que ganha R$ 3.000,00 por mês se enquadra na 3ª faixa. O cálculo aplica um percentual para a faixa do salário e para cada uma das faixas que a antecedem. Para exemplificar como deve ser calculado o imposto, tomar como exemplo um salário de R$ 3.000,00. O cálculo é feito da seguinte forma (tabela 2):

//                                  Tabela 2
//
// Faixa                            Descrição                                              Imposto
// 1ª. Faixa           Para R$ 1.903,98 do valor do salário,                               R$ 0,00
//                     não se paga imposto, pois conforme Tabela 1,
//                     para este valor está-se isento.
//
// 2ª. Faixa           Como o salário é superior a 1.903,98, paga-se                       R$ 69,20
//                     imposto sobre a diferença do salário com o limite
//                     da faixa anterior, contudo, considerando-se 
//                     o limite da faixa corrente que é de 2.826,65.
//                     Assim, paga-se 7,5% de imposto sobre R$ 922,67
//                     (que equivale à R$ 2.826,65 – R$ 1.903,98).
//
// 3ª. Faixa           Como o salário é superior a R$ 2.826,66, paga-se                    R$ 26,00
//                     imposto sobre a diferença do salário com o limite
//                     da faixa imediatamente anterior. Considerar o 
//                     limite desta faixa que é de R$ 3.751,05. Portanto,
//                     deve-se pagar a alíquota de 15% sobre R$ 173,35 
//                     (afinal, esta é a diferença entre R$ 3.000,00 e R$ 2.826,65).
//
//                     Total (soma-se o valor de todas as faixas)                         R$ 95,20

// Portanto, o indivíduo que recebe o salário de R$ 3.000,00 deverá pagar R$ 95,20 de imposto de renda por mês.

// Considere que:
// - O atributo nome deva ser utilizado para armazenar o nome de um funcionário;
// - O atributo salario deva representar o salário de um funcionário, se o usuário informar um valor negativo, lance uma exceção;
// - O método calcularIrpf() deve ser utilizado para retornar o valor de imposto de renda (IRPF) a ser cobrado sobre o salário informado, utilizando o algoritmo descrito anteriormente.
// - Construa um programa que solicite ao usuário o nome e o salário de 5 funcionários. Armazene os funcionários num vetor. Ao final da digitação dos funcionários, exiba uma relação (lista) contendo o nome do funcionário, salário e IRPF.


public class App {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < funcionarios.length; i++) {

            Funcionario funcionarioAdd = new Funcionario();

            System.out.printf("Informe o nome do funcionário %d: ", i);
            funcionarioAdd.setNome(sc.next());

            System.out.printf("Informe o salário do funcionário %d: ", i);
            funcionarioAdd.setSalario(sc.nextDouble());  
            
            funcionarios[i] = funcionarioAdd;
        }

        sc.close();

        for (int i = 0; i < funcionarios.length; i++) {

            Funcionario func = funcionarios[i];

            System.out.println(">>>RESULTADO<<<\n\n");
            System.out.printf("FUNCIONÁRIO: %s", func.getNome());
            System.out.printf("SALÁRIO: R$%.2f", func.getSalario());
            System.out.printf("IMPOSTO: R$%.2f", func.calcularIrpf());
            
        }
    }

}

