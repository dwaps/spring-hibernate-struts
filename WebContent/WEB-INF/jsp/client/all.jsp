<%@ include file="../_include/jsp-start.jsp" %>

<div class="row">
	<div class="col mt-3">
		<h3 class="text-center">Liste des clients</h3>
	</div>
</div>
<div class="row">
	<div class="col col-sm-10 offset-sm-1">
		<s:if test="clients.empty">
			<div class="text-center">
				<h5>Aucun clients pour le moment !</h5>
				<s:a action="client-new" cssClass="btn btn-info m-3">Ajouter un client</s:a>
			</div>
		</s:if>
		<s:else>
			<table class="table table-bordered table-hover text-center">
				<thead class="thead-dark">
					<tr>
						<th>Nom</th>
						<th>Prénom</th>
						<th>Email</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator var="client" value="clients">
					<tr>
						<td>${client.firstname}</td>
						<td>${client.lastname}</td>
						<td>${client.email}</td>
						<td>
							<s:a action="client-one" cssClass="p-1">
								<s:param name="idClient">${client.id}</s:param>
								<i class="fa fa-eye"></i></s:a>
							<s:a action="client-edit" cssClass="p-1">
								<i class="fa fa-edit"></i></s:a>
							<s:a action="client-delete" cssClass="p-1">
								<i class="fa fa-trash"></i></s:a>
						</td>
					</tr>
					</s:iterator>
				</tbody>
			</table>
		</s:else>
	</div>
</div>

<%@ include file="../_include/jsp-end.jsp" %>