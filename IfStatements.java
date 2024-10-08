public class IfStatements {
    public static void main(String[] args) {

        int tel = 94;
        int hin = 90;
        int eng = 70;
        int mat = 50;
        int sci = 55;
        int soc = 100;

        double percentage = (double) (tel + hin + eng + mat + sci + soc) * (100) / 600;
        System.out.println(percentage);
            if (percentage > 75) {
                System.out.println("This percentage is greater than is DISTENTION");
            } else if (percentage > 55 && percentage < 75) {
                System.out.println("This percentage is less than is FIRST CLASS");
            } else if (percentage > 35 && percentage < 55) {
                System.out.println("This percentage is less than is SECOND CLASS");
            } else if (percentage < 35) {
                System.out.println("This percentage is less than is FAIL");
            }
        }
    }

