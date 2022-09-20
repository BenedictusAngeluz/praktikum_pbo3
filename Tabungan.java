public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if ((saldo - jumlah) < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean transfer(Tabungan t, int jumlah) {
        if (saldo > jumlah) {
            saldo -= jumlah;
            t.saldo += jumlah;
            return true;
        } else {
            return false;
        }
    }
}