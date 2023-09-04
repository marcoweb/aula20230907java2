public class Exemplo {
    public static void main(String[] args) {
        Pessoa pes = new Pessoa();
        pes.setNome("Marco Carvalho");

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Fulano");
        pf.setCpf("12345678912");

        System.out.println("Olá Mundo!!!");
        System.out.println(pes.getNome());
    }
}