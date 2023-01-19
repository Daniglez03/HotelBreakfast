public class Comensales extends Thread implements Runnable {

    String name;
    private Mesa mesa;
    private int CONSUMING_TIME = 10000;

    public Comensales(String name, Mesa mesa) {
        this.name = name;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while (mesa.getMagdalenas() != 0) {
            try {
                mesa.consumir(this.name);
                System.out.println(this.name + " ha cogido una magdalena de la mesa");
                Thread.sleep(this.CONSUMING_TIME);
                System.out.println(this.name + " se ha terminado de comer una magdalena");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
