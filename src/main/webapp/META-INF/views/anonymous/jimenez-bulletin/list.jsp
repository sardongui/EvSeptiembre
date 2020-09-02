<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.jimenez-bulletin.list.label.moment" path="moment" width="20%" />
	<acme:list-column code="anonymous.jimenez-bulletin.list.label.heroName" path="heroName" width="20%" />
	<acme:list-column code="anonymous.jimenez-bulletin.list.label.phrase" path="phrase" width="60%" />
</acme:list>