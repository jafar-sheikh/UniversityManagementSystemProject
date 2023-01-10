<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Faculty Deshboard</title>
<style>
input {
	background-color: transparent;
	border: 0px solid;
	height: 20px;
	width: 160px;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js"
	integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar bg-dark fixed-top">

		<div class=" container-fluid">
			<div
				class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
				<a class="navbar-brand"><h2 class="text-info">University
						Management System</h2></a>





				<div class="dropdown text-end " style="margin-left: 700px">
					<a href="#" class="d-block  text-decoration-none dropdown-toggle"
						data-bs-toggle="dropdown" aria-expanded="false"> <img
						src="https://github.com/mdo.png" alt="mdo" width="32" height="32"
						class="rounded-circle">
					</a>
					<ul class="dropdown-menu text-small">

						<li><a class="dropdown-item" href="#">Profile</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#">Sign out</a></li>
					</ul>
				</div>
			</div>
		</div>

	</nav>
	<br>
	<br>
	<br>
	<div class="container-fluid">
		<div class="row flex-nowrap">
			<div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-dark">
				<div
					class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
					<a href="/"
						class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none">
						<span class="fs-5 d-none d-sm-inline"><h5>Faculty
								Dashboard</h5></span>
					</a>
					<ul
						class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start"
						id="menu">
						<li class="nav-item"><a href=""
							class="nav-link align-middle px-0"> <i class="fs-4 bi-house"></i>
								<span class="ms-1 d-none d-sm-inline">Faculty Info</span>
						</a></li>

						<li class="nav-item"><a href="/attendance"
							class="nav-link align-middle px-0"> <i class="fs-4 bi-house"></i>
								<span class="ms-1 d-none d-sm-inline">Attendance</span>
						</a></li>
						<li><a href="" class="nav-link px-0 align-middle"> <i
								class="fs-4 bi-people"></i> <span
								class="ms-1 d-none d-sm-inline">Students</span>
						</a></li>

						<li><a href="#" class="nav-link px-0 align-middle"> <i
								class="fs-4 bi-people"></i> <span
								class="ms-1 d-none d-sm-inline">Notice</span>
						</a></li>


						<li><a href="/resultinfo" class="nav-link px-0 align-middle">
								<i class="fs-4 bi-people"></i> <span
								class="ms-1 d-none d-sm-inline">Result</span>
						</a></li>




					</ul>
					<hr>

				</div>
			</div>
			<div class="col py-3">

				<table class="table table-hover shadow ">
					<thead>
						<tr class="table-primary">
							<th scope="col">Select</th>
							<th scope="col">Student Id</th>
							<th scope="col">Student Name</th>
							<th scope="col">Course Name</th>
							<th scope="col">Semester Name</th>
							<th scope="col">Department Name</th>


						</tr>
					</thead>
					<tbody>
						<c:forEach var="s" items="${st}">
							<tr>
								<td><input type="checkbox" name="checking">
								<form action="/saveattendance" method="post">
										<input type="hidden" name="id" value="${s.getId()}">
										<button type="submit" class="btn">Present</button>
									</form></td>
								<td>${s.id}</td>
								<td>${s.name}</td>
								<td>${s.coursename}</td>
								<td>${s.semestername}</td>
								<td>${s.departmentname}</td>
							</tr>
						</c:forEach>


					</tbody>
				</table>



			</div>
		</div>
	</div>

</body>
</html>