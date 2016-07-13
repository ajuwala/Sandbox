package sandbox.executorservice;

/**
 * Created by Aditya Juvvala on 7/12/2016.
 */
public class ServiceAA
{
    public String taskAA()
    {
        System.out.println("Executing ServiceAA");
        try
        {
            Thread.sleep(4000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Returning response for serviceAA");
        return "AAResponse";
    }
}
