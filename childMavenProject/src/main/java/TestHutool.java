import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

public class TestHutool {
    public static void main(String[] args) {
        String dateStr = "2012-12-12 12:12:12";
        DateTime date = DateUtil.parse(dateStr);
        System.out.println("hello word");
    }

}
