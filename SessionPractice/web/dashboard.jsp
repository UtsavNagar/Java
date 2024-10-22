<%
    String userid = (String) session.getAttribute("userid");
    if(userid == null){
        response.sendRedirect("index.jsp");
    }
%>
<html>
    <body>
        <h1>User Dashboard</h1>
        <hr>
        <a href="ActiveCaseServlet">active-cases</a>
        <a href="RecoveredServlet">recovered-cases</a>
        <a href="DeathServlet">total-death</a>        
        <a href="LogoutServlet">logout</a>

    </body>
</html>
