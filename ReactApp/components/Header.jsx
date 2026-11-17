import {Users,Search,Bell,CircleUserRound} from "lucide-react"
import "../css/Header.css";
function Header(){
    return(
        <header>
            <div className="header">
                <div className="header-left">
                    <Users/>
                     <h1> Employee Management System </h1>
                </div>
                <div className="header-right">
                        <Search/>
                        <Bell/>
                        <CircleUserRound/>
                </div>
            </div>
           
        </header>
            
       
    );
}
export default Header;