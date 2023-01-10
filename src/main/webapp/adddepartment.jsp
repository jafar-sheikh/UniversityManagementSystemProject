<%@ include file="header.jsp"%>
<div class="col py-3">

	<h2 class="text-center">Department Information</h2>

	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link"
			href="/adddepartmentform">
				<button type="button" class="btn" data-bs-toggle="modal"
					data-bs-target="#exampleModal">Add Department</button>
		</a></li>


		<li class="nav-item"><a class="nav-link"
			href="/showdepartmentform"><button class="btn">View
					Department</button></a></li>


	</ul>

	<br> <br>

	<div class="container">
		<div class="row justify-content-center">

			<div class="col-6">
				<form action="/adddepartment" method="post" class="shadow p-4">
					<div>
						<h4 class="text-center">Add Department</h4>
					</div>
					<label for="id" class="form-label">University Name</label> <select
						name="universityname" class="form-select"
						aria-label="Default select example" id="id">
						<c:forEach var="u" items="${ue}">
							<option>${u.universityname}</option>
						</c:forEach>


					</select>

					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Department
							Code </label> <input name="departmentcode" type="text"
							class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp">

					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Department
							Name</label> <input name="departmentname" type="text"
							class="form-control" id="exampleInputPassword1">
					</div>

					<button type="submit" class="btn btn-primary col-12 d-grid gap-2">Add
						Department</button>
				</form>
			</div>
		</div>
	</div>

</div>
<%@ include file="footer.jsp"%>