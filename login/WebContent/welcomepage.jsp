
<!DOCTYPE html>
<%@taglib uri-"http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content= "IE=edge">
<meta http-equiv="Pragma" content= "no-cache">
<meta http-equiv="Cache-Control" content= "no-cache">
<meta http-equiv="Expires" content= "sat,01 Dec 2001 00:00:00 GMT">
<title>Sell N Buy Mobile Solutions</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">

</head>
<body>
<div role="navigation">
 <div class="navbar navbar-inverse">
   <a href="/welcome" class="navbar-brand">Sell N Buy</a>
    <div class="navbar-collapse collapse">
      <ul class="nav navbar-nav">
        <li><a href="#"> Login</a></li>
        <li><a href="/register"> New Registration</a> </li>
        <li><a href="#"> All Users</a> </li>
        
      </ul></div>
 </div>
</div>

<div class="container" id="homediv">
 <div class="jumbotron text-center">
    <h1>Welcome to Sell N Bye</h1>
    </div>
    </div>
    
    </c:when>
    <c:when test="$(mode=='MODE_REGISTER')">
    
    <div class="container text-center">
    <h3>New Registration</h3>
    <hr>
    <form class="form-horizontal" method="POST" action="save-user">
     <input type="hidden" name="id" value="$(user.id)"/>
     <div class="form-group">
      <label class="control-label-col-md-3">Username</label>
      <div class="col-md-7">
       <input type="text" class="form-control" name="username" value="$(user.username)"/>
       </div>
       </div>
        <div class="form-group">
         <label class="control-label-col-md-3"> First Name</label>
         <div class="col-md-7">
           <input type="text" class="form-control" name="firstname" value="$(user.firstname)"/>
         </div>
         </div>
         <div class="form-group">
         <label class="control-label-col-md-3"> Last Name</label>
         <div class="col-md-7">
          <input type="text" class="form-control" name="lastname" value="$(user.lastname)"/>
          </div>
         </div>
         
         <div class="form-group">
         <label class="control-label-col-md-3"> Age</label>
         <div class="col-md-7">
          <input type="text" class="form-control" name="age" value="$(user.age)"/>
          </div>
         </div>
         
         <div class="form-group">
         <label class="control-label-col-md-3"> Password</label>
         <div class="col-md-7">
          <input type="text" class="form-control" name="password" value="$(user.password)"/>
          </div>
         </div>
         
       </form>
    </div>
    <script src="static/js/jquery-1.11.1.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>