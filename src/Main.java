public class Main {
    public static void main(String[] args) {
        StringScanner scanner = new StringScanner();

        String s1 = scanner.stringInput();
        String s2 = scanner.stringInput();
        String s3 = scanner.stringInput();

        SizeComparison comparison = new SizeComparison();
        String longest = comparison.getLongest(s1,s2,s3);
        String shortest = comparison.getShortest(s1,s2,s3);

        System.out.println("Longest string is: " + longest + ". It's size is: " + longest.length() + " symbols.");
        System.out.println("Shortest string is: " + shortest + ". It's size is: " + shortest.length() + " symbols." );

        StringSort sort = new StringSort();
        sort.sort(s1,s2,s3);

        AvgStringPrinter printer = new AvgStringPrinter();
        printer.print(s1,s2,s3);

        UniqueCharsPrinter printer2 = new UniqueCharsPrinter();
        printer2.print(s1,s2,s3);

        DoubleChar doubleChar = new DoubleChar();
        String doubled = doubleChar.multiply(s1);
        System.out.println("Doubled string: "+doubled);
    }
}