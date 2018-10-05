
public class Bank {

    public static void main(String[] args) {

        final String bank="Bank A";
        System.out.println("Nama Bank : " + bank);

        nasabah n1=new nasabah();
        n1.nasabah("Young Lex");
        n1.tabungan(8000000);
        n1.ambilUang(5000000);
        n1.ambilUang(100000,"Biaya meet and greet");

        System.out.println(n1.getSaldo());
        System.out.println(n1.getSaldo() + "  " + n1.getPesan());

        System.out.println();
        nasabah n2=new nasabah();
        n2.nasabah("Awkarin");
        n2.tabungan(7000000);
        n2.ambilUang(4000000);
        n2.ambilUang(1000000,"Biaya memelihara kuda");
        
        System.out.println(n2.getSaldo());
        System.out.println(n2.getSaldo() + "  " + n2.getPesan());

        System.out.println();
        nasabah n3=new nasabah();
        n3.nasabah("Reza Arap");
        n3.tabungan(15000000);
        n3.ambilUang(10000000);
        n3.ambilUang(2000000,"Biaya untuk surak");

        System.out.println(n3.getSaldo());
        System.out.println(n3.getSaldo() + "  " + n3.getPesan());

        System.out.println();

        System.out.println("\nTotal Transaksi Ambil Uang : " + n3.noAntrian);
        
    } 
}
