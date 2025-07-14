const DiaryEntry = require('./DiaryEntry');
class Diary {
    constructor(username, password) {
        if (!username || !username.trim() || !password || !password.trim()) {
            throw new Error("Username and password cannot be empty");
        }
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = [];
        this.entryId = 1;
    }

    unlockDiary(password) {
        if (password !== this.password) {
            throw new Error("Diary unlock failed: try a correct password");
        }
        this.isLocked = false;
        console.log(`Diary unlocked for user: ${this.username}`);
    }

    lockDiary() {
        this.isLocked = true;
    }

    isLocked() {
        return this.isLocked;
    }

    createEntry(title, body) {
        if (this.isLocked) {
            throw new Error("Diary is locked");
        }
        if (!title || !title.trim()) {
            throw new Error("Title cannot be empty");
        }
        const entry = new DiaryEntry(this.entryId++, title, body);
        this.entries.push(entry);
        console.log(`Entry created with ID: ${entry.getId()}`);
    }

    deleteEntry(entryId) {
        if (this.isLocked) {
            throw new Error("Diary is locked");
        }
        const entry = this.findEntryById(entryId);
        const index = this.entries.indexOf(entry);
        if (index > -1) {
            this.entries.splice(index, 1);
        }
        console.log(`Entry with ID ${entryId} deleted`);
    }

    findEntryById(id) {
        if (this.isLocked) {
            throw new Error("Diary is locked");
        }
        const entry = this.entries.find(entry => entry.getId() === id);
        if (!entry) {
            throw new Error("Entry not found");
        }
        return entry;
    }

    updateEntry(entryId, title, body) {
        if (this.isLocked) {
            throw new Error("Diary is locked");
        }
        const entry = this.findEntryById(entryId);
        entry.setTitle(title);
        entry.setBody(body);
        console.log(`Entry updated: ${entry.getTitle()}`);
    }

    getUsername() {
        return this.username;
    }

    toString() {
        return this.username;
    }
}
module.exports = Diary;