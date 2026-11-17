import { useState } from "react";
import { LayoutDashboard, Users } from "lucide-react";
import "../css/Sidebar.css";

function Sidebar(){
    const[activeMenu , setactiveMenu] = useState("Dashboard");

    return(
        <aside>
            <div className= "side-bar">
            <button className ={`sidebar-item ${activeMenu === "Dashboard" ? "active":""}`}
            onClick ={()=>setactiveMenu("Dashboard")}>
           
            <LayoutDashboard  size={22}/>
                <span>Dashboard</span>

            </button>
          </div>
        </aside>
    );
}
export default Sidebar