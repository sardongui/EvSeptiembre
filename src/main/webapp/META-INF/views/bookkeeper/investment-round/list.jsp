<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="bookkeeper.investment-round.list.label.title" path="title" width="60%" />
	<acme:list-column code="bookkeeper.investment-round.list.label.amountMoney" path="amountMoney" width="40%" />
</acme:list>