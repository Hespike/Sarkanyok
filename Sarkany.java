public class Sarkany{
    protected String nev;
    protected String szin;
    protected double ero;
    protected boolean tuzokado;

    public Sarkany(String nev) {
        this.nev = nev;
        this.szin = "zold";
        this.ero = 1;
        this.tuzokado = false;
    }

    public Sarkany(String nev, String szin, double ero, boolean tuzokado) {
        this.nev = nev;
        this.szin = szin;
        this.tuzokado = tuzokado;

        if (ero < 0) {
            this.ero = -ero;
        } else if (ero > 0) {
            this.ero = ero;
        } else {
            this.ero = 0.1;
        }
    }

    @Override
    public String toString() {
        return nev + " egy " + szin + " szinu " + (tuzokado? "tuzokado" : "nem tuzokado") + " sarkany, akinek ereje " + ero + ".";
    }
public void erosodik() { ero *= 2; }


    public String getNev() {return nev; }
    public void setNev(String nev) {this.nev = nev; }
    public String getSzin() {return szin; }
    public void setSzin(String szin) {this.szin = szin; }
    public double getEro() {return ero; }
    public void setEro(double ero) {
        if (ero >= 0.1) {
            this.ero = ero;
        }
    }

    public boolean isTuzokado() {return tuzokado;}
    public void setTuzokado(boolean tuzokado) {this.tuzokado = tuzokado; }


}
