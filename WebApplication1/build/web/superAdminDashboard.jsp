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
        <h1>Super Admin Dashboard</h1>
        <div>
            <hr>
            <pre>
                <a href="state-account.jsp">Create-state-account</a>
                <a href="">View-state-accounts</a>
                <a href="">Create-user-accounts</a>
                <a href="">View-all-state-data</a>
                <a href="processRequest">Logout</a>
            </pre>
            <hr>
        </div>
    </body>
</html>
