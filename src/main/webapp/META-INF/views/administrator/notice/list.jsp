<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="anonymous.notice.list.label.headerPicture" path="headerPicture" width="40%" />
	<acme:list-column code="anonymous.notice.list.label.title" path="title" width="40%" />
</acme:list>