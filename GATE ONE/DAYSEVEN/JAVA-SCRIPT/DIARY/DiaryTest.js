const assert = require('assert');
const { Diaries, Diary, DiaryEntry } = require('./diaries');

function testFindDiaryByUsername() {
    const diaries = new Diaries();
    const username = "fat boy";
    const password = "fat";
    diaries.add(username, password);
    const found = diaries.findByUsername(username);
    assert.strictEqual(found.getUsername(), username);
    console.log("testFindDiaryByUsername passed");
}

function testUnlockDiary() {
    const username = "test user";
    const password = "test123";
    const diary = new Diary(username, password);
    diary.unlockDiary(password);
    assert.strictEqual(diary.isLocked(), false);
    console.log("testUnlockDiary passed");
}

function testCreateEntry() {
    const diary = new Diary("user", "pass");
    diary.unlockDiary("pass");
    diary.createEntry("Title", "Body");
    assert.strictEqual(diary.findEntryById(1).getTitle(), "Title");
    console.log("testCreateEntry passed");
}

testFindDiaryByUsername();
testUnlockDiary();
testCreateEntry();