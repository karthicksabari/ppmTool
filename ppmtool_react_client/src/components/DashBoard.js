import React, { Component } from 'react'

export default class DashBoard extends Component {
  render() {
    return (
        <div className="projects">
        <div className="container">
            <div className="row">
                <div className="col-md-12">
                    <h1 className="display-4 text-center">Projects</h1>
                    <br />
                    <a href="ProjectForm.html" className="btn btn-lg btn-info">
                        Create a Project
                    </a>
                    <br />
                    <hr />

                    {/* <!-- Project Item Component --> */}
                    <div className="container">
                        <div className="card card-body bg-light mb-3">
                            <div className="row">
                                <div className="col-2">
                                    <span className="mx-auto">REACT</span>
                                </div>
                                <div className="col-lg-6 col-md-4 col-8">
                                    <h3>Spring / React Project</h3>
                                    <p>Project to create a Kanban Board with Spring Boot and React</p>
                                </div>
                                <div className="col-md-4 d-none d-lg-block">
                                <ul className="list-group">
                                    <li className="list-group-item board">
                                        {/* eslint-disable-next-line jsx-a11y/anchor-is-valid */}
                                        <a href="#">
                                            <i className="fa fa-flag-checkered pr-1">Project Board </i>
                                        </a>
                                    </li>
                                    <li className="list-group-item update">
                                        {/* eslint-disable-next-line jsx-a11y/anchor-is-valid */}
                                        <a href="#">
                                            <i className="fa fa-edit pr-1">Update Project Info</i>
                                        </a>
                                    </li>
                                    <li className="list-group-item delete">
                                        {/* eslint-disable-next-line jsx-a11y/anchor-is-valid */}
                                        <a href="#">
                                            <i className="fa fa-minus-circle pr-1">Delete Project</i>
                                        </a>
                                    </li>
                                </ul>

                                </div>
                            </div>
                        </div>
                    </div>
                    {/* <!-- End of Project Item Component --> */}
                    </div>
            </div>
        </div>
    </div>
    )
  }
}
