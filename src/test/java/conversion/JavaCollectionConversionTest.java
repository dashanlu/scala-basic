package conversion;

import javaconverter.JavaConverter;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class JavaCollectionConversionTest {
    @Test
    public void testScalaCollectionToJava(){
        final Collection<Object> emptyList = JavaConverter.getJavaList(-1);
        final Collection<Object> singleList = JavaConverter.getJavaList(0);
        final Collection<Object> multipleList1 = JavaConverter.getJavaList(1);
        final Collection<Object> multipleList2 = JavaConverter.getJavaList(2);
        final Collection<Object> multipleList3 = JavaConverter.getJavaList(10);

        assertEquals(0, emptyList.size());
        assertEquals(0, singleList.size());
        assertEquals(1, multipleList1.size());
        assertEquals(2, multipleList2.size());
        assertEquals(10, multipleList3.size());
    }
}
