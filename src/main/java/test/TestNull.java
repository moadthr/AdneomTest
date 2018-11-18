package test;

import main.Application;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

/**
 * This test case verify the result when the input list is null
 * the partition function should return null
 * @author Mouad Tahiri
 */

public class TestNull {
    @Test
    public void should_return_null() {
        List<List<?>> result= Application.partition(null, 3);
        Assert.assertNull(result);
    }

}

