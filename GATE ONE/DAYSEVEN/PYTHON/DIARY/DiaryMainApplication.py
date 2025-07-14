from Diaries import Diaries

class DiaryMainApplication:
    def __init__(self):
        self.diaries = Diaries()

    @staticmethod
    def display_menu():
        return """\
1. Add Diary.
2. Unlock Diary.
3. Delete Diary.
4. Create Entry
5. Find Entry By ID.
6. Update Entry.
7. Delete Entry.
8. Exit."""

    def run(self):
        while True:
            print(self.display_menu())
            option = input("Select an option: ")

            try:
                option = int(option)
                if option == 1:
                    self.addDiary()
                elif option == 2:
                    self.unlockDiary()
                elif option == 3:
                    self.deleteDiary()
                elif option == 4:
                    self.createEntry()
                elif option == 5:
                    self.findEntry()
                elif option == 6:
                    self.updateEntry()
                elif option == 7:
                    self.deleteEntry()
                elif option == 8:
                    print("Exiting...")
                    break
                else:
                    print("Invalid option")
            except ValueError as e:
                print(f"Error: {e}")

    def addDiary(self):
        username = input("Enter username: ")
        password = input("Enter password: ")
        self.diaries.add(username, password)
        print(f"Diary created for {username}")

    def unlockDiary(self):
        username = input("Enter username: ")
        diary = self.diaries.findByUsername(username)
        if not diary:
            print("Diary not found")
            return
        password = input("Enter password: ")
        diary.unlockDiary(password)

    def deleteDiary(self):
        username = input("Enter username: ")
        password = input("Enter password: ")
        self.diaries.delete(username, password)
        print("Diary deleted")

    def createEntry(self):
        username = input("Enter username: ")
        diary = self.diaries.findByUsername(username)
        if not diary or diary.isLocked():
            print("Diary not found or locked")
            return
        title = input("Enter entry title: ")
        body = input("Enter entry body: ")
        diary.createEntry(title, body)

    def findEntry(self):
        username = input("Enter username: ")
        diary = self.diaries.findByUsername(username)
        if not diary or diary.isLocked():
            print("Diary not found or locked")
            return
        entry_id = int(input("Enter entry ID: "))
        entry = diary.findEntryById(entry_id)
        print(f"Entry found: {entry.getTitle()} {entry.getBody()}")

    def updateEntry(self):
        username = input("Enter username: ")
        diary = self.diaries.findByUsername(username)
        if not diary or diary.isLocked():
            print("Diary not found or locked")
            return
        entry_id = int(input("Enter entry ID: "))
        title = input("Enter new title: ")
        body = input("Enter new body: ")
        diary.updateEntry(entry_id, title, body)

    def deleteEntry(self):
        username = input("Enter username: ")
        diary = self.diaries.findByUsername(username)
        if not diary or diary.isLocked():
            print("Diary not found or locked")
            return
        entry_id = int(input("Enter entry ID: "))
        diary.deleteEntry(entry_id)

if __name__ == "__main__":
    app = DiaryMainApplication()
    app.run()