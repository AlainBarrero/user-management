<%@include file = "/html/init.jsp" %> 

<%
	SubsConfiguration sconfig = (SubsConfiguration) renderRequest.getAttribute("sconfigInfo");
	String roles = (String) renderRequest.getAttribute("roles");
%>


<portlet:actionURL name="updateUserActivation" var="updateUserActivation"></portlet:actionURL>

<p>
	<strong>Suscripci�n:</strong> <%=sconfig.getDescription() %> <br>
	<strong>Coste:</strong>	<%=sconfig.getAmount() %> Euros <br>
	<strong>Periodicidad:</strong> <%=sconfig.getTime() %> <%=sconfig.getCycle() %> (s) <br>
	<strong>Roles:</strong> <%=roles %>
</p>

<aui:form action="<%=updateUserActivation%>" name="<portlet:namespace />mt" >
	<aui:input name="configurationId" type="hidden" value="<%=sconfig.getConfigurationId()%>"></aui:input>	
	<aui:button type="submit" value="Desactivar"/>
</aui:form>