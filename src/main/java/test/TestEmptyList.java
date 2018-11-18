package test;

import main.Application;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * This test case verify the result when the list parameter is empty
 *
 * @author Mouad Tahiri
 */
public class TestEmptyList {

    @Test
    public void should_return_the_null() {
        List<List<?>> result= Application.partition(new ArrayList<>(), 3);
        Assert.assertNull(result);
    }


}
