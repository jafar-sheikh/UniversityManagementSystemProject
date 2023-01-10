<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Semester Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link"
						href="/addstudentform">
							<button type="button" class="btn" data-bs-toggle="modal"
								data-bs-target="#exampleModal">Add Semester</button>
					</a></li>


					<li class="nav-item"><a class="nav-link"
						href="/showstudent"><button class="btn">View
								Semester</button></a></li>


				</ul>

				<br> <br>

				<div class="container">
					<div class="row justify-content-center">

						<div class="col-5">
							<form action="/updatesemester" method="put" class="shadow p-3">
								<div>
									<h4 class="text-center">Update Semester Information</h4>
								</div>
								<div class="mb-3">
									<label for="exampleInputEmail1" class="form-label">Semester
										Code </label> <input name="semestercode" type="text"
										class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp" value=${sm.semestercode}>

								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">Semester
										Name</label> <input name="semestername" type="text"
										class="form-control" id="exampleInputPassword1"  value=${sm.semestername}>
								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">Department
										Name</label> <input name="departmentname" type="text"
										class="form-control" id="exampleInputPassword1" value=${sm.departmentname}>
								</div>

								<button type="submit" class="btn btn-primary"
									style="margin-left: 110px">Update Semester</button>
							</form>
						</div>
					</div>
				</div>

			</div>
		<%@ include file="footer.jsp" %>