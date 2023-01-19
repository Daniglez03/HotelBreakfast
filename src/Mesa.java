public class Mesa {
    int magdalenas;

    public Mesa(int magdalenas) {
        this.magdalenas = magdalenas;
    }

    public int getMagdalenas() {
        return magdalenas;
    }
    public void setMagdalenas(int magdalenas) {
        this.magdalenas = magdalenas;
    }

    synchronized public void consumir(String clientName) {
        setMagdalenas(getMagdalenas() -1);
    }
}
