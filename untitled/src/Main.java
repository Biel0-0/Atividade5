public class Main {
    public static void main(String[] args) {
        PessoaFactory fabrica = new PessoaFactory();

        Pessoa pessoa1 = fabrica.criarPessoa("Jorge", 22);
        Pessoa pessoa2 = fabrica.criarPessoa("Carlao", 33);
        Pessoa pessoa3 = fabrica.criarPessoa("Periquita Fogosa", 44);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}