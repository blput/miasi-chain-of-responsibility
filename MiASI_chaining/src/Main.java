/**
 * Created by student on 05.05.2017.
 */
public class Main {

    public static void main(String [] args)
    {
        String input = "100+5";
        String str = input;
        str = str.replaceAll("[^-?0-9]+", " ");

        Parsing p = new Parsing();
        Add a = new Add();
        Subtraction s = new Subtraction();
        Division d = new Division();
        Multiplication m = new Multiplication();

        p.setNextOperation(a);
        a.setNextOperation(s);
        s.setNextOperation(d);
        d.setNextOperation(m);

        p.operation(input);
    }
}
