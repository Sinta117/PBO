public class Main {
    public static void main(String[] args){
        Main main1 = new Main();
        main1.Shallowing_productCategories();
    }
   public void Shallowing_productCategories(){
        Product produksi = new Product("117", "Rabani","L","15.000");
        kategori Hijab = new kategori("Pasmina", "Voal",produksi);
        kategori Hijab1= new kategori(Hijab.getJenisBarang(), Hijab.getJenisBahan(), produksi);

        Hijab1.setJenisBahan("Wolfis");
        Hijab1.setJenisBarang("HijabInstan");


        System.out.println(produksi);
        System.out.println(Hijab);
        System.out.println(Hijab1);

   }
}
