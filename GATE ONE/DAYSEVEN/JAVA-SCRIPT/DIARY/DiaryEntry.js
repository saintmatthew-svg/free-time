class DiaryEntry {
    constructor(id, title, body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.dateCreated = new Date();
    }

    getId() {
        return this.id;
    }

    setTitle(title) {
        this.title = title;
    }

    getTitle() {
        return this.title;
    }

    setBody(body) {
        this.body = body;
    }

    getBody() {
        return this.body;
    }

    getDateCreated() {
        return this.dateCreated.toISOString();
    }
}
module.exports = DiaryEntry;