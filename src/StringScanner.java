import java.util.Scanner;

public class StringScanner {
    String stringInput (){
        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            System.out.print("Input your string: ");
            s = scanner.next();
            if(!s.isBlank()){
                return s;
            }
        }
        while(s.isEmpty());
        return null;
    }
}
