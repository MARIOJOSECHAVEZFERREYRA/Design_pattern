package Strategy;

public abstract class SimpleTest implements IStrategy{
    @Override
    public void Analize(){
        start();
        skipZip();
        stop();
    }
    abstract void start();
    abstract void skipZip();
    abstract void stop();
}
