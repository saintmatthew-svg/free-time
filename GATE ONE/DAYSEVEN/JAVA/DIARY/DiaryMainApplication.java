import java.util.Scanner;

public class DiaryMainApplication {
    private static final Diaries diaries = new Diaries();
    private static final Scanner input = new Scanner(System.in);

    public static String displayMenu() {
        return """
                1. Add Diary.
                2. Unlock Diary.
                3. Delete Diary.
                4. Create Entry
                5. Find Entry By ID.
                6. Update Entry.
                7. Delete Entry.
                8. Exit.""";
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println(displayMenu());
            System.out.print("Select an option: ");
            int option = input.nextInt();
            input.nextLine();

            try {
                switch (option) {
                    case 1 -> addDiary();
                    case 2 -> unlockDiary();
                    case 3 -> deleteDiary();
                    case 4 -> createEntry();
                    case 5 -> findEntry();
                    case 6 -> updateEntry();
                    case 7 -> deleteEntry();
                    case 8 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid option");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void addDiary() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        diaries.add(username, password);
        System.out.println("Diary created for " + username);
    }

    private static void unlockDiary() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        Diary diary = diaries.findByUsername(username);
        if (diary == null) {
            System.out.println("Diary not found");
            return;
        }
        System.out.print("Enter password: ");
        String password = input.nextLine();
        diary.unlockDiary(password);
    }

    private static void deleteDiary() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();
        diaries.delete(username, password);
        System.out.println("Diary deleted");
    }

    private static void createEntry() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        Diary diary = diaries.findByUsername(username);
        if (diary == null || diary.isLocked()) {
            System.out.println("Diary not found or locked");
            return;
        }
        System.out.print("Enter entry title: ");
        String title = input.nextLine();
        System.out.print("Enter entry body: ");
        String body = input.nextLine();
        diary.createEntry(title, body);
    }

    private static void findEntry() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        Diary diary = diaries.findByUsername(username);
        if (diary == null || diary.isLocked()) {
            System.out.println("Diary not found or locked");
            return;
        }
        System.out.print("Enter entry ID: ");
        int id = input.nextInt();
        input.nextLine();
        DiaryEntry entry = diary.findEntryById(id);
        System.out.println("Entry found: " + entry.getTitle() + entry.getBody());
    }

    private static void updateEntry() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        Diary diary = diaries.findByUsername(username);
        if (diary == null || diary.isLocked()) {
            System.out.println("Diary not found or locked");
            return;
        }
        System.out.print("Enter entry ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter new title: ");
        String title = input.nextLine();
        System.out.print("Enter new body: ");
        String body = input.nextLine();
        diary.updateEntry(id, title, body);
    }

    private static void deleteEntry() {
        System.out.print("Enter username: ");
        String username = input.nextLine();
        Diary diary = diaries.findByUsername(username);
        if (diary == null || diary.isLocked()) {
            System.out.println("Diary not found or locked");
            return;
        }
        System.out.print("Enter entry ID: ");
        int id = input.nextInt();
        input.nextLine();
        diary.deleteEntry(id);
    }
}