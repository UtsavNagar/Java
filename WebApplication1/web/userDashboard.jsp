<%
    String userid = (String) session.getAttribute("userid");
    if(userid == null){
        response.sendRedirect("index.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Super-Admin</title>
    </head>
    <body>
        <h1>User Dashboard</h1>
        <div>
            <hr>
            <h3>All links</h3>
            <a href="showCases.jsp">Show Cases</a>
            <hr>
        </div>
    </body>
</html>
