import Header from "./Header";
import Sidebar from "./Sidebar";
import "../css/MainLayout.css";

function MainLayout({ children }) {
    return (
        <>
            <Header />

            <div className="main-layout">
                <Sidebar />

                <main className="main-content">
                    {children}
                </main>
            </div>
        </>
    );
}

export default MainLayout;