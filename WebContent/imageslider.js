function changecolor()

var isPasswordVaild = false;
var isEmailValid = false;
var isPhoneValid = false;
var isConfirmPassword = false;


function validate()
{
	var myForm = document.forms["regForm"];
	var name = myForm["name"].value;
	var password = myForm["password"].value;
	var confirmpassword = document.forms["regForm"]["confirmpassword"].value;
	var ship = document.forms["regForm"]["shippingaddress"].value;
	var bill = document.forms["regForm"]["billingaddress"].value;
	var email = document.forms["regForm"]["email"].value;
	var phone = document.forms["regForm"]["phone"].value;
	if(name.length<1 || ship.length<1 || bill.length<1 || email.length<1 || phone.length<1 || password.length<1 || confirmpassword.length<1)
		{
			alert("Please fill in all the fields.");
			return false;		
		}
	else
		{
		if(isPasswordVaild && isEmailValid && isPhoneValid){
			alert("Good!");
			return true;
		}
		else{
			alert("Please fill in the correct form details.");
			return false;	
		}
			alert("You have registered successfully");
			return true;
			
		}
	
}
function validateemail()
{
	var email1 = document.forms["regForm"]["email"].value;
	var atpos = email1.indexOf("@") +1;
	var dotpos = email1.lastIndexOf(".") +1;
	var emailerror = document.getElementById("tdemail");
	console.log(email1);
	console.log(emailerror);
	
	console.log(atpos," ** ", atpos<4);
	console.log(dotpos+3," ** ", email1.length, " ** ", dotpos<atpos+4);
	console.log(dotpos," ** ", atpos+4 , " ** ",dotpos+4>=email1.length);
	console.log(dotpos," ** ",dotpos+4, email1.length,dotpos+4<=email1.length);
	
	if(atpos<4 || dotpos<atpos+4 || !((dotpos+3)==(email1.length)))
		{
			isEmailValid = false;
			emailerror.innerHTML = "Please enter a valid email ID.";
		}	
	else
		{
			isEmailValid = true;
			emailerror.innerHTML = "";
		}
	return isEmailValid;
}
function validatephone()
{
	var phone = document.forms["regForm"]["phone"].value;
	var phoneerror = document.getElementById("tdphone");
	if(phone.length<10)
		{
			phoneerror.innerHTML = "Please enter a valid phone number.";
		}
	else
		{
			isPasswordVaild = true;
			phoneerror.innerHTML = "";
		}
	return isPhoneValid;
}
function validatepassword()
{
	var password2 = document.forms["regForm"]["password"].value;
	console.log(password2);
	var passworderror = document.getElementById("tdpassword");
	var pwdregex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
	if(!(password2.match(pwdregex)))
		{
			passworderror.innerHTML = "Password should contain a minimum of 1 digit, 1 lower case and 1 upper case letter.";
			isPasswordVaild = false;
		}
	else{
			isPasswordVaild = true;
			passworderror.innerHTML = "";
	}
	return isPasswordVaild;
}
function validateconfirmpassword()
{
	var password = document.forms["regForm"]["password"].value;
	console.log(password," ddsfcsd");
	var confirmpassword1 = document.forms["regForm"]["confirmpassword"].value;
	console.log(confirmpassword1, " jdsyfcisd");	
	var confirmpassworderror = document.getElementById("tdconfirmpassword");
	//console.log(!(password.match(confirmpassword1)) , " *** ",(password.match(confirmpassword1)));
	if(password!=confirmpassword1)
	{
		confirmpassworderror.innerHTML = "Passwords do not match.";
	}
	else
	{
		isConfirmPassword = true;
		confirmpassworderror.innerHTML = "";
	}
	return isConfirmPassword;
}
window.onload = function(){ 
    document.getElementById('sliderbutton1').onclick = function(e){
    	var tag = document.getElementById('sliderbutton1');
    	console.log(tag.src + "sample!!");
    	if(tag.src == "Images/heartgreen.png")
    		{
    		 console.log("Hello");
    		 tag.src="Images/purple.png";		
    		 tag.style.height="20px";
    		 tag.style.width="20px";
    		}		
    	else if(tag.src == "Images/purple.png")
    		{
    		 tag.src="Images/heartgreen.png";		
    		 tag.style.height="20px";
    		 tag.style.width="20px";
    		}
	var image = document.getElementById('sliderimage1');
	image.src="Images/Wand2.jpg";
	image.style.height="300px";
	image.style.width="500px";
	 }
    document.getElementById('sliderbutton2').onclick = function(e){
		 this.src="Images/purple.png";		
		 this.style.height="20px";
		 this.style.width="20px";
	var image = document.getElementById('sliderimage1');
	image.src="Images/hogwarts1.jpg";
	image.style.height="300px";
	image.style.width="500px";
	 }
    document.getElementById('sliderbutton3').onclick = function(e){
		 this.src="Images/purple.png";		
		 this.style.height="20px";
		 this.style.width="20px";
	var image = document.getElementById('sliderimage1');
	image.src="Images/book1.JPG";
	image.style.height="300px";
	image.style.width="500px";
    }
    document.getElementById('sliderbutton4').onclick = function(e){
		 this.src="Images/purple.png";		
		 this.style.height="20px";
		 this.style.width="20px";
	var image = document.getElementById('sliderimage1');
	image.src="Images/owl1.jpg";
	image.style.height="300px";
	image.style.width="500px";
    }
    
}

 
