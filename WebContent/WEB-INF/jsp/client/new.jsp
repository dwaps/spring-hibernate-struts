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
					name="lastname"
					class="form-control"
					value="${lastname}" />
			</div>
			<div class="form-group">
				Prénom
				<input type="text"
					name="firstname"
					class="form-control"
					value="${firstname}" />
			</div>
			<div class="form-group">
				Pseudo
				<input type="text"
					name="pseudo"
					class="form-control"
					value="${pseudo}" />
			</div>
			<div class="form-group">
				Mot de passe
				<input type="password"
					name="password"
					class="form-control" />
			</div>
			<button type="submit" class="btn btn-info">Valider</button>
		</form>
	</div>
</div>

<%@ include file="../_include/jsp-end.jsp" %>