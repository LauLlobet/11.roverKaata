package marsrover;

import marsrover.MarsRover;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/*
Test Input:
5 5

1 2 N

LMLMLMLMM

3 3 E

MMRMMRMRRM

Expected Output:
1 3 N

5 1 E

 */
public class MarsRoverAcceptanceTest {

    @Test
    public void firstRover(){
        MarsRover rover = new MarsRover();
        String output = rover.getOutput();
        assertThat(output,is("1 3 N"));
    }
}
