$(document).ready(function(){
	var myproject={};
    $('button').click(function(){
        myproject.id='#'+$(this).attr('id');
      var flag=$(this).hasClass('glyphicon-plus');
       var flag1=$(this).hasClass('glyphicon-off');
       if(flag === true)
       {
       $(this).attr("data-toggle","modal");
       $(this).attr("data-target","#myModal")
     }
    else if(flag1 === true){
    	   var buttonId=myproject.id;  
    		 var len= buttonId.length;
    		 console.log(len);
    		 var temp=buttonId.substr(1,len-4);
    		 var url='/get'+temp;  
     	  $.getJSON(url,{id:myproject.id},function(json){ 
     		  console.log("function comes inside the getJSON");
     		  console.log("GetJson is working"+json);
     		  console.log(json["problemdetails"]);  
     		  /*var keys=Object.keys(json);
     		  keys.forEach(function(key){
     			  console.log(json[key]);
     		  });*/
     		  $('#secbody').html('<p><h5 class="text-left">The Problem on <b>'+json["date"]+'</b> started to occur at  <b>'+json["starttime"]+'</b> it ended at  <b>'+json["endtime"]+'.</b>It is Reported as follows:</h5></p><h5 class="text-left"><em>'+json["problemdetails"]+'</em></h5>');
                 $('#todo-update-area').empty();
     		  for(i=0;i<json["issueUpdated"].length;i++){
  			$('#todo-update-area').append('<li class="list-group-item"><b>'+json["issueUpdateTime"][i]+'</b>:      '+json["issueUpdated"][i]+'</li>');
     		  }
     	  });
    	  $(this).attr('data-toggle','modal');
    	  $(this).attr('data-target','#secmodal');
       }
     console.log(myproject.id); 
    }); // button click close
  $('#modalnothing').click(function(){
		  console.log("function comes in");
	      $(myproject.id).removeClass("glyphicon-plus");
	      $(myproject.id).addClass("glyphicon-signal signal-on");
	      console.log("function goes out");
	      $(myproject.id).removeAttr("data-toggle");
	      $(myproject.id).removeAttr("data-target");
});//nothing button click event function closes
    $('#confirm').click(function(){
    	console.log("entering confirm");
	 console.log("checkcheck");
	 var startTime=$('#starttime').val();
	 var endTime=$('#endtime').val();
	 var date=$('#date').val();
	 var sendMail=$('input[type=checkbox]').val();
	 var problemdetails=$('#problemdetails').val();			
	 var buttonId=myproject.id;
	 var len= buttonId.length;
	 console.log(len);
	 var temp=buttonId.substr(1,len-4);
	 var url='/'+temp;
	 console.log(url);
 var f=JSON.stringify({starttime:startTime,endtime:endTime,date:date,problemdetails:problemdetails,sendMail:sendMail});
 console.log(f);
 if(startTime!='' && endTime!='' && date!='' && problemdetails!=''){
  $.ajax({
	  url:url,
	  type:'post',
	    async:false,
	  dataType:'text',
	  data:{message:JSON.stringify({starttime:startTime,endtime:endTime,date:date,problemdetails:problemdetails,buttonValue:buttonId,sendMail:sendMail})},
	  success:function(data){
		  $('#myModal').modal('hide');
		  console.log(data);
		  console.log("varuthuthtu");
		  alert("successfully submitted");
          $('input[type="text"],textarea').val('');
          $('#subform')[0].reset();
          $(myproject.id).removeClass("glyphicon-plus");
	      $(myproject.id).addClass("glyphicon-off signal-off");
	      $(myproject.id).removeAttr("data-toggle");
	      $(myproject.id).removeAttr("data-target");
	  },
	  error:function(){
		  alert("sending the data failed");
	  }
  }); // ajax close
 }
 else{
	 alert("Please enter all the details");
 }
      }); // confirm click and ajax setting
  });  // ready function close