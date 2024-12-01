
<html>
    <head>
        <script language="JavaScript">
            let request = null;
            function one(){
                request = new XMLHttpRequest();
                request.onreadystatechange = two;
                request.open("get","GetTime",true);
                request.send(null);
            }
            function two() {
                if (request.status === 200 && request.readyState === 4) { // Fixed spelling of 'request'
                    document.getElementById("data").innerHTML = request.responseText;
                } else {
                    document.getElementById("data").innerHTML = "request failed";
                }
            }

        </script>
    </head>
    <body>
        <h1>AJAX-Example</h1>
        <a href="GetTime">current-time</a>
        <button onclick="one()">get time</button>
        <div id="data">current-time...</div>
    </body>
</html>
