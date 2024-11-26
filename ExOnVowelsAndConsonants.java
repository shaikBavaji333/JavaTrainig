import java.util.ArrayList;
import java.util.List;

public class ExOnVowelsAndConsonants {

    public static void main(String[] args) {
        String s="BAVaji";
        char[] c = s.toLowerCase().toCharArray();     //c = b a v a j i
                                                    //      0 1 2 3 4 5
        int vowels=0;
        int consonants=0;

        //Using for loop
        for(int i=0;i<c.length;i++){
            if(c[i] =='a' || c[i] == 'e' || c[i] =='i' ||c[i] =='o' || c[i] == 'u') vowels++;
            else consonants++;
        }

        //Using For each loop
        for(char a : c){
            if(a =='a' || a == 'e' || a =='i' ||a =='o' || a == 'u') vowels++;
            else consonants++;
        }

                for(int i=0;i<c.length;i++){
            if(c[i] =='a' || c[i] == 'e' || c[i] =='i' ||c[i] =='o' || c[i] == 'u') System.out.println("Vowels:- "+c[i]+" ");
            else System.out.println("Consonants:- "+c[i]);
            System.out.println();
        }

        System.out.println("Vowels:- "+vowels);
        System.out.println("Consonants:- "+consonants);

        //ASKEY Values
        // 0 - 48, A - 65, a - 97
        // 9 - 57, Z - 91, z - 123



        }

    }

