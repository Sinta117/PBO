public class DeepCopy {

    public static void main(String[] args) {
        DeepCopy main2 = new DeepCopy();
        main2.DeepCopy_productCategories();
    }

    public void DeepCopy_productCategories() {
        Product produksi = new Product("117", "Rabani","L","15.000");
        kategori Hijab = new kategori("Pasmina", "Voal", produksi);
        kategori DeepCopy = (kategori) SerializationUtils.clone(Hijab);


        System.out.println(produksi);
        System.out.println(Hijab);

    }

}