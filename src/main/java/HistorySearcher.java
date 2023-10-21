public class HistorySearcher {
    public void searchHistory(BrowserHistoryManager manager, String searchTerm) {
        if (manager.getCurrent() == null) {
            System.out.println("No history available.");
        } else {
            System.out.println("Matching URLs for search term '" + searchTerm + "':");
            ListNode historyNode = manager.getCurrent();
            while (historyNode != null) {
                if (historyNode.url.contains(searchTerm)) {
                    System.out.println(historyNode.url);
                }
                historyNode = historyNode.prev;
            }
        }
    }
}
