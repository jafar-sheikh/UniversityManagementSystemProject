<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Semester Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link" href="/addsemesterform">
							<button type="button" class="btn" data-bs-toggle="modal"
								data-bs-target="#exampleModal">Add Semester</button>
					</a></li>


					<li class="nav-item"><a class="nav-link" href="/showsemester"><button
								class="btn">View Semester</button></a></li>


				</ul>

				<br>
				<br>

				<div class="container">
					<div class="row justify-content-center">

						<div class="col-6">
							<form action="/addsementer" method="post" class="shadow p-4">
								<div>
									<h4 class="text-center">Add Semester</h4>
								</div>
								<label for="id" class="form-label">Department Name</label>
								<select name="departmentname" class="form-select" aria-label="Default select example" id="id">
									<c:forEach var="d" items="${d }">
									<option value="${d.departmentname }">${d.departmentname }</option>
									</c:forEach>
									
								</select>

								<div class="mb-3">
									<label for="exampleInputEmail1" class="form-label">Semester
										Code </label> <input name="semestercode" type="text"
										class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp">

								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">Semester
										Name</label> <input name="semestername" type="text"
										class="form-control" id="exampleInputPassword1">
								</div>

								<button type="submit" class="btn btn-primary col-12 d-grid gap-2"
									>Add Semester</button>
							</form>
						</div>
					</div>
				</div>

			</div>
		<%@ include file="footer.jsp" %>