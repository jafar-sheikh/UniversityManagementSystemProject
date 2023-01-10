<%@ include file="header.jsp" %>
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

						<div class="col-12">

							<div class="container ">
								<div class="row">
									<div class="col">
										<h5>All Department</h5>
									</div>
									<div class="col">
										<form class="d-flex" role="search" action="/all/id/">
											<input name="departmentname" class="form-control me-2" type="search"
												placeholder="Search by department name" aria-label="Search">
											<button class="btn btn-outline-success" type="submit">Search</button>
										</form>
									</div>
								</div>

							</div>

							<br>

							<table class="table table-hover shadow ">
								<thead>
									<tr class="table-primary">

										<th scope="col">Department Code</th>
										<th scope="col">Department Name</th>
										<th scope="col">University Name</th>
										<th scope="col">Edit</th>
										<th scope="col">Delete</th>


									</tr>
								</thead>
								<tbody>
									<c:forEach var="d" items="${de}">
										<tr>
											<td>${d.departmentcode }</td>
											<td>${d.departmentname }</td>
											<td>${d.universityname }</td>
											<td>
												<form action="/updatepage/${d.getDepartmentcode() }">
													<button type="submit" class="btn btn-outline-info btn-sm">Update</button>
												</form>
											</td>
											<td>
												<form action="/deletedepartment/${d.getDepartmentcode()}">
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