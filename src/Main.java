public class Main {
    public static void main(String[] args) {
        byte a = -28;
        short b = 31000;
        int c = -456789;
        long d = 1234567890L;
        float e = 123.456f;
        double f = 98.76543201;
            System.out.println("Значение переменной a с типом byte равно " + a);
            System.out.println("Значение переменной b с типом short равно " + b);
            System.out.println("Значение переменной c с типом int равно " + c);
            System.out.println("Значение переменной d с типом long равно " + d);
            System.out.println("Значение переменной e с типом float равно " + e);
            System.out.println("Значение переменной f с типом double равно " + f);

        float g1 = 27.12f;
        long g2 = 987678965549L;
        float g3 = 2.786f;
        short g4 = 569;
        short g5 = -159;
        char g6 = 27897;
        byte g7 = 67;

        char LudmilaPavlovna = 23;
        char AnnaSergeevna = 27;
        char EkaterinaAndreevna = 30;
        char allPages = 480;
        int oneStudent = allPages / (LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + oneStudent +" листов бумаги");

    }
}