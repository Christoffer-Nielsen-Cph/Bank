package DomæneObjekter;

public class Konto {
    private String navn;
    private String kode;
    private int saldo;

    public Konto(String navn, String kode, int saldo) {
        this.navn = navn;
        this.kode = kode;
        this.saldo = saldo;
    }

    public String getNavn() {
        return navn;
    }

    public String getKode() {
        return kode;
    }

    public int getSaldo() {
        return saldo;
    }

    public int indsæt(int i) {
        if(i<0){
            System.out.println("Negative penge findes ikke!");
          return saldo;
        } else {
            saldo = saldo + i;
        }
        return saldo;
    }
    public int hævPenge(int k){
        if(saldo-k<0){
            System.out.println("Du kan ikke hæve penge du ikke har!");
            return saldo;
        }else {
            saldo = saldo - k;
        }
        return saldo;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
