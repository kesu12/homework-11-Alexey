public class AvgStringPrinter {
    void print(String s1, String s2, String s3){
        double avg = (double)(s1.length()+s2.length()+s3.length())/3;
        if(s1.length()<avg){
            String str1 = String.format("String %s is less than average length of strings and it's length is %s.", s1, s1.length());
            System.out.println(str1);
        }
        if(s2.length()<avg) {
            String str2 = String.format("String %s is less than average length of strings and it's length is %s.", s2, s2.length());
            System.out.println(str2);
        }
        if (s3.length()<avg){
            String str3 = String.format("String %s is less than average length of strings and it's length is %s.", s3, s3.length());
            System.out.println(str3);
        }
    }
}
