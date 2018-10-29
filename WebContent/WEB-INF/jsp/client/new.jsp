<%@ include file="../_include/jsp-start.jsp" %>

<div class="row">
	<div class="col mt-3">
		<h3 class="text-center">Nouveau client</h3>
	</div>
</div>
<div class="row">
	<div class="col col-sm-4 offset-sm-4 m-1">
		<form action="client-new.action" method="POST">
			<div class="form-group">
				Nom
				<input type="text"
					name="client.lastname"
					class="form-control"
					value="${client.lastname}" />
			</div>
			<div class="form-group">
				Prénom
				<input type="text"
					name="client.firstname"
					class="form-control"
					value="${client.firstname}" />
			</div>
			<div class="form-group">
				Email
				<input type="text"
					name="client.email"
					class="form-control"
					value="${client.email}" />
			</div>
			<button type="submit" class="btn btn-info">Valider</button>
		</form>
	</div>
</div>

<%@ include file="../_include/jsp-end.jsp" %>