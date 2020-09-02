<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="patron.banner.list.label.slogan" path="slogan" width="40%" />
	<acme:list-column code="patron.banner.list.label.url" path="url" width="60%" />
</acme:list>