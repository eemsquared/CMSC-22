package mp5;

import junit.framework.TestCase;

/**
 * Created by mmcalvarez on 12/7/2016.
 */
public class Rule30SolverTest extends TestCase {

    Rule30Solver solve;
    private long startTime = System.currentTimeMillis();

    public void test1(){
        solve = new Rule30Solver(10);
        solve.runWorkers();
        System.out.println("Time consumed: " + (System.currentTimeMillis() - startTime));
    }

    public void test2(){
        solve = new Rule30Solver(20);
        solve.runWorkers();
        System.out.println("Time consumed: " + (System.currentTimeMillis() - startTime));
    }

    public void test3(){
        solve = new Rule30Solver(30);
        solve.runWorkers();
        System.out.println("Time consumed: " + (System.currentTimeMillis() - startTime));
    }
}