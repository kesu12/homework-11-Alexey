public class DoubleChar {
    String multiply(String s1){
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i<s1.length(); i++){
            char currentChar = s1.charAt(i);
            s2.append(currentChar).append(currentChar);
        }
        return s2.toString();
    }
}
