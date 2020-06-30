package View;

import Model.Aluno;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno a1 = new Aluno();

        System.out.println(">>>PREENCHA OS DADOS PARA REALIZAR A PROVA<<<");
        System.out.println("\n\nDigite o nome do aluno: ");
        a1.setNome(ler.next());
        System.out.println("Digite o RA do aluno: ");
        a1.setRa(ler.nextInt());

        //Validação do Login e senha
        String user = "alunoqi";
        int password = 12345;
        String login;
        int senha;

        do {
            System.out.println("Digite seu Login: ");
            login = ler.next();
            System.out.println("Digite seua senha: ");
            senha = ler.nextInt();
            if (!(login.equals(user)) || senha != password) {
                System.out.println("Senha ou login inválidos");
            }
        } while (!(login.equals(user)) || senha != password);

        System.out.println("\n\n\nA prova será exibida a seguir.");
        System.out.println("OBS.: Existe apenas uma alternativa correta para cada questão!!!");

        //                                  QUESTÕES
        byte contErros = 0;
        byte contAcertos = 0;
        //Questão 1
        System.out.println("\nQUESTÃO 1:"
                + "\nA presença de ...... caracteriza um vetor."
                + "\n1) ()"
                + "\n2) []"
                + "\n3) ;"
                + "\n4) Nenhuma das alternativas.");
        byte resposta = ler.nextByte();
        a1.cadastrarRespostas(0, resposta);
        if (resposta == 2) {
            contAcertos++;
        } else {
            contErros++;
        }
        //Questão 2
        System.out.println("\nQUESTÃO 2:"
                + "\nMétodos de entrada e saída:"
                + "\n1) public e private"
                + "\n2) public static void main(String [] args)"
                + "\n3) getter and setter"
                + "\n4) System.out.println()");
        resposta = ler.nextByte();
        a1.cadastrarRespostas(1, resposta);
        if (resposta == 3) {
            contAcertos++;
        } else {
            contErros++;
        }
        //Questão 3
        System.out.println("\nQUESTÃO 2:"
                + "\nQual a diferença de Array e ArrayList"
                + "\n1) array e arraylist são a mesma coisa, só muda o nome."
                + "\n2) Array tem um número determinado de tarefas, já ArrayList é um número indeterminado."
                + "\n3) Array e ArrayList não existem em Java."
                + "\n4) todas as alternativas estão erradas.");
        resposta = ler.nextByte();
        a1.cadastrarRespostas(2, resposta);
        if (resposta == 2) {
            contAcertos++;
        } else {
            contErros++;
        }
        //Questão 4
        System.out.println("\nQUESTÃO 4:"
                + "\nDefina \"public Double sacarDinheiro(double valor){}\":"
                + "\n1) Método sem retorno com argumento."
                + "\n2) Método com retorno sem argumento."
                + "\n3) Método construtor."
                + "\n4) Método de acesso.");
        resposta = ler.nextByte();
        a1.cadastrarRespostas(3, resposta);
        if (resposta == 4) {
            contAcertos++;
        } else {
            contErros++;
        }
        //Questão 5
        System.out.println("\nQUESTÃO 5:"
                + "\nMétodo com retorno para mostrar dados:"
                + "\n1) System.out.println(\"resultado: \"+ resultado);"
                + "\n2) public resultado;"
                + "\n3) toString."
                + "\n4) return \"resultado: \"+this.resultado;");
        resposta = ler.nextByte();
        a1.cadastrarRespostas(4, resposta);
        if (resposta == 3) {
            contAcertos++;
        } else {
            contErros++;
        }
        //Questão 6
        System.out.println("\nQUESTÃO 6:"
                + "\nQual a definição de Java?"
                + "\n1) Uma linguagem de interpretação e plataforma web."
                + "\n2) Uma linguagem corporal e plataforma digital."
                + "\n3) ma linguagem nacional e plataforma estadual"
                + "\n4) uma linguagem nacional e plataforma estadual.");
        resposta = ler.nextByte();
        a1.cadastrarRespostas(5, resposta);
        if (resposta == 3) {
            contAcertos++;
        } else {
            contErros++;
        }
        //Questão 7
        System.out.println("\nQUESTÃO 7:"
                + "\nSão estruturas condicionais:"
                + "\n1) if/else e switch."
                + "\n2) double e int."
                + "\n3) getter and setter."
                + "\n4) equals and this.");
        resposta = ler.nextByte();
        a1.cadastrarRespostas(6, resposta);
        if (resposta == 1) {
            contAcertos++;
        } else {
            contErros++;
        }
        //Questão 8
        System.out.println("\nQUESTÃO 8:"
                + "\nSão laços de repetição:"
                + "\n1) do, int e while."
                + "\n2) while, byte e equals."
                + "\n3) for, public e if."
                + "\n4) do, while e for.");
        resposta = ler.nextByte();
        a1.cadastrarRespostas(7, resposta);
        if (resposta == 4) {
            contAcertos++;
        } else {
            contErros++;
        }
        //Questão 9
        System.out.println("\nQUESTÃO 9:"
                + "\nNão são operadores relacionais:"
                + "\n1) >,<,>=,<=,&& e !="
                + "\n2) >,<,^,+,% e *!while, byte e equals."
                + "\n3) >,<,>=,<=,== e !="
                + "\n4) As alternativas 1 e 2 estão corretas.");
        resposta = ler.nextByte();
        a1.cadastrarRespostas(8, resposta);
        if (resposta == 4) {
            contAcertos++;
        } else {
            contErros++;
        }
        //Questão 10
        System.out.println("\nQUESTÃO 10:"
                + "\nO que significa &&,|| e ! respectivamente?"
                + "\n1) Saida, ou e igual."
                + "\n2) E, ou e negação."
                + "\n3) Ou, diferente e igual"
                + "\n4) Saida,e e igual.");
        resposta = ler.nextByte();
        a1.cadastrarRespostas(9, resposta);
        if (resposta == 2) {
            contAcertos++;
        } else {
            contErros++;
        }

        System.out.println("\nNome: " + a1.getNome());
        System.out.println("RA: " + a1.getRa());

        System.out.println("Número de acertos: " + contAcertos);
        System.out.println("Número de erros: " + contErros);
        System.out.println(
                "\nQuestão 1 = Alternativa 2."
                + "\nQuestão 2 = Alternativa 4."
                + "\nQuestão 3 = Alternativa 2."
                + "\nQuestão 4 = Alternativa 4."
                + "\nQuestão 5 = Alternativa 3."
                + "\nQuestão 6 = Alternativa 3."
                + "\nQuestão 7 = Alternativa 1."
                + "\nQuestão 8 = Alternativa 4."
                + "\nQuestão 9 = Alternativa 4."
                + "\nQuestão 10 = Alternativa 2.");

        if (contAcertos <= 1) {
            System.out.println("\nAluno reprovado");
        } else if (contAcertos >= 2 && contAcertos <= 5) {
            System.out.println("\nAluno em recuperação");
        } else if (contAcertos >= 6 && contAcertos <= 9) {

        } else {
            System.out.println("\nAluno aprovado com laurea acadêmic");
        }
    }

}
