<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Payment Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link" href="/showstudentpayment"><button
								class="btn">View Payment</button></a></li>


				</ul>


				<div class="container ">
					<div class="row">

						<h3 class="mb-5">Create Payment</h3><br>

							<div class="col-10"">
							<form class="row g-3 shadow p-3 rounded-2 " action="/addadminpayment">
								<h4 class="text-center">Payment Form</h4>
								<div class="col-md-4">
									<label for="inputPassword4" class="form-label">Student Id</label> <input
										type="text" class="form-control" id="inputPassword4"
										name="id" value=${st.id}>
								</div>
								<div class="col-md-4">
									<label for="inputPassword4" class="form-label">Student Name</label> <input
										type="text" class="form-control" id="inputPassword4"
										name="name" value=${st.name}>
								</div>
								<div class="col-md-4">
									<label for="inputPassword4" class="form-label">Semester Name</label> <input
										type="text" class="form-control" id="inputPassword4"
										name="semestername" value=${st.semestername}>
								</div>
								<div class="col-md-4">
									<label for="inputEmail4" class="form-label">Semester Fee</label>
									<input type="text" class="form-control" id="inputEmail4"
										name="tutionfee" value=${sts.semester_fee}>
								</div>
								<div class="col-md-4">
									<label for="inputPassword4" class="form-label">Special Fee
										</label> <input type="text" class="form-control"
										id="inputPassword4" name="specialfee">
								</div>
								<div class="col-4">
									<label for="inputAddress" class="form-label">Facilities Fee</label> <input
										type="text" class="form-control" id="inputAddress"
										name="facilitesfee">
								</div>
								<div class="col-md-4">
									<label for="inputEmail4" class="form-label">Library Fee</label> <input
										type="text" class="form-control" id="inputEmail4" name="libraryfee">
								</div>
								<div class="col-md-4">
									<label for="inputPassword4" class="form-label">Technology Fee
										</label> <input type="text" class="form-control"
										id="inputPassword4" name="fechnologyfee">
								</div>
								<div class="col-md-4">
									<label for="inputEmail4" class="form-label">Registration Fee</label>
									<input type="text" class="form-control" id="inputEmail4"
										name="regfee">
								</div>
								<div class="col-md-4">
									<label for="inputPassword4" class="form-label">Housing Fee
										</label> <input type="text" class="form-control"
										id="inputPassword4" name="housingfee">
								</div>
								
								<div class="col-md-4">
									<label for="inputEmail4" class="form-label">Financial Aid
										</label> <input type="text" class="form-control" id="inputEmail4"
										name="financialaid">
								</div>
								<div class="col-md-4">
									<label for="inputEmail4" class="form-label">Student id Fee
										</label> <input type="text" class="form-control" id="inputEmail4"
										name="studentidfee">
								</div>
								<div class="col-md-4">
									<label for="inputEmail4" class="form-label">Quota
										</label> <input type="text" class="form-control" id="inputEmail4"
										name="quta" value=${sts.quta}>
								</div>
								
								
								
								<div class="col-12 d-grid gap-2">
									<button type="submit" class="btn btn-primary">Create Payment</button>
								</div>
							</form>
						</div>
						

					</div>
				</div>


			</div>
		<%@ include file="footer.jsp" %>