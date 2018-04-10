package marsrover;

import org.junit.Test;

import java.util.List;

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
    public void acceptanceTest(){
        MarsRover rover = new MarsRover();

        rover.applyCommand("5 5");
        rover.applyCommand("1 2 N");
        rover.applyCommand("LMLMLMLMM");
        rover.applyCommand("3 3 E");
        rover.applyCommand("MMRMMRMRRM");
        List<String> output = rover.getOutput();

        assertThat(output.get(0),is("1 3 N"));
        assertThat(output.get(1),is("5 1 E"));
    }
}
