public class BmiService {
    public float calculate(float weight, float height) {
        float a = 2;
        float bmi = weight * 10_000/ ((float) Math.pow (height, a));
        return bmi;
    }
}