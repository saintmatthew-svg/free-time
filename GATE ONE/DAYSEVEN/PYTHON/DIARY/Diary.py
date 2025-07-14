from DiaryEntry import DiaryEntry


class Diary:
    def __init__(self, username, password):
        if not username or not username.strip() or not password or not password.strip():
            raise ValueError("Username and password cannot be empty")
        self.username = username
        self.password = password
        self.isLocked = True
        self.entries = []
        self.entryId = 1

    def unlockDiary(self, password):
        if password != self.password:
            raise ValueError("Diary unlock failed: try a correct password")
        self.isLocked = False
        print(f"Diary unlocked for user: {self.username}")

    def lockDiary(self):
        self.isLocked = True

    def isLocked(self):
        return self.isLocked

    def createEntry(self, title, body):
        if self.isLocked:
            raise ValueError("Diary is locked")
        if not title or not title.strip():
            raise ValueError("Title cannot be empty")
        entry = DiaryEntry(self.entryId, title, body)
        self.entries.append(entry)
        self.entryId += 1
        print(f"Entry created with ID: {entry.getId()}")

    def deleteEntry(self, entryid):
        if self.isLocked:
            raise ValueError("Diary is locked")
        entry = self.findEntryById(entryid)
        self.entries.remove(entry)
        print(f"Entry with ID {entryid} deleted")

    def findEntryById(self, id):
        if self.isLocked:
            raise ValueError("Diary is locked")
        for entry in self.entries:
            if entry.getId() == id:
                return entry
        raise ValueError("Entry not found")

    def updateEntry(self, entryid, title, body):
        if self.isLocked:
            raise ValueError("Diary is locked")
        entry = self.findEntryById(entryid)
        entry.setTitle(title)
        entry.setBody(body)
        print(f"Entry updated: {entry.getTitle()}")

    def getUsername(self):
        return self.username

    def __str__(self):
        return self.username