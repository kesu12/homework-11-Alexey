public class StringSort {
    void sort(String s1, String s2, String s3){
        SizeComparison comparison = new SizeComparison();
        String shortest = comparison.getShortest(s1, s2, s3);
        String longest = comparison.getLongest(s1, s2, s3);
        String middle = s1;
        if(middle.equals(shortest)){
            middle = s2;
        }

        if(middle.equals(longest)){
            middle = s3;
        }
        System.out.println("Sorted string list: "  + shortest + '\n' + middle + '\n' + longest);
    }
}
