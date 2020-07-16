public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double BodyMassIndex1 = service.calculate(85.5, 1.64);
        System.out.println(BodyMassIndex1);
        System.out.printf("Индекс массы тела = %.1f \n", BodyMassIndex1);
        System.out.println("");

        double BodyMassIndex2 = service.calculate(70.0, 1.75);
        System.out.println(BodyMassIndex2);
        System.out.printf("Индекс массы тела = %.1f \n", BodyMassIndex2);
        System.out.println("");

        double BodyMassIndex3 = service.calculate(45.5, 1.75);
        System.out.println(BodyMassIndex3);
        System.out.printf("Индекс массы тела = %.1f \n", BodyMassIndex3);
        System.out.println("");
    }
}
