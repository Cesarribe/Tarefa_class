public class Main {
    public static void main(String[] args) {

        Passaro pardal = new Passaro();
        pardal.setPeso(10);
        pardal.setVelocidade(3);
        System.out.println(pardal.pace());
        System.out.println(pardal.comunicar());
    }
}