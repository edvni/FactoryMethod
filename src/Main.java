public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();

        System.out.println();

        AterioivaOtus oppilas = new Oppilas();
        oppilas.aterioi();

        System.out.println();

        AterioivaOtus siivooja = new Siivooja();
        siivooja.aterioi();
    }
}
