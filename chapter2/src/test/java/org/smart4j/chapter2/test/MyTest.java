import org.junit.Test;
import org.smart4j.chapter2.util.CastUtil;

/**
 * Created by yanliji on 2018/3/30.
 */
public class MyTest {
    @Test
    public void test1(){
        Double aDouble = CastUtil.castDouble(88, 0);
        System.out.println(aDouble);
    }
}
