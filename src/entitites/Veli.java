package entitites;

import java.util.ArrayList;
import java.util.List;

public class Veli extends Kisi {
    private List<Ogrenci> cocuklar = new ArrayList<>();

    public List<Ogrenci> getCocuklar() {
        return cocuklar;
    }
}
