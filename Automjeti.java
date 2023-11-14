package Ushtrime1W1;

public class Automjeti {
    int nrSasise;//readonly
    String prodhuesi;
    int vitiProdhimit;
    public Automjeti(int nrSasise, String prodhuesi, int vitiProdhimit) {
        this.nrSasise=nrSasise;
        this.prodhuesi=prodhuesi;
        this.vitiProdhimit=vitiProdhimit;
    }
    public int getNrSasise() {
        return nrSasise;
    }
    public String getProdhuesi() {
        return prodhuesi;
    }
    public int getVitiProdhimit() {
        return vitiProdhimit;
    }
    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi=prodhuesi;
    }
    public void setVitiProdhimit(int vitiProdhimit) {
        this.vitiProdhimit=vitiProdhimit;
    }
    public String toString() {
        return nrSasise+" : "+prodhuesi+" - "+vitiProdhimit;
    }
    public boolean equals(Object obj) {
        if(obj instanceof Automjeti) {
            Automjeti a = (Automjeti)obj;
            return nrSasise==a.getNrSasise();
        }
        return false;
    }
}
