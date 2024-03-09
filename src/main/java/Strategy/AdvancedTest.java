package Strategy;

public abstract class AdvancedTest implements IStrategy{
    @Override
    public void Analize() {
        start();
        scanMemory();
        scanKeyloggers();
        scanRootKits();
        unzipZip();
        stop();
    }
    abstract void start();
    abstract void scanMemory();

    abstract void scanKeyloggers();

    abstract void scanRootKits();

    abstract void unzipZip();
    abstract void stop();


}
