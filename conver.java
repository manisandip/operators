public class conver{
    public static void main(String[] args) {
        String str ="This is very easy programme ";
        int len =str .length();
        String spchar  = "This $300 is equivalent of £200 but not for @100";
        spchar = spchar.replace("$" ,"");
        spchar = spchar.replace("£" , "");
        spchar = spchar.replace( "@", "");
        String v = "The cost of iphone is £1,250 ";
        String v1  = v.replaceAll("[0-9]","");
        int a = 450 ;
        double a1 = a ;
        String b = "125";
        int i=Integer.parseInt(b );
        double d = 123.45;
        String s=Double.toString(d);
         float c = 1/3 ;
        String k = "560.25";
        double t =Double.parseDouble("560.25");
        String price = "$250.00 ";
        String word1  = "There ";
        word1 = word1.substring(2 ,3);
        String word2 = "England";
        word2 = word2.substring(3 ,4 );
        String word3 = "orange";
        word3 = word3.substring(2 ,4);
        System.out.println(str.replaceAll("s" , " "));//removing letter 's' from the sentence
        System.out.println("String Length is : " + len );//finding the length of the sentence
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));//removing spaces from the string
        System.out.println(spchar);//removing all special characters
        System.out.println( v1 ); //extracting just numbers
        System.out.println( a1 );//converting integer to double
        System.out.println( i );//converting string to integer
        System.out.println( s );//converting double to string
        System.out.println( t );// converting string to double
        System.out.println(c ); //1/3 to decimals
        System.out.println(price.replaceAll("\\$", "£"));//replacing dollar sign to pounds
        System.out.println(word1); //middle letter e from word There
        System.out.println(word2);//letter l from word england
        System.out.println(word3);// letters 'an' from word orange  
    }



}
