package GenricsPrograms.Genrics;

public class StringMax {

    String calculateMaximum(String[] ArrayOfStrings) {
        String max = ArrayOfStrings[0];
        if (ArrayOfStrings[1].length() > max.length()) {
            max = ArrayOfStrings[1];
        }
        if (ArrayOfStrings[2].length() > max.length()) {
            max = ArrayOfStrings[2];
        }
        return max;
    }

    void checkMaxAt2ndPos(String val, String max) {
        if (val.equals(max)) {
            System.out.println("Max String is at Position 2! " + max);
        } else {
            System.out.println("Max String is not present at Position 2! " + max);
        }
    }
}


