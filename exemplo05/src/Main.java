public class Main {
    public static void main(String[] args) {
        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setNumConta(111);
        pessoa1.setDono("Joao Primeiro");
        pessoa1.abrirConta("CC");
        pessoa1.depositar(100);
        pessoa1.estadoAtual();

        ContaBanco pessoa2 = new ContaBanco();
        pessoa2.setNumConta(112);
        pessoa2.setDono("Maria Segunda");
        pessoa2.abrirConta("CP");
        pessoa2.sacar(1000);
        pessoa2.estadoAtual();
    }
}
