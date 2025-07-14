const readline = require('readline');
const Diaries = require('./Diaries'); 
const Diary = require('./Diary');     
const DiaryEntry = require('./DiaryEntry'); 

const diaries = new Diaries();


const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function displayMenu() {
    return `
1. Add Diary.
2. Unlock Diary.
3. Delete Diary.
4. Create Entry
5. Find Entry By ID.
6. Update Entry.
7. Delete Entry.
8. Exit.`;
}

async function main() {
    const { Diaries, Diary, DiaryEntry } = require('./Diaries');
    
    while (true) {
        console.log(displayMenu());
        const option = await askQuestion("Select an option: ");

        try {
            switch (option) {
                case '1':
                    await addDiary();
                    break;
                case '2':
                    await unlockDiary();
                    break;
                case '3':
                    await deleteDiary();
                    break;
                case '4':
                    await createEntry();
                    break;
                case '5':
                    await findEntry();
                    break;
                case '6':
                    await updateEntry();
                    break;
                case '7':
                    await deleteEntry();
                    break;
                case '8':
                    console.log("Exiting...");
                    rl.close();
                    return;
                default:
                    console.log("Invalid option");
            }
        } catch (e) {
            console.log("Error: " + e.message);
        }
    }
}

function askQuestion(question) {
    return new Promise(resolve => {
        rl.question(question, answer => {
            resolve(answer);
        });
    });
}

async function addDiary() {
    const username = await askQuestion("Enter username: ");
    const password = await askQuestion("Enter password: ");
    diaries.add(username, password);
    console.log(`Diary created for ${username}`);
}

async function unlockDiary() {
    const username = await askQuestion("Enter username: ");
    const diary = diaries.findByUsername(username);
    if (!diary) {
        console.log("Diary not found");
        return;
    }
    const password = await askQuestion("Enter password: ");
    diary.unlockDiary(password);
}

async function deleteDiary() {
    const username = await askQuestion("Enter username: ");
    const password = await askQuestion("Enter password: ");
    diaries.delete(username, password);
    console.log("Diary deleted");
}

async function createEntry() {
    const username = await askQuestion("Enter username: ");
    const diary = diaries.findByUsername(username);
    if (!diary) {
        console.log("Diary not found or locked");
        return;
    }
    const title = await askQuestion("Enter entry title: ");
    const body = await askQuestion("Enter entry body: ");
    diary.createEntry(title, body);
}

async function findEntry() {
    const username = await askQuestion("Enter username: ");
    const diary = diaries.findByUsername(username);
    if (!diary) {
        console.log("Diary not found or locked");
        return;
    }
    const id = parseInt(await askQuestion("Enter entry ID: "));
    const entry = diary.findEntryById(id);
    console.log(`Entry found: ${entry.getTitle()} ${entry.getBody()}`);
}

async function updateEntry() {
    const username = await askQuestion("Enter username: ");
    const diary = diaries.findByUsername(username);
    if (!diary) {
        console.log("Diary not found or locked");
        return;
    }
    const id = parseInt(await askQuestion("Enter entry ID: "));
    const title = await askQuestion("Enter new title: ");
    const body = await askQuestion("Enter new body: ");
    diary.updateEntry(id, title, body);
}

async function deleteEntry() {
    const username = await askQuestion("Enter username: ");
    const diary = diaries.findByUsername(username);
    if (!diary) {
        console.log("Diary not found or locked");
        return;
    }
    const id = parseInt(await askQuestion("Enter entry ID: "));
    diary.deleteEntry(id);
}

main().catch(console.error);