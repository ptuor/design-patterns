package second;

public class RealPicture implements Picture {
    private String fileName;
    private volatile boolean loading = true;

    protected RealPicture(String fileName) {
        this.fileName = fileName;
        loadFromServer(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromServer(String fileName) {
        download();
    }

    // primitively simulated download
    private void download() {
        loading = true;

        System.out.println("Loading " + fileName);

        // Simulates download
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
                loading = false;
                System.out.println(" loading complete");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        while (loading) {
            try {
                System.out.print(".");
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

