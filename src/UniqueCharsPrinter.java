public class UniqueCharsPrinter {
    void print(String s1, String s2, String s3){
        UniqueChars asd = new UniqueChars();
        if (asd.hasAllUniqueChars(s1)){
            System.out.println("This string is the first one which has unique chars: " + s1);
        } else if (asd.hasAllUniqueChars(s2)) {
            System.out.println("This string is the first one which has unique chars: " + s2);
        } else if (asd.hasAllUniqueChars(s3)) {
            System.out.println("This string is the first one which has unique chars: " + s3);
        }
        else{
            System.out.println("These strings have no unique chars.");
        }
    }
}
