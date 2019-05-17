<html>
<head>
    <script src="js/jquery.min.js"></script>
    <script >
        $(function(){
          $("#btn").click(function(){
                // alert("console");
              $.ajax({
                  url:'response/ajaxTest',
                  dataType:'json',
                  type:'post',
                  data:'{"username":"username","password":"password"}',
                  contentType:"application/json;charset=UTF-8",
                  success:function(data){
                      alert(data);
                      alert(data.username);
                      alert(data.password);
                  }
              });
          })
        })
    </script>
</head>
<body>
<h2>Hello World!</h2>
    <a href="response/testReturnString">testReturnString</a>
<br>
    <a href="response/testVoid">testVoid</a>
<br>
    <a href="response/testReturnModelAndView">testReturnModelAndView</a>
<br>
    <button id="btn">ajax</button>
</body>
</html>
