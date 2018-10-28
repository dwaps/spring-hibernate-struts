<%@ include file="../_include/jsp-start.jsp" %>

<div class="row">
	<div class="col">
		<h1 class="text-center">Liste des clients</h1>
	</div>
</div>
<div class="row">
	<div class="col col-sm-10 offset-sm-1">
		<table class="table table-bordered table-hover text-center">
			<thead class="thead-dark">
				<tr>
					<th>Nom</th>
					<th>Pr�nom</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>G�rard</td>
					<td>Dupont</td>
					<td>gerard@mail.fr</td>
					<td>
						<a href="/shs/client-one.action" class="p-1">
							<i class="fa fa-eye"></i></a>
						<a href="/shs/client-edit.action" class="p-1">
							<i class="fa fa-edit"></i></a>
						<a href="/shs/client-delete.action" class="p-1">
							<i class="fa fa-trash"></i></a>
					</td>
				</tr>
			</tbody>
			<tbody>
				<tr>
					<td>Fernand</td>
					<td>Durand</td>
					<td>fernand@mail.fr</td>
					<td>
						<a href="/shs/client-one.action" class="p-1">
							<i class="fa fa-eye"></i></a>
						<a href="/shs/client-edit.action" class="p-1">
							<i class="fa fa-edit"></i></a>
						<a href="/shs/client-delete.action" class="p-1">
							<i class="fa fa-trash"></i></a>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

<%@ include file="../_include/jsp-end.jsp" %>