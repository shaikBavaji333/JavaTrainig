package java8;

public class ExOnStrings1 {
    public static void main(String[] args) {

        String a1=new String("Bavaji");  // object created by using new key word,and two objects created one is in heap and another one is in String pool.
        String a2="Bavaji";                      //object created by using Literal. only one object is created in string pool.with same content another object created it will give reference to same content.
        String a3="Irfan";
        String a4="Irfan";

        int Length=a1.length();                     //length of means no of values.
        System.out.println("Length of ="+Length);

        String substr=a1.substring(0,3);             // sub string means extracts a part of string.
        System.out.println("SubString= "+substr);

        String a5=a1.concat(" Shaik");        //concatenation means combines two strings.
        System.out.println(a5);

        String upper=a1.toUpperCase();
        System.out.println(upper);         //to upper case all values.

        String trim=a1.trim();            // trim
        System.out.println(trim);

        char a=a1.charAt(0);      //character at specific index.
        System.out.println("Char at ="+a);

        String[] Name=a1.split("");     //split
        System.out.println(Name);

        System.out.println(a1==a2);  // equals to means compares two strings.
        System.out.println(a3==a4);  // equals to means compares two strings.

        StringBuffer buffer=new StringBuffer(a1);    //string buffer is mutable or modify.
        StringBuffer reverseBuffer=buffer.reverse();
        String reverseString=new String(reverseBuffer);

        System.out.println(buffer);

        StringBuilder builder=new StringBuilder("Bavaji");  //string builder is mutable or modify.
        builder.append("Shaik");
       // builder.reverse();

        System.out.println(builder);
    }
}
