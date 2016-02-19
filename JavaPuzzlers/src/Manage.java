import java.lang.Math;

public class Manage {

  private static int base = 0;
  private static int skip = 5000;

  private static int trimmingRange = 56;
  private static long trimming;

  private static Object lock = new Object();

  private static Manage manager;

  private Manage() {

  }

  public static Manage getInstance() {
    if (manager == null) {
      synchronized (lock) {
        if (manager == null) {
          manager = new Manage();
        }
      }
    }
    return manager;
  }

  public synchronized Index getIndex() {
    Index item = new Index();
    item.start = base;
    trimming = System.currentTimeMillis() << trimmingRange;
    int trim = Math.toIntExact(trimming);
    item.end = base + skip + trim;
    base = skip + trim;
    return item;
  }

  public static void main(String[] args) throws InterruptedException {

    for (int i = 0; i < 10; i++) {
      Index item = Manage.getInstance().getIndex();
      new Thread(new LittleTask(item.start, item.end)).start();
    }
    long wait = 1 * 60 * 1000L;
    Thread.sleep(wait);

    for (int i = 0; i < 10; i++) {
      Index item = Manage.getInstance().getIndex();
      new Thread(new LittleTask(item.start, item.end)).start();
    }
  }
}
