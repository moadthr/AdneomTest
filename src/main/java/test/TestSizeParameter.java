package test;

import main.Application;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


/**
 * This test case verify the result when the sublist size is bigger then the origin list size
 *
 * @author Mouad Tahiri
 */

public class TestSizeParameter {

    @Test
    public void should_return_the_same_list_in_the_input() {
        List<List<?>> result= Application.partition(Application.list, 9);
        Assert.assertEquals(result.get(0),Application.list);
    }


}
