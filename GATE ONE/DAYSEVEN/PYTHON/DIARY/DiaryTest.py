import unittest
from Diary import Diary

class DiaryTest(unittest.TestCase):
    def test_find_diary_by_username(self):
        from Diaries import Diaries
        diaries = Diaries()
        username = "fat boy"
        password = "fat"
        diaries.add(username, password)
        found = diaries.findByUsername(username)
        self.assertEqual(username, found.getUsername())

    def test_unlock_diary(self):
        username = "test user"
        password = "test123"
        diary = Diary(username, password)
        diary.unlockDiary(password)
        self.assertFalse(diary.isLocked())

    def test_create_entry(self):
        diary = Diary("user", "pass")
        diary.unlockDiary("pass")
        diary.createEntry("Title", "Body")
        self.assertEqual("Title", diary.findEntryById(1).getTitle())

if __name__ == "__main__":
    unittest.main()