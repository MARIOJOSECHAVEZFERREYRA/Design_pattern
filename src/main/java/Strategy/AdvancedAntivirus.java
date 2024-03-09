package Strategy;

public class AdvancedAntivirus extends AdvancedTest {

    @Override
    void start() {
        System.out.println("Advanced Antivirus - Advanced scan started");
    }

    @Override
    void scanMemory() {
        try {
            System.out.println("Analyzing RAM Memory...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void scanKeyloggers() {
        try {
            System.out.println("Analyzing in Search of Keyloggers...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void scanRootKits() {
        try {
            System.out.println("Analyzing in Search of RootKits...");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void unzipZip() {
        try {
            System.out.println("Analyzing zip files...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Advanced Antivirus - Advanced scan completed");
    }
}
