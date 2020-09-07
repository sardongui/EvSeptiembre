<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-hidden path="investmentRoundId" />
	<acme:form-hidden path="finalMode" />
	<acme:form-textbox code="entrepreneur.dormit.form.label.text" path="text"/>
	
	<acme:form-submit test="${command == 'show' && finalMode == false}" code="entrepreneur.dormit.form.button.update"
		action="/entrepreneur/dormit/update" />
	<acme:form-submit test="${command == 'show' && finalMode == false}" code="entrepreneur.dormit.form.button.delete"
		action="/entrepreneur/dormite/delete" />
	<acme:form-submit test="${command == 'create'}" code="entrepreneur.dormit.form.button.create"
		action="/entrepreneur/dormit/create" />
	<acme:form-submit test="${command == 'update' && finalMode == false}" code="entrepreneur.dormit.form.button.update"
		action="/entrepreneur/dormite/update" />
	<acme:form-submit test="${command == 'delete' && finalMode == false}" code="entrepreneur.dormit.form.button.delete"
		action="/entrepreneur/dormit/delete" />
	

	<acme:form-return code="entrepreneur.dormit.form.button.return" />
</acme:form>
