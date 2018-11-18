package test;

import main.Application;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

/**
 * this test case try to check if the result contain all the elements in origin list, for that we use the hamcrest Library
 *
 * @author Mouad Tahiri
 */
public class TestsublistElement {

    @Test
    public void should_return_tree_sublist() {

        List<List<?>> result = Application.partition(Application.list, 3);
        List<?> expected = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7));
        Assert.assertThat(result,is(expected));
    }
}
