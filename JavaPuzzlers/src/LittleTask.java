public class LittleTask implements Runnable {

  private static int start;
  private static int end;

  public LittleTask(int startIndex, int endIndex) {
    start = startIndex;
    end = endIndex;
  }

  @Override
  public void run() {
    while (true) {
      if (start < end) {
        System.out.println(start);
        ++start;
      } else {
        Index nextIndex = Manage.getInstance().getIndex();
        start = nextIndex.start;
        end = nextIndex.end;
      }
    }
  }

}
