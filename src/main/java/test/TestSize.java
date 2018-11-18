package test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import main.Application;
import org.junit.Test;



/**
 * This test case check the size of each sub-list wich should be lower then the second parameter 
 * that we pass to the function partition
 *
 * @author Mouad Tahiri
 */

public class TestSize {    
    @Test
    public void get_sublist_size_lower_then_the_second_parametre() {

        List<List<?>> result = Application.partition(Application.list, 3);
        for(List<?> l:result){
            assertTrue("the sub-lists size is lower then 3",l.size()<=3 );
        }        
    }
}
