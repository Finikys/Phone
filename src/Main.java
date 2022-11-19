public class Main {
    public static void main(String[] args) {

        int score = 100;// Объявляете переменные для входных данных и
        int pay = 1200;// параметров программы: начального счёта,
        int bonus = 100;// суммы пополнения и тп

        if (pay >= 1000){
            int total = pay / bonus + pay + score;
            System.out.print("На вашем счету " + total);
        } else {
            int total = score + pay;
            System.out.print("На вашем счету " + total);
        }

    }
}