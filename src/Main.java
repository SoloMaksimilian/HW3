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

        byte efficiencyTwoMin = 16;
        int efficiencyOneMin = efficiencyTwoMin / 2;
        int oneTime = efficiencyOneMin * 20;
            System.out.println("За 20 минут машина произвела " + oneTime +" штук бутылок");
        int twoTime = efficiencyOneMin * 60 * 24;
            System.out.println("За сутки машина произвела " + twoTime +" штук бутылок");
        int threeTime = efficiencyOneMin * 60 * 24 * 3;
            System.out.println("За 3 дня машина произвела " + threeTime +" штук бутылок");
        int fourTime = efficiencyOneMin * 60 * 24 * 30;
            System.out.println("За 1 месяц машина произвела " + fourTime +" штук бутылок");

        byte allPot = 120;
        byte whiteOneClass = 2;
        byte brownOneClass = 4;
        int oneClassroom = (whiteOneClass) + (brownOneClass);
        int classrooms = allPot / oneClassroom;
        int whitePot = (allPot / oneClassroom) * whiteOneClass;
        int brownPot = (allPot / oneClassroom) * brownOneClass;
            System.out.println("В школе, где " + classrooms + " классов, нужно " + whitePot + " банок белой краски и " + brownPot + " банок коричневой краски");


    }
}