<%@ page import="javax.ws.rs.core.Response" %>
<%@ page import="org.jboss.resteasy.client.jaxrs.ResteasyClient" %>
<%@ page import="org.jboss.resteasy.client.jaxrs.ResteasyWebTarget" %>
<%@ page import="org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder" %>
<%@ page import="beans.MyBean" %>
<%@ page import="javax.ws.rs.core.MediaType" %>
<%--
  Created by IntelliJ IDEA.
  User: dima-olya
  Date: 10.04.16
  Time: 0:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
        <%
            ResteasyClient client = new ResteasyClientBuilder().build();
            ResteasyWebTarget target = client.target("http://localhost:9090/project/rest/testRest");
            Response responseRest = target.request(MediaType.APPLICATION_JSON).get();
            String value = responseRest.readEntity(String.class);
            out.println(value);
            responseRest.close();
        %>
</body>
</html>
