void main(){
    /**
     * Morador:
     *      Nome: José
     *      Idade: 80
     *      Aluguel: 520,50
     *      Ele já pagou desse mês? Sim / Não
     * 
     * 
     *      Para compilar: javac NomeDoArquivo.java
     *      Para rodar: java NomeDoArquivo
     * 
     */

    String nome = "José";
    int idade = 18;
    double aluguel = 520.50;
    boolean eleJaPagou = false;

    IO.println(nome);
    IO.println(idade);
    IO.println(aluguel);
    IO.println(eleJaPagou);

    // Meu Funcionario, olha se o José pagou, se pagou, só me avisa, se não cobra ele

 // se
    if(eleJaPagou){
        IO.println("O José Já pagou");
   // senão
    } else {
        IO.println("José Pague a conta agora!");
    }

    // ==, !=, valor > valor, valor < valor, <=, >=

    // Estrutura Condicional
    if(idade > 75){
        IO.println("10% desconto!");
    } else if(idade > 60) {
        IO.println("5% de desconto");
    } else {
        IO.println("Valor Normal!");
    }

    // Soma +
    // Substração -
    // Multiplicação *
    // Divisão /

    
}