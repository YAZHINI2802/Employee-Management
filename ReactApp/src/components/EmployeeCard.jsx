import "../css/EmployeeCard.css";
function EmployeeCard({name, employeeID, designation}){
    return(
        <div className="employee-card">
            <h3>{name}</h3>
            <p>Employee ID:{employeeID}</p>       
            <p>Designation : {designation}</p>

        </div>
    );
}
export default EmployeeCard;