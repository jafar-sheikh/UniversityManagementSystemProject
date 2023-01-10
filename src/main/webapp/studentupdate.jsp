<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Student Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link"
						href="/addstudentform">
							<button type="button" class="btn" data-bs-toggle="modal"
								data-bs-target="#exampleModal">Add Student</button>
					</a></li>


					<li class="nav-item"><a class="nav-link"
						href="/showstudent"><button class="btn">View
								Student</button></a></li>


				</ul>

				<br> <br>

				<div class="container">
					<div class="row justify-content-center">

						<div class="col-10"">
							<form class="row g-3 shadow p-3 rounded-2  bg-info" action="/studentupdate" method="put">
								<h4 class="text-center">Student Update Form</h4>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Student Id</label> <input
										type="text" class="form-control" id="inputPassword4"
										name="id" value=${s.id}>
								</div>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Student Name</label> <input
										type="text" class="form-control" id="inputPassword4"
										name="name" value=${s.name}>
								</div>
								<div class="col-md-6">
									<label for="inputEmail4" class="form-label">Father Name</label>
									<input type="text" class="form-control" id="inputEmail4"
										name="father_name" value=${s.father_name}>
								</div>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Mother
										Name</label> <input type="text" class="form-control"
										id="inputPassword4" name="mother_name" value=${s.mother_name}>
								</div>
								<div class="col-12">
									<label for="inputAddress" class="form-label">Address</label> <input
										type="text" class="form-control" id="inputAddress"
										name="address" value=${s.address}>
								</div>
								<div class="col-md-6">
									<label for="inputEmail4" class="form-label">Email</label> <input
										type="text" class="form-control" id="inputEmail4" name="email" value=${s.email}>
								</div>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Phone
										Number</label> <input type="text" class="form-control"
										id="inputPassword4" name="phone" value=${s.phone}>
								</div>
								<div class="col-md-6">
									<label for="inputEmail4" class="form-label">Birth date</label>
									<input type="date" class="form-control" id="inputEmail4"
										name="birthdate" value=${s.birthdate}>
								</div>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Blood
										Group</label> <input type="text" class="form-control"
										id="inputPassword4" name="blood_group" value=${s.blood_group}>
								</div>
								<div class="col-md-6">
									<label for="id" class="form-label">Gender</label> <select
										name="gender" class="form-select"
										aria-label="Default select example" id="id" value=${s.gender}>
										<option value="">--Select Gender--</option>
										<option value="Male">Male</option>
										<option value="Female">Female</option>

									</select>
								</div>

								<div class="col-md-6">
									<label for="inputEmail4" class="form-label">Semester
										Fee</label> <input type="text" class="form-control" id="inputEmail4"
										name="semester_fee" value=${s.semester_fee}>
								</div>
								<div class="col-md-6">
									<label for="id" class="form-label">Quota</label> <select
										name="quta" class="form-select"
										aria-label="Default select example" id="id" value=${s.quta}>
										<option value="">--Select Quota--</option>
										<option value="Freedom_Fighter">Freedom Fighter</option>
										<option value="Ethnic_Group">Ethnic Group</option>
										<option value="Disabled">Disabled</option>
										<option value="No_Quota">No Quota</option>
									</select>
								</div>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Photo</label>
									<div class="input-group">
										<input type="file" class="form-control" id="inputGroupFile04"
											aria-describedby="inputGroupFileAddon04" aria-label="Upload" name="photo" value=${s.photo}>
										

									</div>
								</div>
								<div class="col-12 d-grid gap-2">
									<button type="submit" class="btn btn-primary">Update
										Student</button>
								</div>
							</form>
						</div>
					</div>
				</div>

			</div>
		<%@ include file="footer.jsp" %>