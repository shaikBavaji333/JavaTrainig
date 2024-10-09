public class PIfstatements {
    public static void main(String[] args){

        int tel=45;
        int hin=55;
        int eng=6;
        int mat=5;
        int sci=5;
        int soc=35;

        double percentage= (double) (tel+hin+eng+mat+sci+soc)*(100)/600;

        System.out.println(percentage);
        if(percentage >75){
            System.out.println("this percentage is greater than Distinction");
        }else if(percentage>55 && percentage<75){
            System.out.println("this percentage is greater than First class");
        }else if(percentage>35 && percentage<55){
            System.out.println("this percentage is greater than Second class");
        }else if(percentage<35){
            System.out.println("this percentage is less than Fail");
        }
    }

}
