public class Main {

    public static void main(String[] args) {
        Mesa mesa = new Mesa(15);

        Comensales one = new Comensales("Dani G", mesa);
        Comensales two = new Comensales("Adri", mesa);
        Comensales three = new Comensales("Goyo", mesa);

        one.start();
        two.start();
        three.start();

        one.setPriority(1);
        two.setPriority(5);
        three.setPriority(10);
    }
}
