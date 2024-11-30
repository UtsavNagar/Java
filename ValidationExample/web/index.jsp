<html>
    <head>
        <script language="JavaScript">
            function checkName(){
                let name = document.getElementById("name").value;  
                
                if(name.length === 0){
                    alert("Name Filed is empty");
                    return false;
                }
                
                return true;
            }
            
            function checkAge(){
                let age = document.getElementById("age").value;
                
                if(isNaN(age) === false){
                    alert("Enter Valid Age");
                    return false;
                }
                
                if(age < 1 || age > 200){
                    alert("Enter valid age");
                    return false;
                }
                
                return true;
            }
            
            function check(){
                return checkName() && checkAge();
            }
        </script>
    </head>
    <body>
        <div>Register Form</div>
        <hr>
        <form action="saveUser" onsubmit="return check()">
            <pre>
                name        <input id="name" name="name" required>

                age         <input type="number" id="age" name="age" required>

                            <button type="submit" >Register</button>
            </pre>
        </form>
        <hr>
    </body>
</html>
