import EmployeeCard from "./EmployeeCard";
import "../css/EmployeeList.css";
function EmployeeList(){

    const employees =[ {id:1, name:"Priya", employeeID:"EMP001", designation:"Developer"},
                      {id:2, name: "Jhon", employeeID:"EMP002", designation:"mager"}
    ];
    return(
        <div className="employee-list">
            <h1>Employee List Working</h1>
            <div className="employee-cards">
             {employees.map((employee) => (
                <EmployeeCard
                key={employee.id}
                name={employee.name}
                employeeID={employee.employeeID}
                designation={employee.designation}
                />
                
             ))}
            </div>
        </div>
    );
}
export default EmployeeList;