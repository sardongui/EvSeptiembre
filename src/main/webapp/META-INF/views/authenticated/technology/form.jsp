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

<acme:form readonly="true">
	<acme:form-textbox code="authenticated.technology.form.label.title" path="title" />
	<acme:form-textbox code="authenticated.technology.form.label.activitySector" path="activitySector" />
	<acme:form-textbox code="authenticated.technology.form.label.inventorName" path="inventorName" />
	<acme:form-textarea code="authenticated.technology.form.label.description" path="description" />
	<acme:form-url code="authenticated.technology.form.label.webSite" path="webSite" />
	<acme:form-email code="authenticated.technology.form.label.email" path="email" placeholder="user@domain"/>
	<acme:form-textbox code="authenticated.technology.form.label.indication" path="indication" />
	<acme:form-textbox code="authenticated.technology.form.label.stars" path="stars" />
	
	<acme:form-return code="authenticated.technology.form.button.return" />
</acme:form>