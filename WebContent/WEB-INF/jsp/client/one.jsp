<%@ include file="../_include/jsp-start.jsp" %>

<div class="row">
	<div class="col text-center">
		<h1>D�tail du client</h1>
		<p>Nom : <s:property value="client.lastname"/></p>
		<p>Pr�nom : <s:property value="client.firstname"/></p>
		<p>Pseudo : <s:property value="client.pseudo"/></p>
		<p>Mot de passe : ******</p>
		<s:a action="client-all" class="btn btn-info mt-5 mb-3">
			Retour � la liste
		</s:a>
	</div>
</div>

<%@ include file="../_include/jsp-end.jsp" %>