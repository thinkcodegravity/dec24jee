	 

test();
/* java addition method
public int add(int a, int b){
	int sum=a+b;
	return sum;
}

method call
int result=add(10,20);

*/
// javascript addition method
function add( a, b   ){
	var sum=a+b;
	return sum;
}

function test(){
	console.log(" i am printing on client sidde console");
	console.log("testing");
	var result=add(10,20);
	console.log("10 +20 :"+result);
	
	var a = 10;
	a="john";
	var cc='a';
	var b = false;
	var c = 10.0;
	var d = ["john", "jane","mike"];
	console.log( d[1] );
	var e = "hello";
	// javascript object(complex data type)
	var address = {
		city: "newyork", state: "ny", zip: 123, country:"usa"
	};
	/*
		public class Address{
			String city="newyork";
			String state="ny";
			int zip=123;
		}
	*/
	var student = {
		name: "john",
		age: 10,
		address: {
			city: "ny",
			zip: 123
		}
	};
	
	console.log("students zip:"+student.address.zip);
	
	try {
		console.log("in exception handling");
		var i = 0;
		console.log(abcd);
		console.log("1");
	} 
	catch (error){
		console.log("2");
	} 
	finally {
		console.log("3");
	}
	
	for (var j = 0; j < 5; j++) {
		console.log("hi:" + j);
	}

	var i = 0;
	if (i == 0) {
		console.log("i is zero");
	} else {
		console.log("i is non zero");
	}

	while (i < 2) {
		console.log("hello:" + i);
		i++;
	}
	 

}

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

