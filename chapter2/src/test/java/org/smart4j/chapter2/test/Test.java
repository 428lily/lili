/**
 * Created by yanliji on 2018/3/29.
 */
import org.smart4j.chapter2.util.PropsUtil;

import java.util.Properties;

/**
 * Created by yanliji on 2018/3/29.
 */
public class Test {
    @org.junit.Test
    public void test1() {
        Properties props = PropsUtil.loadProps("config.properties");
        Boolean aaa = PropsUtil.getBoolean(props, "aaa");
        System.out.println(aaa);
    }
}
