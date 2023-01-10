<%@ include file="header.jsp" %>
			<div class="col py-3">

				

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link" href="/addassigncourse">
							<button type="button" class="btn" data-bs-toggle="modal"
								data-bs-target="#exampleModal">Assign Student</button>
					</a></li>


					<li class="nav-item"><a class="nav-link" href="/addassignfaculty"><button
								class="btn">Assign Faculty</button></a></li>


				</ul>

				<br>
				<br>

				<div class="container">
					<div class="row justify-content-center">

						<div class="col-6">
							<form action="/addassignfacultyinfo" method="post" class="shadow p-4">
								<div>
									<h4 class="text-center">Assign Faculty</h4>
								</div>
								<label for="id" class="form-label">Select Faculty Name</label>
								<select name="name" class="form-select" aria-label="Default select example" id="id">
									<c:forEach var="f" items="${fs }">
									<option value="${f.name }">${f.name }</option>
									</c:forEach>
									
								</select>

								<div class="mb-3">
									<label for="id" class="form-label">Select Semester</label>
								<select name="semestername" class="form-select" aria-label="Default select example" id="id">
									<c:forEach var="s" items="${ss }">
									<option value="${s.semestername }">${s.semestername }</option>
									</c:forEach>
									
								</select>

								</div>
								<div class="mb-3">
									<label for="id" class="form-label">Select Course</label>
								<select name="coursename" class="form-select" aria-label="Default select example" id="id">
									<c:forEach var="c" items="${cs }">
									<option value="${c.coursename }">${c.coursename }</option>
									</c:forEach>
									
								</select>
								</div>
								<div class="mb-3">
									<label for="id" class="form-label">Select Department</label>
								<select name="departmentname" class="form-select" aria-label="Default select example" id="id">
									<c:forEach var="c" items="${ds }">
									<option value="${c.departmentname }">${c.departmentname }</option>
									</c:forEach>
									
								</select>
								</div>

								<button type="submit" class="btn btn-primary col-12 d-grid gap-2"
									>Submit</button>
							</form>
						</div>
					</div>
				</div>

			</div>
		<%@ include file="footer.jsp" %>