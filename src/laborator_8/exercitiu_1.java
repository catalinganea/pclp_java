package laborator_8;

public class exercitiu_1 {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException var4) {
            System.out.println("Nu se poate imparti la 0!!!");
            System.out.println("Eroare: " + var4);
        }

    }
}
