/**
 * Jan 27, 2018
 *
 * @author Noah Tyler
 */
package satSolver;

public class Timer{

    private long startTime;
    private long endTime; //timer variables

    public void start() { // sets variable to current time
        startTime = System.currentTimeMillis();
    }

    public void stop() { // sets variable to current time
        endTime = System.currentTimeMillis();
    }

    public long getDuration() { //calculates total time in seconds and sets it to variable
        return (endTime - startTime) / 1000;
    }
}
