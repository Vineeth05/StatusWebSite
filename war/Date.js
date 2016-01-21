function setDate(){
	var month=['January','Febuary','March','April','May','June','July','August','September','October','November','December'];
	var date8=new Date();
	date8.setDate(date8.getDate()-8);
	date8.setMonth(date8.getMonth()+1);
	var date7=new Date();
	date7.setDate(date7.getDate()-7);
	var date6=new Date();
	date6.setDate(date6.getDate()-6);
	var date5=new Date();
	date5.setDate(date5.getDate()-5);
	var date4=new Date();
	date4.setDate(date4.getDate()-4);
	var date3=new Date();
	date3.setDate(date3.getDate()-3);
	var date2=new Date();
	date2.setDate(date2.getDate()-2);
	var date1=new Date();
	date1.setDate(date1.getDate()-1);
	var today=new Date();
	today.setDate(today.getDate());
	console.log(("0"+today.getDate()).slice(-2)+'/'+month[date7.getMonth()]+'/'+date7.getFullYear());
	// setting date for each column in the table
	  document.getElementById("17th").innerHTML =("0"+date7.getDate()).slice(-2)+'/'+month[date7.getMonth()]+'/'+date7.getFullYear();
	  document.getElementById("18th").innerHTML =("0"+date6.getDate()).slice(-2)+'/'+month[date6.getMonth()]+'/'+date6.getFullYear();
	  document.getElementById("19th").innerHTML =("0"+date5.getDate()).slice(-2)+'/'+month[date5.getMonth()]+'/'+date5.getFullYear(); 
	  document.getElementById("20th").innerHTML =("0"+date4.getDate()).slice(-2)+'/'+month[date4.getMonth()]+'/'+date4.getFullYear();
	  document.getElementById("21th").innerHTML =("0"+date3.getDate()).slice(-2)+'/'+month[date3.getMonth()]+'/'+date3.getFullYear();
	  document.getElementById("22th").innerHTML =("0"+date2.getDate()).slice(-2)+'/'+month[date2.getMonth()]+'/'+date2.getFullYear();
	  document.getElementById("23th").innerHTML =("0"+date1.getDate()).slice(-2)+'/'+month[date1.getMonth()]+'/'+date1.getFullYear();
	  document.getElementById("24th").innerHTML =("0"+today.getDate()).slice(-2)+'/'+month[today.getMonth()]+'/'+today.getFullYear();
	  
	  //setting button id for fullclient elements
	  document.getElementById("fullclient-17").id="fullclient-"+("0" + date7.getDate()).slice(-2);
	  document.getElementById("fullclient-18").id="fullclient-"+("0" + date6.getDate()).slice(-2);
	  document.getElementById("fullclient-19").id="fullclient-"+("0" + date5.getDate()).slice(-2);
	  document.getElementById("fullclient-20").id="fullclient-"+("0" + date4.getDate()).slice(-2);
	  document.getElementById("fullclient-21").id="fullclient-"+("0" + date3.getDate()).slice(-2);
	  document.getElementById("fullclient-22").id="fullclient-"+("0" + date2.getDate()).slice(-2);
	  document.getElementById("fullclient-23").id="fullclient-"+("0" + date1.getDate()).slice(-2);
	  document.getElementById("fullclient-24").id="fullclient-"+("0" + today.getDate()).slice(-2);
	  //setting button id for switchboard
	  document.getElementById("switchboard-17").id="switchboard-"+("0" + date7.getDate()).slice(-2);
	  document.getElementById("switchboard-18").id="switchboard-"+("0" + date6.getDate()).slice(-2);
	  document.getElementById("switchboard-19").id="switchboard-"+("0" + date5.getDate()).slice(-2);
	  document.getElementById("switchboard-20").id="switchboard-"+("0" + date4.getDate()).slice(-2);
	  document.getElementById("switchboard-21").id="switchboard-"+("0" + date3.getDate()).slice(-2);
	  document.getElementById("switchboard-22").id="switchboard-"+("0" + date2.getDate()).slice(-2);
	  document.getElementById("switchboard-23").id="switchboard-"+("0" + date1.getDate()).slice(-2);
	  document.getElementById("switchboard-24").id="switchboard-"+("0" + date1.getDate()).slice(-2);
	  
	  //setting button id for distributed source
	  
	  document.getElementById("distributedsource-17").id="distributedsource-"+("0" + date7.getDate()).slice(-2);
	  document.getElementById("distributedsource-18").id="distributedsource-"+("0" + date6.getDate()).slice(-2);
	  document.getElementById("distributedsource-19").id="distributedsource-"+("0" + date5.getDate()).slice(-2);
	  document.getElementById("distributedsource-20").id="distributedsource-"+("0" + date4.getDate()).slice(-2);
	  document.getElementById("distributedsource-21").id="distributedsource-"+("0" + date3.getDate()).slice(-2);
	  document.getElementById("distributedsource-22").id="distributedsource-"+("0" + date2.getDate()).slice(-2);
	  document.getElementById("distributedsource-23").id="distributedsource-"+("0" + date1.getDate()).slice(-2);
	  document.getElementById("distributedsource-24").id="distributedsource-"+("0" + date1.getDate()).slice(-2);

	  //setting button id for answerconnect
	  
	  
	  document.getElementById("answerconnect-17").id="answerconnect-"+("0" + date7.getDate()).slice(-2);
	  document.getElementById("answerconnect-18").id="answerconnect-"+("0" + date6.getDate()).slice(-2);
	  document.getElementById("answerconnect-19").id="answerconnect-"+("0" + date5.getDate()).slice(-2);
	  document.getElementById("answerconnect-20").id="answerconnect-"+("0" + date4.getDate()).slice(-2);
	  document.getElementById("answerconnect-21").id="answerconnect-"+("0" + date3.getDate()).slice(-2);
	  document.getElementById("answerconnect-22").id="answerconnect-"+("0" + date2.getDate()).slice(-2);
	  document.getElementById("answerconnect-23").id="answerconnect-"+("0" + date1.getDate()).slice(-2);
	  document.getElementById("answerconnect-24").id="answerconnect-"+("0" + date1.getDate()).slice(-2);

}
window.onload=setDate;