public class BmiService {
    public float calculate(float weight, float height) {
        float bmi = weight * 10_000/ (height * height);
        return bmi;
    }
}