public class Main {
    public static void main(String[]args){
        lingkaran lkrn = new lingkaran();
        BujurSangkar sangkar = new BujurSangkar();

        lkrn.setradius(5);
        lkrn.hitungkelilinglingkaran();
        System.out.println("Keliling Lingkaran Adalah = " + lkrn.getkeliling());

        sangkar.setsisi(5);
        sangkar.keliling();
        System.out.println("Keliling Bujursangkar Adalah = " + sangkar.getKeliling());
    }
}
