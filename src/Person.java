public class Person {


    private String nama = "";
    private String jenisKelamin = "";
    private int umur = 0;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin(){
        return this.jenisKelamin;
    }

    public void setUmur(int umur){
        this.umur=umur;
    }

    public int getUmur(){
        return this.umur;
    }
}
