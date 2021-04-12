import java.util.HashMap;
import java.util.Map;

public class Ember {
    private final String nev;
    private Sarkany[] sarkanyok;

    public Ember(String nev, int sarkanySzam) {
        this.nev = nev;
        sarkanyok = new Sarkany[sarkanySzam];
    }

    public Ember(int sarkanySzam) {
        this.nev = "Noemi neni";
        sarkanyok = new Sarkany[sarkanySzam];
    }
    public void sarkanySzuletik(Sarkany s) {
        for (int i = 0; i < sarkanyok.length; i++) {
            if (sarkanyok[i] == null) {
                sarkanyok[i] = s;
                return;
            }
        }


        double legkisebbErtek = Double.MAX_VALUE;
        int legkisebbPozicio = -1;
        for (int i = 0; i < sarkanyok.length; i++) {
            if (sarkanyok[i].ero < legkisebbErtek) {
            legkisebbErtek = sarkanyok[i].ero;
            legkisebbPozicio = i;
        }
    }

    sarkanyok[legkisebbPozicio] = s;
}

public double osszErosseg() {
    double ossz = 0;
    for (Sarkany s : sarkanyok) {
        if (s != null) {
            ossz += s.ero;
        }
    }
    return ossz;
    }

    public String leggyakrabbi() {
        Map<String, Integer > gyakorisag = new HashMap<>();
        for (Sarkany s : sarkanyok) {
            if (s != null) {
                gyakorisag.put(s.szin, gyakorisag.getOrDefault(s.szin, 0)+1 );
            }
        }

        int max = -1;
        String szin = null;
        for (Map.Entry< String, Integer> gyak: gyakorisag.entrySet()) {
            if (gyak.getValue() > max) {
                max = gyak.getValue();
                szin = gyak.getKey();
            }
        }

        return szin;
    }

    public String toString() {
        StringBuilder res = new StringBuilder(this.nev + System.lineSeparator());
        for (Sarkany s : sarkanyok) {
            if (s != null) {
                res.append(s.toString()).append(System.lineSeparator());
            }
        }
        return res.toString();
    }
}
