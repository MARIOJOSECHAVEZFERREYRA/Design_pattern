package Strategy;

public class SimpleAntivirus extends SimpleTest{
    @Override
    void start() {
        System.out.println("Simple Antivirus - Simple scan started");
    }

    @Override
    void skipZip() {
        try {
            System.out.println("Analyzing...");
            Thread.sleep(2500);
            System.out.println("Could not analyze files with extension '.zip'");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Simple Antivirus - Simple scan completed");
    }
}
