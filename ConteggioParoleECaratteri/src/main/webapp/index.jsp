<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scelta Azione</title>
</head>
<body>

	Inserisci la frase e scegli l'operazione:
	<form action="contaParole" method="post">
		<input type="text" name="frase" placeholder="Inserisci la frase"><br>
		<input type="submit" value="Conta parole">
	</form>
	
	<form action="contaVocali" method="post">
		<input type="text" name="frase" placeholder="Inserisci la frase"><br>
		<input type="submit" value="Conta vocali">
	</form>
	
	<form action="contaConsonanti" method="post">
		<input type="text" name="frase" placeholder="Inserisci la frase"><br>
		<input type="submit" value="Conta consonanti">
	</form>

</body>
</html>