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
        <h1>State admin Dashboard</h1>
        <div>
            <hr>
            <pre>
            <a href="saveStateInfo.jsp">Add-info-for-today</a>     
            <a href="">Update-info</a>
            <a href="StateDataServlet">View-info-for-own-state</a>       
            <a href="DataForAllState">View-info-for-all-state</a>
            <a href="EndSession">Log-out</a>
            </pre>
            <hr>
        </div>
    </body>
</html>
