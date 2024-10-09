public class Ifelse {
    public static void main(String[] args){

        int tel=95;
        int hin=95;
        int eng=95;
        int mat=95;
        int sci=75;
        int soc=99;

        double marks=(double) (tel+hin+eng+mat+sci+soc);

        System.out.println(marks);

        if(marks > 550 ){
            System.out.println("this marks is greater than Distinction");
        }else if(marks >450 && marks <550){
            System.out.println("this marks is greater than First class");
            }else if(marks >350 && marks <450){
            System.out.println("this marks is greater than second class");
            }else if(marks <350){
            System.out.println("this marks is less than fail");
        }
    }
}
