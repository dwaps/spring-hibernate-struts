<%@ include file="../_include/jsp-start.jsp" %>

<div class="row">
	<div class="col">
		<h1 class="text-center">Nouveau client</h1>
	</div>
</div>
<div class="row">
	<div class="col col-sm-4 offset-sm-4">
		<form action="client-new.action" method="POST">
			<div class="form-group">
				Nom
				<input type="text"
					name="client.lastname"
					class="form-control"
					value="${client.lastname}" />
			</div>
			<div class="form-group">
				Pr�nom
				<input type="text"
					name="client.firstname"
					class="form-control"
					value="${client.firstname}" />
			</div>
			<div class="form-group">
				Pseudo
				<input type="text"
					name="client.pseudo"
					class="form-control"
					value="${client.pseudo}" />
			</div>
			<div class="form-group">
				Mot de passe
				<input type="password"
					name="client.password"
					class="form-control" />
			</div>
			<button type="submit" class="btn btn-info">Valider</button>
		</form>
	</div>
</div>

<%@ include file="../_include/jsp-end.jsp" %>