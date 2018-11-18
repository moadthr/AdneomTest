package test;

import main.Application;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
/**
 * This test case verify the result when the size parameter is zero
 * The partition function should return null
 *
 * @author Mouad Tahiri
 */

public class TestZeroAsSize {
    @Test
    public void should_return_null() {
        List<List<?>> result= Application.partition(Application.list, 0);
        Assert.assertNull(result);
    }

}
