import Dashboard from "./components/Dashboard";
import "./App.css";
import Header from "./components/layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import addProject from "./components/project/addProject";

function App() {
  return (
    <Router>
      <div className="App">
        <Header />
        <Routes>
          <Route exact path="/dashboard" Component={Dashboard} />
          <Route exact path="/addProject" Component={addProject} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
