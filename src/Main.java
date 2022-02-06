public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(74, 172);
        String result = String.format("%.2f", bmi);
        System.out.println("Индекс массы тела составляет: " + result + " кг/м2");
    }
}