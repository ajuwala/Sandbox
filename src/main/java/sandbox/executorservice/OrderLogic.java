package sandbox.executorservice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Aditya Juvvala on 7/12/2016.
 */
public class OrderLogic
{
    public void processOrder(Order order) throws Exception
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();
        ServiceC serviceC = new ServiceC();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return serviceA.taskA();
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return serviceB.taskB();
            }
        });

        List<Future<String>> futures = executorService.invokeAll(callables);

        Set<String> responses = new HashSet<>();
        for(Future<String> future : futures)
        {
            responses.add(future.get());
        }

        serviceC.taskC(responses);

        executorService.shutdown();

    }

    public static void main(String[] args)
    {
        Order order = new Order();
        OrderLogic orderLogic = new OrderLogic();
        try
        {
            orderLogic.processOrder(order);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
