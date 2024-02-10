import React, { Component } from "react";
import ProjectItem from "./project/ProjectItem";

export default class Dashboard extends Component {
  render() {
    return (
      <div>
        <h3 className="alert alert-info">Welcome to Dashboard</h3>
        <ProjectItem />
        <ProjectItem />
        <ProjectItem />
      </div>
    );
  }
}
