<%@ include file="header.jsp"%>
<div class="col py-3">

	<h2 class="text-center">Course Information</h2>

	<ul class="nav nav-tabs">
		<li class="nav-item"><a class="nav-link" href="/addcourse">
				<button type="button" class="btn" data-bs-toggle="modal"
					data-bs-target="#exampleModal">Add Course</button>
		</a></li>


		<li class="nav-item"><a class="nav-link" href="/showcourse"><button
					class="btn">View Course</button></a></li>


	</ul>

	<br> <br>

	<div class="container">
		<div class="row justify-content-center">

			<div class="col-6">
				<form action="/addcourseinfo" method="post" class="shadow p-4">
					<div>
						<h4 class="text-center">Add Course</h4>
					</div>
					<label for="id" class="form-label">Semester Name</label> <select
						name="semestername" class="form-select"
						aria-label="Default select example" id="id">
						<c:forEach var="c" items="${co }">
							<option value="${c.semestername }">${c.semestername }</option>
						</c:forEach>

					</select>

					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Course
							Code </label> <input name="coursecode" type="text" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp">

					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Course
							Name</label> <input name="coursename" type="text" class="form-control"
							id="exampleInputPassword1">
					</div>

					<button type="submit" class="btn btn-primary col-12 d-grid gap-2">Add
						Course</button>
				</form>
			</div>
		</div>
	</div>

</div>
<%@ include file="footer.jsp"%>