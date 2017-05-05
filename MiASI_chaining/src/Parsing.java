import java.util.Arrays;

/**
 * Created by student on 05.05.2017.
 */
public class Parsing implements IOperation {
    private String firstOperand;
    private String operator;
    private String secondOperand;

    private IOperation obj;
    public void operation(String text)
    {
        System.out.println("Writing values");
        String str = text;
        str = str.replaceAll("[^-?0-9]+", " ");
        firstOperand = Helper.getValues(text)[0];
        operator = Helper.getOperand(text);
        secondOperand = Helper.getValues(text)[1];

        if(firstOperand != null && firstOperand.length() > 0 && secondOperand != null && secondOperand.length() > 0)
        {
            this.obj.operation(text);
        }
        //todo:exception

    }

    public void setNextOperation(IOperation obj)
    {
        this.obj = obj;
    }
}
