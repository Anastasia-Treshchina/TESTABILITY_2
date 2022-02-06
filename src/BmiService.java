public class BmiService {
    public float calculate(float weight, float height) {
        float bmi = weight * 10_000/ ((float) Math.pow (height, 2));
        return bmi;
    }
}