<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="ACTION.Details" %>
   <%@ page import ="java.util.*"%>
   <%@ page import="java.sql.*" %>
   <%@page import="beans.TestingMobileClearance" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" rel="Stylesheet"></link>
<script src="YourJquery source path"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js" ></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>

  
<body>
<h2>Select the Furnishing number:</h2>



<script>
   
    function fnClear(){
    	var sub=document.getElementById("furnishingno");
    	if (sub.value=="enter furnishingNo"){
    		sub.value="";
    		sub.style.backgroundColor="yellow";
    	}
    }
    function fnIsEmpty(){
    	var subtle=document.getElementById("furnishingno");
    	if(subtle.value==""){
    		alert("Furnishing No. can't be Empty");
    		
    	}
    }
    function fnChangeColor(){
    	var subtle=document.getElementById("furnishingno");
    	subtle.style.backgroundColor="white";
    }
function somethin(){
	
	var furnishingNo=$('input[name=furnishingNo]').val();
    var formdata={furnishingNo: furnishingNo};
	$.ajax({
		url:"stageintervalfind",
		type:'POST',
		data:formdata,
	   success: function(data){
		   var $table  =  $('<table border="1"><tr><td><b>SubstageDescription</td><td><b>TestingStartDate</td><td><b>TestingEndDate</b></td><td><b>remarks</b></td></tr></table>');

		   for(var i in data.stageDescList)
		   {
		       console.log("received broadcast: " + ", " + data.stageDescList[i]);
		       var $tr =  $('<tr> </tr>');
		       var $td0 =  $('<td> </td>');
		       var $td1 =  $('<td> </td>');
		       var $td2 =  $('<td> </td>');
		       var $td3 =  $('<td> </td>');
		       $td0.append(data.stageDescList[i]);
		       $td1.append(data.testingStartDateList[i]);
		       $td2.append(data.testingEndDateList[i]);
		       $td3.append(data.remark[i]);
		       $tr.append($td0);
		       $tr.append($td1);
		       $tr.append($td2);
		       $tr.append($td3);
		       $table.append($tr);
		   }

		   $('div#target').empty().append($table);
		   
		   

		   }
	   });
	   }
	   
</script>
    
		<input type="text" id="furnishingno" onfocus="fnClear()" onblur="fnIsEmpty()" onchange="fnChangeColor()" placeholder="enter furnishingNo" name="furnishingNo" maxlength="100" required> 
        <input type="submit"  value="Confirm" name="SUBMIT" id="submitBtn" onClick="return somethin(this.form)">
  
<div id="target"></div>  
		       
				

</body>
</html>