public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.menosVolume();
        System.out.println(c);
    }
}
