<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="admit-card ">
			<div class="BoxA border- padding mar-bot text-center"> 
				<div class="row">
					<div class="col-sm-10">
						<h4>Dhaka University</h4>
						<p>Shahbag Dhaka-1000</p>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-10">
						<h4>Result Card</h4>
						<p>Department : ${ast.getDepartmentname() }</p>
					</div>
				</div>
			</div>
			
			<div class="BoxD border- padding mar-bot">
				<div class="row">
					<div class="col-sm-10">
						<table class="table table-bordered">
						  <tbody>
							<tr>
							  <td><b>Student Id : ${fr.getId()}</b></td>
							  <td><b>Semester: </b>${fr.getSementername() }</td>
							</tr>
							<tr>
							  <td><b>Student Name: </b>${fr.getName()}</td>
							  <td><b>Course: </b>${fr.getCoursename()}</td>
							</tr>
							<tr>
							  <td><b>Exam </b> </td>
							  <td><b>Mark </b></td>
							</tr>
							<tr>
							  <td><b>Test 1 : </b> </td>
							  <td>${fr.getTest1() }</td>
							</tr>
							<tr>
							  <td><b>Test 2 : </b> </td>
							  <td>${fr.getTest2() }</td>
							</tr>
							<tr>
							  <td><b>Mid : </b> </td>
							  <td>${fr.getMid() }</td>
							</tr>
							<tr>
							  <td><b>Final : </b> </td>
							  <td>${fr.getFinaltest() }</td>
							</tr>
							<tr>
							  <td><b>GPA : </b> </td>
							  <td>${fr.getCgpa() }</td>
							</tr>
							<tr>
							  <td><b>Gread : </b> </td>
							  <td>${fr.getGread() }</td>
							</tr>
							
						  </tbody>
						</table>
						<button onclick="window.print()" class="btn btn-info">Print</button>
					</div>
					
				</div>
			</div>
			
			
			
			
		</div>
	</div>




<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
</body>
</html>