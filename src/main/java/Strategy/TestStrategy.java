package Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Context context = new Context(new SimpleAntivirus());
        context.execute();
    }
}
