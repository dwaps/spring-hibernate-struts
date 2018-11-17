<%@ include file="../_include/jsp-start.jsp" %>

<div class="row">
	<div class="col text-center mt-3">
		<h3>Editer le client</h3>
		<div class="row">
			<div class="col col-sm-4 offset-sm-4 m-1 m-auto">
				<%@ include file="../_include/client/form.jsp" %>
			</div>
		</div>
		<s:a action="client-all" cssClass="btn btn-info mt-5 mb-3">
			Retour à la liste
		</s:a>
	</div>
</div>

<%@ include file="../_include/jsp-end.jsp" %>