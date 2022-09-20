public class Main {
    public static void main(String args[]) {
        boolean status;

        // Nasabah 1
        Nasabah nasabah = new Nasabah("Budi", "Setiawan");
        nasabah.setTabungan(new Tabungan(14980000));

        // Nasabah 2
        Nasabah nasabah2 = new Nasabah("Yosua", "Putra");
        nasabah2.setTabungan(new Tabungan(7149800));

        // Cetak setiap nasabah
        System.out.println(nasabah.toString());
        System.out.println(nasabah2.toString());

        // Nasabah 1 menabung 4000 dan tampilan saldo
        System.out.println("\nSaldo awal nasabah " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir() + " : " + nasabah.getTabungan().getSaldo());
        nasabah.getTabungan().simpanUang(4000);
        System.out.println("Jumlah uang yang disimpan : 4000");
        System.out.println("Saldo sekarang : " + nasabah.getTabungan().getSaldo());

        // Nasabah 2 menabung 7000 dan tampilan saldo
        System.out.println("\nSaldo awal nasabah " + nasabah2.getNamaAwal() + " " + nasabah2.getNamaAkhir() + " : " + nasabah2.getTabungan().getSaldo());
        nasabah2.getTabungan().simpanUang(7000);
        System.out.println("Jumlah uang yang disimpan : 7000");
        System.out.println("Saldo sekarang : " + nasabah2.getTabungan().getSaldo());

        // Nasabah 1 mengambil uang 5000 dan tampilan saldo
        status = nasabah.getTabungan().ambilUang(5000);
        System.out.print("\nJumlah uang yang diambil : 5000");
        if(status) {
            System.out.println(" <-- berhasil diambil");
        } else {
            System.out.println(" <-- gagal diambil");
        }
        System.out.println("Saldo sekarang nasabah " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir() + " : " + nasabah.getTabungan().getSaldo());

        // Nasabah 2 mengambil uang 6000 dan tampilan saldo
        status = nasabah2.getTabungan().ambilUang(6000);
        System.out.print("\nJumlah uang yang diambil : 6000");
        if(status) {
            System.out.println(" <-- berhasil diambil");
        } else {
            System.out.println(" <-- gagal diambil");
        }
        System.out.println("Saldo sekarang nasabah " + nasabah2.getNamaAwal() + " " + nasabah2.getNamaAkhir() + " : " + nasabah2.getTabungan().getSaldo());

        // Nasabah 2 transfer ke nasabah 1 sebesar 1000
        nasabah2.getTabungan().transfer(nasabah.getTabungan(), 1000);
        
        // Saldo sekarang dari nasabah 1 dan 2
        System.out.println("\nSaldo sekarang nasabah " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir() + " setelah menerima uang : " + nasabah.getTabungan().getSaldo());
        System.out.println("Saldo sekarang nasabah " + nasabah2.getNamaAwal() + " " + nasabah2.getNamaAkhir() + " setelah transfer : " + nasabah2.getTabungan().getSaldo());
    }
}
