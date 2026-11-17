import { Heading1 } from "lucide-react";

function Department(){
    const departments = ["IT", "HR","Finance","Testing"]
    return(
        <div className="department">
            <h3> Department List</h3>
            <div>
                {departments.map((department, index) =>(
                    <div className="department-card" key={index}>
                        <h3>{department}</h3>
                ))
                }
            </div>
        </div>
    );
}export default Department;