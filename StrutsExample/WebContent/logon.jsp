<html>
<head>
<title>Quality Control</title>
<script>
	/*function validate()
	 {
	 varchar name=document.login.loginname;
	 varchar pass=document.login.loginpass;
	 if(name.value=="")
	 {
	 alert("Enter login Name");
	 return false;
	 }
	 else if(pass.value=="")
	 {
	 alert("Please enter the password");
	 return false;
	 }
	 else
	 {
	 document.login.action="/welcome.jsp";
	 document.login.submit();
	 }
	 }*/
</script>
<script>
	function fnpass() {
		if (document.login.loginname.value == "") {
			alert("Please Enter Name");
			document.location.reload();
		} else if (document.login.loginpass.value == "") {
			alert("Please Enter The Password");
			document.location.reload();
		}

		else {
			document.login.action = "#.jsp";
			document.login.submit();
		}
	}
</script>

</head>
<body bgcolor="106211239">
	<form id="login" name="login">
		<br>
		<table align="center">
			<tr>
				<td>
					<div align="center" width="100%">
						<font size="100" color="456745"><B>Quality Control</b></font>
					</div>
				</td>
			</tr>
			<tr>
				<td><font color="456745" size="5"><p align="center">Hyderabad</p></font></td>
			</tr>
			<tr>
				</td>
				<div
					style="border: 2px solid black; background: #896325; line-height: normal;">
					<font size="6" color="096"><marquee direction="left">
							<b>Welcome To Quality Control</b>
						</marquee></font>
				</div>
				</td>
			</tr>
			<table cellpadding="6" align="center" width="100%" height="60%"
				Style="margin-right: 100px;">
				<th>
					<table align="left" width="50%" height="98%"
						style="border: 2px solid black;">
						<th><img src="" /></th>
					</table>
					<table align="right" width="50%" height="98%"
						style="border: 2px solid black; background: #967423; padding-left: 6px;">
						<th>
							<h2>Admin Login</h2>
						<tr align="center">
							<td><b>Login name :</b><input type="text" name="loginname"
								width="100"></td>
						</tr>
						<tr align="center">
							<td><b>Password :&nbsp;&nbsp;&nbsp;&nbsp;</b><input
								type="password" name="loginpass" width="80"></td>
						</tr>
						<tr align="center">
							<td><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="submit" value="Login" onclick="fnpass()">&nbsp;&nbsp;<input
								type="reset" value="reset"></td>
						</tr>
						</th>
					</table>
				</th>
			</table>
			</tr>
			</td>
			<tr>
				<td><footer
						style="clear: both; border: 2px solid black; background: #896325; padding: 2; text-align: center; vertical-align: middle; line-height: normal; margin: 0; position: fixed; bottom: 0px; width: 100%">
						<b>Designed and Maintained By Giza</b>
					</footer>
			</tr>
			</td>
		</table>
	</form>
</body>
</html>
