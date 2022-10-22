public class Main {
    public static void main(String[] args) {
        Person anton= new Person();
        Person riko= new Person();

        anton.setNama("Anton");
        anton.setJenisKelamin("Laki-Laki");
        anton.setUmur(21);

        riko.setNama("Riko");
        riko.setJenisKelamin("Laki-Laki");
        riko.setUmur(25);


        System.out.println("Nama person adalah " + anton.getNama());
        System.out.println("Jenis Kelamin person adalah " + anton.getJenisKelamin());
        System.out.println("Umur person adalah " + anton.getUmur());


        System.out.println("Nama person adalah " + riko.getNama());
        System.out.println("Jenis Kelamin person adalah " + riko.getJenisKelamin());
        System.out.println("Umur person adalah " + riko.getUmur());
    }
}