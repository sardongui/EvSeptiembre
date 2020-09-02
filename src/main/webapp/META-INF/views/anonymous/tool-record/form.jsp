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
	<acme:form-textbox code="anonymous.tool-record.form.label.title" path="title" />
	<acme:form-textbox code="anonymous.tool-record.form.label.sector" path="sector" />
	<acme:form-textbox code="anonymous.tool-record.form.label.inventor" path="inventor" />
	<acme:form-textarea code="anonymous.tool-record.form.label.description" path="description" />
	<acme:form-url code="anonymous.tool-record.form.label.web" path="web" />
	<acme:form-email code="anonymous.tool-record.form.label.email" path="email" placeholder="user@domain"/>
	<acme:form-textbox code="anonymous.tool-record.form.label.indication" path="indication" />
	<acme:form-textbox code="anonymous.tool-record.form.label.stars" path="stars" />
	
	<acme:form-return code="anonymous.tool-record.form.button.return" />
</acme:form>