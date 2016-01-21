<!DOCTYPE html>
<html>
 <head>
 <title>Admin</title>
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="style.css" type="text/css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="bootstrap-clockpicker.css">
        <link rel="stylesheet" href="datepicker.css">
<script src="bootstrap-clockpicker.js" type="text/javascript"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="Date.js" type="text/javascript"></script> 
</head>
<body>
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">
  <form class='form-horizontal'  id='subform' method='post'>
    <!-- Modal content-->
  <div class="modal-content">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Problem details</h4>
      </div>
      <!--  body of the problem form -->
      <div class="modal-body">
        <div class="form-group row well">
        <label for="starttime" class="col-lg-2 control-label">StartTime:</label>
    <div class="input-group clockpicker">
    <input type="text" class="form-control" id="starttime" required>
    <span class="input-group-addon">
        <span class="glyphicon glyphicon-time"></span>
    </span>
</div>
   </div>
          <div class="form-group row well">
        <label for="endtime" class="col-lg-2 control-label">EndTime:</label>
        <div class="input-group clockpicker">
    <input type="text" class="form-control" id="endtime" required>
    <span class="input-group-addon">
        <span class="glyphicon glyphicon-time"></span>
    </span>
</div>
   </div> 
       <div class="form-group row well">
         <label for="date" class="col-lg-2 control-label">Date:</label>
        <div class="col-lg-3 hero-unit" style="z-index:6000;"><input type="text" class="form-control" id="date" required></div>             
        </div>
         <div class="form-group row well">
        <label for="Problemdetails" class="col-lg-3 control-label">ProblemDetails:</label>
        <div class="col-lg-8"><textarea class="form-control" id="problemdetails"></textarea></div>
        </div>
        <div class="form-group row well">
       <div style='margin-left:40px;'>
<label><input type="checkbox" name='email' value='Send'> Send Email</input></label></div>
        </div>
        </div>
      </div> 
      <div class="modal-footer">
        <input type="submit" class="btn btn-default" data-dismiss="modal" style="background-color:green" id="confirm"></input><button type="button" class="btn btn-default" data-dismiss="modal" style="background-color:red!important;color:black">Close</button>
        <button type="button" class="btn btn-default" data-dismiss="modal"  id="modalnothing" style="background-color:orange">No Issues found </button>
     </div>
      </form>
      </div>
    </div>
    <div class="modal fade text-center" id="secmodal" role="dialog" style="position:fixed;top:15% !important;left:20% !important;z-index:6000 !important; width:60%;">
    <div class="modal-content">
     <div class="modal-header">
     <button type="button" class="close" data-dismiss="modal">&times;</button>
       <h3 class="text-primary text-left">Incident as reported</h3>
     </div>
      <div class="modal-body well"> 
      <div class="row" style="background-color:#2E8B57;">
      <p><b>This page provides status information on services that are part of the Cloud Platform.Check back here to view the current status of the services listed below.For additional information on services,please visit </b><a href="www.fullcreative.com" style="color:red;">fullcreative.com.</a></p>
      </div>
     <div id="secbody" style="padding:10px;"></div> 
     <ul class="list-group" id="todo-update-area">                 
     </ul> 
     </div> 
    <div class="modal-footer">   
      <div class="row">
   <div class="col-lg-6"> <div class="input-group clockpicker" data-placement="left" data-align="right" data-autoclose="true" style="z-index:6000 !important;"><input type="text" class="form-control" size="10" id="update-time"  required><span class="input-group-addon">
     <span class="glyphicon glyphicon-time"></span></span></div></div>
        
        <div class="col-lg-6">
    <div class="input-group"><input type="text" class="form-control" id="todoInput" autofocus placeholder="put issue details here" size="20">
              <span class="input-group-btn">
               <span class="btn btn-success glyphicon glyphicon-plus" type="button" id="taskadd"></span>
                   </span></div>
                   </div>
      </div> 
    </div>   
   </div> 
   </div>   
<!-- container body -->  
<div class="container">
      <div class="row">
        <div class="col-lg-1">
          <a href="http://www.fullcreative.com/"><img src="https://photos-6.dropbox.com/t/2/AAAuPVrxgphgvV3TJAzsmt2lrtXb2u_ORDC6o2O7TxKsRA/12/466305856/jpeg/32x32/1/_/1/2/full.jpg/ELvv_eIDGBwgBygH/o7g7ZuxfSb2D2qQ-6Sf3IHPXG2nC60vQSTaa0rneMYg?size=1024x768&size_mode=3" alt="chelsea logo" class="logoImg"> </a>
        </div>
        <div class="col-lg-10 text-primary text-left text-uppercase headerTitle"> <a href="http://www.fullcreative.com/"><h1>Full Creative</h1></a></div>
      </div>
      <div class="row">
        <div class="col-lg-12 about" ><h3 class="text-primary text-left">Monitors the status of our web sites and checks whether they are down or not.<h3></div>
       </div>
      <div class="row" style=" padding-top:30px" id="tablecontent" >
        <table class="table table-bordered well">
  <thead>
    <tr>
      <th class="col-lg-2">Content Delivery Networks</th>
      <th class="col-lg-1" id="17th"></th>
      <th class="col-lg-1" id="18th"></th>
      <th class="col-lg-1" id="19th"></th>
      <th class="col-lg-1" id="20th"></th>
      <th class="col-lg-1" id="21th"></th>
      <th class="col-lg-1" id="22th"></th>
      <th class="col-lg-1" id="23th"></th>
      <th class="col-lg-1" id="24th"></th> 
    </tr>
  </thead>
  <tbody>
    <!-- full client row -->
    <tr id="fullclient">
      <th>Full Client</th>
      <td ><button id="fullclient-17" class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" ></button></td>
       <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="fullclient-18"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="fullclient-19"></button></td>
     <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="fullclient-20"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="fullclient-21"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="fullclient-22"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="fullclient-23"></button></td>
            <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="fullclient-24"></button></td>      
    </tr>
    <!-- switch board row -->
    <tr id="switchboard">
      <th >Switch Board</th>
      <td><button class="btn btn-block btn-lg button-custom glyphicon glyphicon-plus" id="switchboard-17"></button></td>
      <td><button class="btn btn-block btn-lg button-custom glyphicon glyphicon-plus" id="switchboard-18"></button></td>
      <td><button class="btn btn-block btn-lg button-custom glyphicon glyphicon-plus" id="switchboard-19"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="switchboard-20"></button></td>
      <td ><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="switchboard-21"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="switchboard-22"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="switchboard-23" ></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus"  id="switchboard-24"></button></td>
    </tr>

    <!-- distributedsource row -->
    <tr id="distributedsource">
      <th>Distributed Source</th>
      <td ><button class="btn btn-block btn-lg button-custom glyphicon glyphicon-plus" id="distributedsource-17"></button></td>
      <td><button class="btn btn-block btn-lg button-custom glyphicon glyphicon-plus" id="distributedsource-18"></button></td>
       <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="distributedsource-19"></button></td>
       <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus"  id="distributedsource-20"></button></td>
       <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="distributedsource-21"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="distributedsource-22"></button></td>
       <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="distributedsource-23"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="distributedsource-24"></button></td>
    </tr>

    <!-- answerconnect row -->
    <tr id="answerconnect">
      <th>Answer Connect</th>
      <td><button class="btn btn-block  btn-lg button-custom glyphicon glyphicon-plus" id="answerconnect-17"></button></td>
       <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="answerconnect-18"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="answerconnect-19"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus"  id="answerconnect-20"></button></td>
       <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="answerconnect-21"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="answerconnect-22"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="answerconnect-23"></button></td>
      <td><button class="btn btn-lg btn-block button-custom glyphicon glyphicon-plus" id="answerconnect-24"></button></td>
    </tr>
  </tbody>
</table>
      </div>
      <!-- bottom footer contents -->
      <div class="row" style="padding-top:70px;padding-bottom:20px">
          <div class="col-lg-6"><i class="glyphicon glyphicon-signal" style="color:green;font-size:25px"></i><h6>-Up and Running<h6></div>
          <div class="col-lg-6"><i class="glyphicon glyphicon-off" style="color:red;font-size:25px"></i><h6>-Idle<h6></div>
      </div>
    </div> 
    <script src="bootstrap-datepicker.js"></script>  
    <script type="text/javascript" src="getData.js"></script>
    <script type="text/javascript" src="script.js"></script>
     <script type="text/javascript">
    $('.clockpicker').clockpicker({
	    donetext: 'Done'	     
    });  
        $(document).ready(function () {
            
            $('#date').datepicker({
                format: "dd/mm/yyyy"
            });  
        
        });    
    </script> 
   <script type="text/javascript" src="issueAdd.js"></script>
    </body> 
</html> 
