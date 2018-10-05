
public class nasabah {
    private String  namaNasabah;
    private int saldo;
    private String pesan;
    int noAntrian=1;
    
    public void nasabah(String nama){
        namaNasabah=nama;
        System.out.println("Nama Nasabah : " + namaNasabah);
    }
    public int  tabungan(int jumlah){
        return saldo=saldo+jumlah;
    }
     public int getSaldo(){
        return saldo;
    }
     public String getPesan(){
         return pesan;
     }
    public int ambilUang(int uang){
        if(saldo- uang < 50000 ){
            System.out.println("Maaf saldo anda sekarang tidak mencukupi.");
            return saldo;
        }else{
            System.out.println("Uang Berhasil Ditarik Sebesar " + uang );
            noAntrian++;
           return saldo-=uang;
        }
        
    }
     public int ambilUang(int uang, String peringatan){
        if(saldo - uang < 50000 ){
            System.out.println(" Maaf, uang Gagal ditarik sebesar " + uang );
            noAntrian++;
            pesan=peringatan;
            return saldo;

        }else{
            System.out.println("Berhasil ditarik sebesar " + uang );
            noAntrian++;
            pesan=peringatan;
           return saldo-=uang;
           
        }
        
    }
   
}

