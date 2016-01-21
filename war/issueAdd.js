$(document).ready(function(){
console.log("coming inside issue add function");
     var buttonId={};
	$('button').click(function(){
		buttonId.id='#'+$(this).attr('id');
	});
	console.log(buttonId.id);
	$('#taskadd').click(function(){
		var issueAdd=$('#todoInput').val();   
		var issueTime=$('#update-time').val();
		console.log("issue to be added is "+issueAdd+" "+issueTime);
		 var len= buttonId.id.length;
		 console.log(len);
		 var temp=buttonId.id.substr(1,len-4);  
		 /*var url='/get'+temp;*/                       
		 console.log("THE ID oF THE BUTTON IS"+temp); 		 
		 $.ajax({
			url:'edit',  
			type:'post',
			dataType:'json',
			async:false,
			data:{message:JSON.stringify({"issueAdd":issueAdd,"issueTime":issueTime,"buttonId":buttonId.id,"url":temp})},
			success:function(json){
				$('#todo-update-area').empty();		
				console.log(json);
				for(i=0;i<json["issueUpdated"].length;i++){
				$('#todo-update-area').append('<li class="list-group-item" style="padding-left:10px !important;color:grey;"><b>'+json["issueUpdateTime"][i]+'</b>:        '+json["issueUpdated"][i]+'</li>');
				}
			}
		});
	});
});
