//(5)

const company = {
    name: "TechCorp",
    location: "San Francisco",
    employees: [
        {id: 1, name: "Matthew", department: "HR"},
        {id: 2, name: "Ibrahim", department: "Marketing"},
        {id: 3, name: "Quayyum", department: "Engineering"},
        {id: 4, name: "David", department: "Engineering"},
    ],

    getSecondEmployeeName: function(){
        return `${company.employees[1].name}`
    },

    extractCompanyNameAndLocation: function(){
        const result = [company.name, company.location];
        return result;
    },

    getEmployeesNameAndDepartment: function(){
        let count = 0;
        let file = [];
        while(count < company.employees.length){
            file.push(`name: ${company.employees[count].name} : ${company.employees[count].department}`)
            count+=1;
        }return file;
    },
};

company.getSecondEmployeeName();
company.extractCompanyNameAndLocation();
company.getEmployeesNameAndDepartment();

module.exports = { company };