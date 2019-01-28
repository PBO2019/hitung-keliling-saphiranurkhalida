public class lingkaran {

        private double keliling;
        private double phi = 3.14;
        private int radius;

    public void hitungkelilinglingkaran() {
            this.keliling = 2 * phi * radius;
        }

        public void setradius ( int radius){
            this.radius = radius;
        }

    public int getRadius() {
        return radius;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    public double getkeliling() {
            return keliling;
        }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getPhi() {
        return phi;
    }
}



