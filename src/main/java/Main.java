import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BrowserHistoryManager historyManager = new BrowserHistoryManager();
        HistoryNavigator navigator = new HistoryNavigator();
        HistorySearcher searcher = new HistorySearcher();
        Scanner scanner = new Scanner(System.in);
        boolean continueBrowsing = true;

        while (continueBrowsing) {
            System.out.println("Options:");
            System.out.println("1. Add website");
            System.out.println("2. Browse history");
            System.out.println("3. Current history");
            System.out.println("4. Go back one step");
            System.out.println("5. Go forward one step");
            System.out.println("6. Go back n steps");
            System.out.println("7. Go forward n steps");
            System.out.println("8. Search for a keyword");
            System.out.println("9. Quit");


            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter the website URL:");
                    String website = scanner.nextLine();
                    historyManager.visitPage(website);
                    break;
                case 2:
                    historyManager.printHistory();
                    break;
                case 3:
                    historyManager.printCurrentHistory();
                    break;
                case 4:
                    navigator.goBack(historyManager);
                    break;
                case 5:
                    navigator.goForward(historyManager);
                    break;
                case 6:
                    System.out.print("Enter the number of steps to go back: ");
                    int stepsBack = scanner.nextInt();
                    navigator.goBack(historyManager, stepsBack);
                    break;
                case 7:
                    System.out.print("Enter the number of steps to go forward: ");
                    int stepsForward = scanner.nextInt();
                    navigator.goForward(historyManager, stepsForward);
                    break;
                case 8:
                    System.out.print("Enter the search term: ");
                    String searchTerm = scanner.nextLine();
                    searcher.searchHistory(historyManager, searchTerm);
                    break;
                case 9:
                    continueBrowsing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
