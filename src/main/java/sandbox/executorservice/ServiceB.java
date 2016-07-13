package sandbox.executorservice;

/**
 * Created by Aditya Juvvala on 7/12/2016.
 */
public class ServiceB
{
    public String taskB()
    {
        System.out.println("Executing ServiceB");
        try
        {
            Thread.sleep(10000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Returning response for serviceB");
        return "ResponseB";
    }
}
