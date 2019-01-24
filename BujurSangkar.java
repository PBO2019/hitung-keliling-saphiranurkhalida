public class BujurSangkar {
    public static void main(String[] args){
        sangkar keliling = new sangkar();
        keliling.hitung();
    }
    static class sangkar{
        public int sisi = 5;
        public double KelilingBujurSangkar;

        public void hitung(){
            KelilingBujurSangkar = 4 * sisi;
            System.out.println("Keliling Bujur Sangkar Adalah = " + KelilingBujurSangkar);
        }
    }
}
