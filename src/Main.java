public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double BodyMassIndex1 = service.calculate(85_5, 1_64);
        System.out.println(BodyMassIndex1);

        double BodyMassIndex2 = service.calculate(70_0, 1_75);
        System.out.println(BodyMassIndex2);

        double BodyMassIndex3 = service.calculate(45_5, 1_75);
        System.out.println(BodyMassIndex3);
    }
}
