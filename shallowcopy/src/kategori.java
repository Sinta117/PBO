public class kategori {

    public String JenisBarang;
    public String JenisBahan;
    public Product PRODUKSI;

    public kategori(String jenisBarang, String jenisBahan, Product PRODUKSI) {
        JenisBarang = jenisBarang;
        JenisBahan = jenisBahan;
        this.PRODUKSI = PRODUKSI;
    }

    public String getJenisBarang() {
        return JenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
    }

    public String getJenisBahan() {
        return JenisBahan;
    }

    public void setJenisBahan(String jenisBahan) {
        JenisBahan = jenisBahan;
    }

    public Product getPRODUKSI() {
        return PRODUKSI;
    }

    public void setPRODUKSI(Product PRODUKSI) {
        this.PRODUKSI = PRODUKSI;
    }

    @Override
    public String toString() {
        return "kategori{" +
                "JenisBarang='" + JenisBarang + '\'' +
                ", JenisBahan='" + JenisBahan + '\'' +
                ", PRODUKSI=" + PRODUKSI +
                '}';
    }
}
