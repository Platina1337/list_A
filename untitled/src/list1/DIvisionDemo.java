package list1;

public class DIvisionDemo {
    public static void main(String[] args) {
        int iresult, iremain;
        double dresult, dremain;
        iresult = 10 / 3;
        iremain = 10 % 3;
        System.out.println("частное от деления 10/3 =");
        System.out.println(iresult + ", остаток =" + iremain);
        dresult = 10.0 / 3.0;
        dremain = 10.0 % 3.0;
        System.out.println("частное от деления 10.0 / 3.0 =");
        System.out.println(dresult + ", остаток равен " + dremain);

    }
}
