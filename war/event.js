$(document).ready(function(){
      $('#signup').click(function(){
		  console.log("signup is clicked");
		$(this).attr('data-toggle','modal');
		$(this).attr('data-target','#myModal');
	});
$('#confirm').click(function(){
		   alert("coming inside click event");
		   var email=$('#email').val();
		   var username=$('#name').val();
		   console.log(email);
		   console.log(username);
		     $.ajax({
		    	 url:'/mailconfirm',
		    	 type:'POST',
		    	 dataType:'json',
		    	  async:false,
		    	 data:{"email":email,"username":username},
		    	 success:function(data){
		    		 console.log(data); 
		    		alert(data["username"]+" thanks for the response"); 
		    	 },
		    	 error:function(data){
		    		 console.log(data);
		    		 alert("Sorry Couldnot process your request ");
		    	 }
		     }); // ajax closes here
			}); // confirm click event closes here 
}); // ready function closes here
