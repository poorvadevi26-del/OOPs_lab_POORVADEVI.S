public class WrapperImmutable {
    public static void main(String args[]) {

        Integer num = 100;
        Double value = 45.5;

        System.out.println("Original Integer : " + num);
        System.out.println("Original Double  : " + value);

        num = num + 50;
        value = value + 20.5;

        System.out.println("Modified Integer : " + num);
        System.out.println("Modified Double  : " + value);
    }
}