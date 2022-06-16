package come.heaven.template;

/**
 * 模板方法模式
 * @author zhanggq
 * @date 2022/6/16 13:46
 */
public class Main {

    public static void main(String[] args) {
        Cook cook = new CookFish();
        cook.cook();
    }
}
