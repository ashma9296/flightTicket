<html>

<title>book flight price</title>
<body style="background-color: powderblue;">
	<h1 style="color: blue;">flight details</h1>
	TripType: ${s.triptype }
	<br /> To : ${s.to}
	<br /> From : ${s.from}
	<br /> Airlines: ${s.airlines}
	<br /> Price: ${s.price == -1 ? "N/A" : s.price}

	
</body>
</html>
