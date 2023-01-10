<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Semester Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link"
						href="/addsemesterform">
							<button type="button" class="btn" data-bs-toggle="modal"
								data-bs-target="#exampleModal">Add Semester</button>
					</a></li>


					<li class="nav-item"><a class="nav-link"
						href="/showsemester"><button class="btn">View
								Semester</button></a></li>


				</ul>

				<br> <br>

				<div class="container">
					<div class="row justify-content-center">

						<div class="col-12">

							<div class="container ">
								<div class="row">
									<div class="col">
										<h5>All Semester</h5>
									</div>
									<div class="col">
										<form class="d-flex" role="search" action="/searchsemester">
											<input name="semestercode" class="form-control me-2" type="search"
												placeholder="Search by Semester code" aria-label="Search">
											<button class="btn btn-outline-success" type="submit">Search</button>
										</form>
									</div>
								</div>

							</div>

							<br>

							<table class="table table-hover shadow ">
								<thead>
									<tr class="table-primary">

										<th scope="col">Semester Code</th>
										<th scope="col">Semester Name</th>
										<th scope="col">Department Name</th>
										<th scope="col">Edit</th>
										<th scope="col">Delete</th>


									</tr>
								</thead>
								<tbody>
									<c:forEach var="s" items="${se}">
										<tr>
											<td>${s.semestercode }</td>
											<td>${s.semestername }</td>
											<td>${s.departmentname }</td>
											<td>
												<form action="/getvalueupdateform/${s.getSemestercode() }">
													<button type="submit" class="btn btn-outline-info btn-sm">Update</button>
												</form>
											</td>
											<td>
												<form action="/deletesemester/${s.getSemestercode()}">
													<button type="submit" class="btn btn-outline-danger btn-sm">Delete</button>
												</form>
											</td>
										</tr>
									</c:forEach>


								</tbody>
							</table>

						</div>
					</div>
				</div>

			</div>
		<%@ include file="footer.jsp" %>