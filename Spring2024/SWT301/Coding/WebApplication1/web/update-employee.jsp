
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">

        <title>Edit Departments</title>
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    </head>

    <body>
        
        <div class="main-wrapper">
            <div class="header">
                <div class="header-left">
                    <a href="index.html" class="logo">
                        <img src="assets/img/logo.png" width="35" height="35" alt=""> <span>Preclinic</span>
                    </a>
                </div>
                <a id="toggle_btn" href="javascript:void(0);"><i class="fa fa-bars"></i></a>
                <a id="mobile_btn" class="mobile_btn float-left" href="#sidebar"><i class="fa fa-bars"></i></a>
                <ul class="nav user-menu float-right">
                    <li class="nav-item dropdown d-none d-sm-block">
                        <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown"><i class="fa fa-bell-o"></i> <span class="badge badge-pill bg-danger float-right">3</span></a>
                        <div class="dropdown-menu notifications">
                            <div class="topnav-dropdown-header">
                                <span>Notifications</span>
                            </div>
                            <div class="drop-scroll">
                                <ul class="notification-list">
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">
                                                    <img alt="John Doe" src="assets/img/user.jpg" class="img-fluid rounded-circle">
                                                </span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">John Doe</span> added new task <span class="noti-title">Patient appointment booking</span></p>
                                                    <p class="noti-time"><span class="notification-time">4 mins ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">V</span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">Tarah Shropshire</span> changed the task name <span class="noti-title">Appointment booking with payment gateway</span></p>
                                                    <p class="noti-time"><span class="notification-time">6 mins ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">L</span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">Misty Tison</span> added <span class="noti-title">Domenic Houston</span> and <span class="noti-title">Claire Mapes</span> to project <span class="noti-title">Doctor available module</span></p>
                                                    <p class="noti-time"><span class="notification-time">8 mins ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">G</span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">Rolland Webber</span> completed task <span class="noti-title">Patient and Doctor video conferencing</span></p>
                                                    <p class="noti-time"><span class="notification-time">12 mins ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="notification-message">
                                        <a href="activities.html">
                                            <div class="media">
                                                <span class="avatar">V</span>
                                                <div class="media-body">
                                                    <p class="noti-details"><span class="noti-title">Bernardo Galaviz</span> added new task <span class="noti-title">Private chat module</span></p>
                                                    <p class="noti-time"><span class="notification-time">2 days ago</span></p>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                            <div class="topnav-dropdown-footer">
                                <a href="activities.html">View all Notifications</a>
                            </div>
                        </div>
                    </li>
                    <li class="nav-item dropdown d-none d-sm-block">
                        <a href="javascript:void(0);" id="open_msg_box" class="hasnotifications nav-link"><i class="fa fa-comment-o"></i> <span class="badge badge-pill bg-danger float-right">8</span></a>
                    </li>
                    <li class="nav-item dropdown has-arrow">
                        <a href="#" class="dropdown-toggle nav-link user-link" data-toggle="dropdown">
                            <span class="user-img"><img class="rounded-circle" src="assets/img/user.jpg" width="40" alt="Admin">
                                <span class="status online"></span></span>
                            <span>Admin</span>
                        </a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="profile.html">My Profile</a>
                            <a class="dropdown-item" href="edit-profile.html">Edit Profile</a>
                            <a class="dropdown-item" href="settings.html">Settings</a>
                            <a class="dropdown-item" href="login.html">Logout</a>
                        </div>
                    </li>
                </ul>
                <div class="dropdown mobile-user-menu float-right">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
                    <div class="dropdown-menu dropdown-menu-right">
                        <a class="dropdown-item" href="profile.html">My Profile</a>
                        <a class="dropdown-item" href="edit-profile.html">Edit Profile</a>
                        <a class="dropdown-item" href="settings.html">Settings</a>
                        <a class="dropdown-item" href="login.html">Logout</a>
                    </div>
                </div>
            </div>
            <div class="sidebar" id="sidebar">
                <div class="sidebar-inner slimscroll">
                    <div id="sidebar-menu" class="sidebar-menu">
                        <ul>
                            <li class="menu-title">Main</li>
                            <li class="active">
                                <a href="HomeManager"><i class="fa fa-dashboard"></i> <span>Dashboard</span></a>
                            </li>
                            <li>
                                <a href="department"><i class="fa fa-hospital-o"></i> <span>Departments</span></a>
                            </li>
                            <li class="submenu">
                                <a href="#"><i class="fa fa-user"></i> <span> Employees </span></a>
                            </li>
                            <li class="submenu">
                                <a href="#"><i class="fa fa-flag-o"></i> <span> Attendance Report </span> </a>
                            </li>
                            <li class="submenu">
                                <a href="#"><i class="fa fa-flag-o"></i> <span> Send Application </span> </a>
                            </li>
                            <li>
                                <a href="settings.html"><i class="fa fa-cog"></i> <span>Settings</span></a>
                            </li>    
                        </ul>
                    </div>
                </div>
            </div>
            <div class="page-wrapper">
                <div class="content">
                    <div class="row">
                        <div class="col-sm-5 col-5">
                            <h4 class="page-title">Update Employee</h4>
                        </div>
                        <div class="col-sm-7 col-7 text-right m-b-30">

                        </div>

                        <div class="main">
                            <a href="list-employee">
                                <button type="button" class="btn btn-secondary" style="margin: 10px 0 ;">Back</button>
                            </a>

                            <form action="update-employee" method="post" >
                                <div class="main-text-table">
                                    <table>
                                        <tr class="main-text-input">
                                            <td >
                                                Employee Name
                                            </td>
                                            <td>
                                                <div class="input-group input-group-sm mb-3">
                                                    <div class="input-group-prepend">
                                                        <span class="input-group-text" id="inputGroup-sizing-sm"></span>
                                                    </div>
                                                    <input type="text" class="form-control" aria-label="Small"
                                                           aria-describedby="inputGroup-sizing-sm" name="name" style="width: 300px;">
                                                </div>
                                            </td>
                                            <td>
                                                <div style="margin-left: 30px">
                                                    Employee Image
                                                </div>

                                            </td>
                                            <td>
                                                <input type="file" id="fileInput" onchange="handleFileSelection()"  
                                                       name="image" class="btn btn-outline-secondary"
                                                       style="margin:  0 30px;" name="image" >

                                            </td>
                                        </tr>
                                        <tr class="main-text-input">
                                            <td>Phone Number</td>
                                            <td>
                                                <div class="input-group input-group-sm mb-3">
                                                    <div class="input-group-prepend">
                                                        <span class="input-group-text" id="inputGroup-sizing-sm"></span>
                                                    </div>
                                                    <input type="text" class="form-control" aria-label="Small"
                                                           aria-describedby="inputGroup-sizing-sm" name="phoneNumber" style="width: 300px;">
                                                </div>
                                            <td>
                                                <div style="margin-left: 30px">
                                                    Address
                                                </div>
                                            </td>
                                            <td>
                                                <div class="input-group input-group-sm mb-3" style="margin-left: 30px">
                                                    <div class="input-group-prepend">
                                                        <span class="input-group-text" id="inputGroup-sizing-sm"></span>
                                                    </div>
                                                    <input type="text" class="form-control" aria-label="Small"
                                                           aria-describedby="inputGroup-sizing-sm" name="address" style="width: 300px; ">
                                                </div>
                                            </td>
                                        </tr>
                                        <tr class="main-text-input">
                                            <td>Email</td>
                                            <td>
                                                <div class="input-group input-group-sm mb-3">
                                                    <div class="input-group-prepend">
                                                        <span class="input-group-text" id="inputGroup-sizing-sm"></span>
                                                    </div>
                                                    <input type="text" class="form-control" aria-label="Small"
                                                           aria-describedby="inputGroup-sizing-sm" name="email" style="width: 300px;">
                                                </div>
                                            </td>
                                            <td> <div style="margin-left: 30px">
                                                    Gender
                                                </div></td>
                                            <td>
                                                <div style="margin-left: 50px">
                                                    <input class="form-check-input" type="radio" name="gender"
                                                           id="flexRadioDefault1" value = "male" >

                                                    <label class="form-check-label" for="flexRadioDefault1">
                                                        Male
                                                    </label>

                                                    <input class="form-check-input" type="radio" name="gender"
                                                           id="flexRadioDefault1" value = "female"style="margin-left: 20px"  >

                                                    <label class="form-check-label" for="flexRadioDefault1" style="margin-left: 40px">
                                                        Female
                                                    </label>
                                                </div>


                                            </td>
                                        </tr>
                                        <tr class="main-text-input">
                                            <td>Birth Date</td>
                                            <td>
                                                <input type="date" name="birthDate" style="width: 300px;">
                                            </td>
                                            <td>

                                                <div style="margin-left: 30px">
                                                    Hire Date
                                                </div>
                                            </td>
                                            <td>
                                                <input type="date" name="hireDate" style="width: 300px; margin-left: 30px" >
                                            </td>
                                        </tr>
                                    </table>
                                    <div class="add-to-system">
                                        <button type="submit" class="btn btn-success" style="margin: 10px 0 ;">Add to
                                            system</button>
                                    </div>
                                </div>

                            </form>

                            <!-- Hiển thị thông báo thành công hoặc lỗi -->
                            <c:if test="${ms != null}">
                                <div style="color: green" role="alert">
                                    ${ms}
                                </div>
                            </c:if>
                            <c:if test="${not empty errorMessage}">
                                <div style="color: red" role="alert">
                                    ${errorMessage}
                                </div>
                            </c:if>
                        </div>
                    </div>
                </div>


            </div>
        </div>
        <div class="sidebar-overlay" data-reff=""></div>
        <script src="assets/js/jquery-3.2.1.min.js"></script>
        <script src="assets/js/popper.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.dataTables.min.js"></script>
        <script src="assets/js/dataTables.bootstrap4.min.js"></script>
        <script src="assets/js/jquery.slimscroll.js"></script>
        <script src="assets/js/app.js"></script>
    </body>

</html>

