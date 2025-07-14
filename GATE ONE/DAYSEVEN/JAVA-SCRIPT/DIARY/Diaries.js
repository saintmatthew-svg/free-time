const Diary = require('./Diary');

class Diaries {
    constructor() {
        this.diaries = [];
    }

    add(username, password) {
        this.diaries.push(new Diary(username, password));
    }

    findByUsername(username) {
        return this.diaries.find(diary => diary.getUsername() === username) || null;
    }

    delete(username, password) {
        const diary = this.findByUsername(username);
        diary.unlockDiary(password);
        const index = this.diaries.indexOf(diary);
        if (index > -1) {
            this.diaries.splice(index, 1);
        }
    }
}
module.exports = Diaries;