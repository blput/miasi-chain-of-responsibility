import java.util.Arrays;

/**
 * Created by student on 05.05.2017.
 */
public class Helper {
    public static String[] getValues(String text)
    {
        String str = text;
        str = str.replaceAll("[^?0-9]+", " ");
        return (str.trim().split(" "));
    }

    public static String getOperand(String text)
    {
        String str = text;
        str = str.replaceAll("[?0-9]+", " ");
        return Arrays.asList(str.trim().split(" ")).get(0);
    }
}
