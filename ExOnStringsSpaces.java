package java8;

public class ExOnStringsSpaces {
    public static void main(String[] args) {
              String s2 = "java is oops lang";
       char[] c2 = s2.toCharArray();    // j a v a  i s  o o p s  l a n g
                                       //  0                            14
       int count=0;
       for(int i=0;i<c2.length;i++){
            if(c2[i] == ' ') count++;
        }
      System.out.println("Spaces in between the String:- "+count);

    }
}
