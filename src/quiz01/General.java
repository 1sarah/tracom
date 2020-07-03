package quiz01;

public class General {

    public static void main (String[] args) {
      //boolean b = compareFloats(6.245, 6.252);
        Integer a = m1("1");

        if ( a == 0 && a != null) {
            System.out.println(a);
        }

    }

    public static Integer m1(String str) {
       if (Integer.parseInt(str) > 0) {
           return null;
       } else {
           return 100;
       }
    }

    public static boolean compareFloats (double a, double b) {
        // truncate to 2 decimal places
        a = Math.floor(a * 100) / 100;
        b = Math.floor(b * 100) / 100;

        return Double.compare(a, b) == 0;

    }


    /* Finds investment value.
     * principle - initial investment
     * rate - given as percentage. (assumes it's per annum)
     * time - in years
     */
    public static  double calculateInvestment (double principle, double rate, int time) {
        double interest = principle * (rate / 100) * time;
        return principle + interest;
    }

    public static int countVowels (String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }

    static boolean isVowel (char x) {
        return "aeiou".indexOf(x) >= 0;
    }
}
