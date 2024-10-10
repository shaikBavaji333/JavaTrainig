public class PWhile {
    public static void main(String[] args){

        int i=1,sum=0;
        while(i<5){
            sum = sum + i;
            System.out.println("The total sum inside while loop:"+sum);
            i++;
        }
        System.out.println("The total outside while loop:sum"+sum);
    }
}
