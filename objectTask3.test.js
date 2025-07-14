const {company} = require("./objectTask3");

describe("default company", () => {
    beforeEach(() => {
        company.name = "TechCorp";
        company.location = "San Francisco";
        company.employees = [
            {id: 1, name: "Matthew", department: "HR"},
            {id: 2, name: "Ibrahim", department: "Marketing"},
            {id: 3, name: "Quayyum", department: "Engineering"},
            {id: 4, name: "David", department: "Engineering"},
        ];
    });

    test("company name return correct name if reqired", () => {
        expect(company.name).toBe("TechCorp");
    });

    test("company locaion return correct location", () => {
        expect(company.location).toBe("San Francisco");
    });

    test("company return right employees name and department", () => {
        expect(company.employees[0].name).toBe("Matthew");
        expect(company.employees[0].department).toBe("HR");
        expect(company.employees[1].name).toBe("Ibrahim");
        expect(company.employees[1].department).toBe("Marketing");
        expect(company.employees[2].name).toBe("Quayyum");
        expect(company.employees[2].department).toBe("Engineering");
        expect(company.employees[3].name).toBe("David");
        expect(company.employees[3].department).toBe("Engineering");
    });

    test("test extract company name and location function", () => {
        expect(company.extractCompanyNameAndLocation()).toEqual(["TechCorp","San Francisco"]);
    });

    test("get employees name and department function", () => {
        company.employees = [
            {id: 1, name: "Matthew", department: "HR"},
            {id: 2, name: "Ibrahim", department: "Marketing"},
            {id: 3, name: "Quayyum", department: "Engineering"},
            {id: 4, name: "David", department: "Engineering"},
        ];
		
		let expected = [
            "name: Matthew : HR",
            "name: Ibrahim : Marketing",
            "name: Quayyum : Engineering",
            "name: David : Engineering",
        ];
        expect(company.getEmployeesNameAndDepartment()).toEqual(expected);
    });

});