package sandbox.executorservice;

import java.util.Set;

/**
 * Created by Aditya Juvvala on 7/12/2016.
 */
public class ServiceC
{
    public void taskC(Set<String> responses)
    {
        System.out.println("Executing ServiceC");
        responses.forEach(r -> System.out.println(r));
    }
}
