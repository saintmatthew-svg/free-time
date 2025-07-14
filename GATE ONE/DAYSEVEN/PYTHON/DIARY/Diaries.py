from Diary import Diary


class Diaries:
    def __init__(self):
        self.diaries = []

    def add(self, username, password):
        self.diaries.append(Diary(username, password))

    def findByUsername(self, username):
        for diary in self.diaries:
            if diary.getUsername() == username:
                return diary
        return None

    def delete(self, username, password):
        diary = self.findByUsername(username)
        diary.unlockDiary(password)
        self.diaries.remove(diary)