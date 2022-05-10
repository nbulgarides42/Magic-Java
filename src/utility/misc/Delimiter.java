package utility.misc;

public class Delimiter {

    public static String parseHelper(String valueCore, String totalCode) {
        int indexA = 0;
        int indexB = 0;

        String valueIntroFormatted = "<" + valueCore + ">";
        String valueOutroFormatted = "<E" + valueCore  + ">";

        indexA = totalCode.indexOf(valueIntroFormatted) + valueIntroFormatted.length();
        indexB = totalCode.indexOf(valueOutroFormatted);

        String parsedValue = "";

        if (indexA != -1 && indexB != -1) {
           parsedValue = totalCode.substring(indexA,indexB);
        } else {
            parsedValue = "Delimiter error!";
        }

        return parsedValue;
    }
}
