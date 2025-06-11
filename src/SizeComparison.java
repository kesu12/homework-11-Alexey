public class SizeComparison {
    private String longest;
    private String shortest;
    String getLongest(String s1, String s2, String s3){
      if (s1.length()>s2.length() && s1.length()>s3.length()){
          longest = s1;
      }
      else if(s2.length()>s3.length()){
          longest = s2;
      }
      else{
          longest = s3;
      }
      return longest;
        }
    String getShortest (String s1, String s2, String s3){
        if (s1.length()<s2.length() && s1.length()<s3.length()){
            shortest = s1;
        }
        else if(s2.length()<s3.length()){
            shortest = s2;
        }
        else{
            shortest = s3;
        }
        return shortest;
    }
    }

