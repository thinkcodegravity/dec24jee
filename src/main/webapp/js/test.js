substract(10,5);
var y=20;

function checkIfUseridAvaialable(){
	console.log("control is now in javascript");
	var uid=document.getElementById("uid").value;
	if(uid == "john" || uid=="jane")
		alert("userid is already taken");	
	
}

function mandatoryChecks(){
	var uid=document.getElementById("uid").value;
	var pwd=document.getElementById("pwd").value;
	if(uid=="" || pwd=="")
	{
		alert("userid and password are mandatory");
		return false;
	}
	return true;
}
function substract(a,b){
	console.log(" i am inside substract method :"+a +" , "+b);
	var sub=a-b; // arithmetic operator
	console.log("returning :"+sub)
	var x=10;
	console.log(x);
	
	var p= 10 > 5; // relational operator
	console.log( p);
	
	console.log ( 20==10 ); // equality operator
	
	// conditional operatora
	console.log( ( (10==20) || (5 < 8))  );
	
	var s=10;
	var t=20;
	
	if( s== t )
		console.log("s and t are same");
	else
		console.log("s and t are different");
	
	for(var i=0; i<5 ; i++){
		console.log("hi");
	}
	
	try{
			
	}catch(err){
		
	}finally{
		
	}
	
	return sub;
}	 

 /* java addition method
public int add(int a, int b){
	int sum=a+b;
	return sum;
}

method call
int result=add(10,20);

*/
// javascript addition method

function checkIfEmpty() {
	
	// read customer typed input in userid text box using javascript code
	//var useridTextbox=document.getElementById("uid").value;
	// read customer typed input in userid text box using jquery code
	var useridTextbox=$("#uid").val();
		
	//var passwordTextbox=document.getElementById("psw").value;
	var passwordTextbox=$(".psw").val();
	
	if(useridTextbox == "")
	{
		$("#uid").val(" PLEASE TYPE USERID ");
		$("#uid").css("background","yellow");
	//	document.getElementById("uid").style="background:red";
	//	alert("userid is mandatory");
		return false;
	}	
	else if(passwordTextbox == ""){
		alert(" PLEASE TYPE PASSWORD");
		$(".psw").css("background","yellow");
	//	document.getElementById("psw").style="background:red";
	//	alert("password is mandatory");
		return false;
	}
	return true;
}

function checkUser() {
	var ajaxJavascriptObject={
        url: '/checkUser',
        type: 'post',
        data: 'userid='+$("#uid").val(),
        context: this,
        success: function (data) {
               if(data=="unavailable")
		       alert("userid already taken");
        },
        error: function (data) {
                  console.log("failure");
        }
    };
    $.ajax(ajaxJavascriptObject);
}
function trackInput()
{
	console.log('clicked input element');
}	
/*
	$("input") = access by html element name
	$("#uid") = access by attribute id
	$(".classuid") = access by attribute class
*/
function readWriteJquery (){
	var cusTypedUserid=$("#uid").val();
	if(cusTypedUserid == "")
	{	
		$("#uid").css("background","red");
		$("#loginButton").fadeOut(10000);
		//$("#loginButton").hide();
	}
	else
		$("#loginButton").slideDown(10000);
		//$("#loginButton").show();
	
		//$("#uid").val("please type userid");
}
function checkUser (){
	
	var serverCommunicationObject={
	        url: '/checkUser',
	        type: 'post',
	        data: {
	                  userid:$("#uid").val()
			},
	        context: this,
	        success: function (data) {
	                  if(data == "unavailable")
				  		alert("userid already taken");
	        },
	        error: function (data) {
	                  console.log("failure");
	        }
	};
	
	$.ajax(serverCommunicationObject);	
	
	
}

function mouseIsOnUserid(){
	$("#uid").css("background","green");
	console.log("customer has placed mouse on userid text box");
}
function mouseIsOffUserid(){
	$("#uid").css("background","white");
	console.log("customer has  mouse from userid text box");
}

function trackUidPwdValue(){
	var u=$("#uid").val();
	var p=$(".psw").val();
	if( u == "" || p=="")
		$("#loginButton").slideUp(5000);   // 5000 milli sec= 5 sec     
	else
		$("#loginButton").slideDown(5000);        
	
}
// monitor, implement the code for 
// event listeners
$(document).ready(function() {

//	HTML webpage section / customer interaction(events) / javascript takes action
	$("#loginButton").        click				  (checkIfEmpty);
//	$("#uid").mouseenter(mouseIsOnUserid);
//	$("#uid").mouseenter(mouseIsOnUserid);
	// blur is opposite of focus/active
//	$("#uid").blur(trackUidPwdValue);
//	$(".psw").blur(trackUidPwdValue);
});

