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
public class PlateauAcceptanceTest {

    @Test
    public void acceptanceTest(){
        MRKApi mrkApi = new MRKApi(new Plateau());

        mrkApi.applyCommand("5 5");
        mrkApi.applyCommand("1 2 N");
        mrkApi.applyCommand("LMLMLMLMM");
        mrkApi.applyCommand("3 3 E");
        mrkApi.applyCommand("MMRMMRMRRM");
        List<String> output = mrkApi.getOutput();

        assertThat(output.get(0),is("1 3 N"));
        assertThat(output.get(1),is("5 1 E"));
    }
}
