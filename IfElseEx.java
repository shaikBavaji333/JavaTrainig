public class IfElseEx {
    public static void main(String[] args) {

        int tel = 59;
        int hin = 59;
        int eng = 59;
        int mat = 59;
        int sci = 45;
        int soc = 55;

        int Marks = (tel + hin + eng + mat + sci + soc);
            System.out.println(Marks);

            if(Marks > 500){
                System.out.println("this marks is frist class ");
            }else if (Marks > 400 && Marks < 500) {
                System.out.println("this marks is second class ");
            }else if(Marks > 300 &&  Marks < 400) {
                System.out.println("this marks is third class ");
            }else if(Marks <300){
                System.out.println("this Marks is fail");
            }
    }
}
