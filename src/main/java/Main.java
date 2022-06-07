import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int a = 200;
        int b = 300;
        int i = service.calculate(a, b);
        System.out.println(i);

    }
}
