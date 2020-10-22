class Product {
    public String CodeBarang;
    public String MerkBarang;
    public String UkuranBarang;
    public String HargaBarang;

    public Product(String codeBarang, String merkBarang, String ukuranBarang, String hargaBarang) {
        CodeBarang = codeBarang;
        MerkBarang = merkBarang;
        UkuranBarang = ukuranBarang;
        HargaBarang = hargaBarang;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(this.getCodeBarang(), this.getMerkBarang(),this.getUkuranBarang(),this.getHargaBarang());
        }
    }
    public String getCodeBarang() {
        return CodeBarang;
    }

    public void setCodeBarang(String codeBarang) {
        CodeBarang = codeBarang;
    }

    public String getMerkBarang() {
        return MerkBarang;
    }

    public void setMerkBarang(String merkBarang) {
        MerkBarang = merkBarang;
    }

    public String getUkuranBarang() {
        return UkuranBarang;
    }

    public void setUkuranBarang(String ukuranBarang) {
        UkuranBarang = ukuranBarang;
    }

    public String getHargaBarang() {
        return HargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        HargaBarang = hargaBarang;
    }

    @Override
    public String toString() {
        return "Product{" +
                "CodeBarang='" + CodeBarang + '\'' +
                ", MerkBarang='" + MerkBarang + '\'' +
                ", UkuranBarang='" + UkuranBarang + '\'' +
                ", HargaBarang='" + HargaBarang + '\'' +
                '}';
    }
}
