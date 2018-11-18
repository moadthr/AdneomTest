package test;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Type;
import java.util.List;

import main.Application;
import org.junit.Test;



/**
 * This test case try to check if the last element is included in the result list
 *
 * @author Mouad Tahiri
 */
public class TestLastElement {

    @Test
    public void should_have_last_element() {
        List<List<?>> result= Application.partition(Application.list, 3);
        List<Type> element = (List<Type>) result.get(result.size()-1);
        assertEquals(element.get(element.size()-1),Application.list.get(Application.list.size()-1));
    }

}
