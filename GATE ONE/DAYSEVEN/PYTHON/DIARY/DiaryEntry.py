from datetime import datetime

class DiaryEntry:
    def __init__(self, id, title, body):
        self.id = id
        self.title = title
        self.body = body
        self.dateCreated = datetime.now()

    def getId(self):
        return self.id

    def setTitle(self, title):
        self.title = title

    def getTitle(self):
        return self.title

    def setBody(self, body):
        self.body = body

    def getBody(self):
        return self.body

    def getDateCreated(self):
        return self.dateCreated.strftime("%Y-%m-%d %H:%M")