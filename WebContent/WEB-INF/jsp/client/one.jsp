<%@ include file="../_include/jsp-start.jsp" %>

<div class="row">
	<div class="col text-center mt-3">
		<h3>D�tail du client</h3>
		<p>Nom : <s:property value="client.lastname"/></p>
		<p>Pr�nom : <s:property value="client.firstname"/></p>
		<p>Email : <s:property value="client.email"/></p>
		<p>Mot de passe : ******</p>
		<s:a action="client-all" cssClass="btn btn-info mt-5 mb-3">
			Retour � la liste
		</s:a>
	</div>
</div>

<%@ include file="../_include/jsp-end.jsp" %>