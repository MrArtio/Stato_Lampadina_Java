enum StatoLampadina {
    ACCESA,
    SPENTA,
    ROTTA,
}

public class Lampadina {
    private StatoLampadina stato = StatoLampadina.SPENTA;
    private int nClick;

    public Lampadina(int nClick) {
        this.nClick = nClick;
    }
    public void click() {
        if (nClick == 0) {
            this.stato = StatoLampadina.ROTTA;
        }
        if (stato == StatoLampadina.SPENTA) {
            this.stato = StatoLampadina.ACCESA;
            this.nClick -= 1;
        } else if (stato == StatoLampadina.ACCESA) {
            this.stato = StatoLampadina.SPENTA;
            this.nClick -= 1;
        }
    }

    public String toString() {
        return stato.name();
    }

}
