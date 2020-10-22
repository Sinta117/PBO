public class SerializationUtils {
    private static Object kategori;

    public static Object clone(kategori hijab) {
        return hijab;
    }
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return kategori;
        }
    }
}
