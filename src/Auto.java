public class Auto {
        private String targa;

        private double cilindrata;

        private String modello;

        private String marca;

    public Auto(String targa, double cilindrata, String modello, String marca) {
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.modello = modello;
        this.marca = marca;
    }

    public String getTarga() {
            return targa;
        }

        public void setTarga(String targa) {
            this.targa = targa;
        }

        public double getCilindrata() {
            return cilindrata;
        }

        public void setCilindrata(double cilindrata) {
            this.cilindrata = cilindrata;
        }

        public String getModello() {
            return modello;
        }

        public void setModello(String modello) {
            this.modello = modello;
        }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
