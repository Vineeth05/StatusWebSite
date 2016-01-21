$(document).ready(function(){
	setButtons();
});
function setButtons(){
	$.getJSON('getAll',function(json){
	    console.log("coming inside getall ajax method");
		console.log(json); 
		if(json[0]!==null || json[1]!==null || json[2]!==null || json[3]!==null){
			for(var i=0;i<4;i++){
				for(var j=0;j<json[i].length;j++){
					var Id=json[i][j]["buttonValue"];
					 $(document).find(Id).removeClass("glyphicon-signal glyphicon-plus");
					    $(document).find(Id).addClass("glyphicon-off signal-off");
				}
			}	
		}
	});
}

