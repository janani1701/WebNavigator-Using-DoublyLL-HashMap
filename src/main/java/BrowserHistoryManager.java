import java.util.HashMap;

public class BrowserHistoryManager {
    private DoublyLinkedList historyList;
    private HashMap<String, ListNode> urlToNodeMap;
    private ListNode current;

    public BrowserHistoryManager() {
        historyList = new DoublyLinkedList();
        urlToNodeMap = new HashMap<>();
        current = null;
    }

    public void visitPage(String url) {
        if (urlToNodeMap.containsKey(url)) {
            // Page already exists in history, move it to the end (most recent)
            ListNode pageNode = urlToNodeMap.get(url);
            if (pageNode != historyList.tail) {
                if (pageNode.prev != null) {
                    pageNode.prev.next = pageNode.next;
                }
                if (pageNode.next != null) {
                    pageNode.next.prev = pageNode.prev;
                }
                pageNode.prev = historyList.tail;
                pageNode.next = null;
                historyList.tail.next = pageNode;
                historyList.tail = pageNode;
            }
        } else {
            // Page is new, add it to history
            historyList.addPage(url);
            urlToNodeMap.put(url, historyList.tail);
        }
        // Set the current page to the newly visited page
        current = historyList.tail;
    }

    public void searchHistory(String searchTerm) {
        if (current == null) {
            System.out.println("No history available.");
            return;
        }

        ListNode searchNode = current;
        while (searchNode != null) {
            if (searchNode.url.contains(searchTerm)) {
                System.out.println("Matching URL: " + searchNode.url);
            }
            searchNode = searchNode.prev;
        }
    }
    public void printHistory() {
        if (current == null) {
            System.out.println("No history available.");
        } else {
            System.out.println("Browsing History:");
            ListNode historyNode = current;
            while (historyNode != null) {
                System.out.println(historyNode.url);
                historyNode = historyNode.prev;
            }
        }
    }
    public void printCurrentHistory() {
        if (current == null) {
            System.out.println("No history available.");
        } else {
            System.out.println("Current History:");
            System.out.println(current.url);
        }
    }

    public ListNode getCurrent() {
        return current;
    }
    public void goBack(int steps) {
        for (int i = 0; i < steps; i++) {
            if (current != null && current.prev != null) {
                current = current.prev;
            } else {
                System.out.println("No previous website available.");
                break;
            }
        }
        if (current != null) {
            System.out.println("Current Website: " + current.url);
        }
    }

    public void goForward(int steps) {
        for (int i = 0; i < steps; i++) {
            if (current != null && current.next != null) {
                current = current.next;
            } else {
                System.out.println("No next website available.");
                break;
            }
        }
        if (current != null) {
            System.out.println("Current Website: " + current.url);
        }
    }




}

