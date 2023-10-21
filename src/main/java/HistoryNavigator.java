public class HistoryNavigator {
    public void goBack(BrowserHistoryManager manager) {
        manager.goBack(1);
    }

    public void goForward(BrowserHistoryManager manager) {
        manager.goForward(1);
    }

    public void goBack(BrowserHistoryManager manager, int steps) {
        for (int i = 0; i < steps; i++) {
            manager.goBack(steps);
        }
    }

    public void goForward(BrowserHistoryManager manager, int steps) {
        for (int i = 0; i < steps; i++) {
            manager.goForward(steps);
        }
    }
}
