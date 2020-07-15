public class BmiService {
    public double calculate (float weight, float height) {
        double height2 = Math.pow(height, 2);
        double BodyMassIndex = weight / height2 * 1000;

        return BodyMassIndex;
    }
}
