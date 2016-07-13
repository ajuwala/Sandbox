package sandbox.executorservice;

/**
 * Created by Aditya Juvvala on 7/12/2016.
 */
public class ServiceA
{
    public String taskA()
    {
        System.out.println("Executing ServiceA");
        ServiceAA serviceAA = new ServiceAA();
        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Returning response for serviceA");
        return "ResponseA " + serviceAA.taskAA();
    }
}
