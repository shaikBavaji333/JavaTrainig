public class ExonDWhile {
    public static void main(String[] args) {

        int i=1,sum=0;
        do {
            sum=sum+i;
            System.out.println("Inside sum :"+sum);
            i++;
        }while(i<5);

        System.out.println("out side sum :"+sum);
    }
}
