/**
 * Created by student on 05.05.2017.
 */
public class Add implements IOperation{
    private IOperation obj;
    public void operation(String text) {
        System.out.println("Add");
        String operator = Helper.getOperand(text);
        if(operator.equals("+"))
        {
            String firstValue = Helper.getValues(text)[0];
            String secondValue = Helper.getValues(text)[1];
            System.out.println("Result is " + (Integer.parseInt(firstValue) + Integer.parseInt(secondValue)));
        }
        else
        {
            if(obj != null) {
                obj.operation(text);
            }
            else
            {
                System.out.println("Nie obsluzono");
            }
        }
    }

    public void setNextOperation(IOperation obj)
    {
        this.obj = obj;
    }
}
