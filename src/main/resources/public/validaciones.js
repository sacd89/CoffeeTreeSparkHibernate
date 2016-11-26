function login () {

	var usuario = document.getElementById("user1").value;
	var clave = document.getElementById("password").value;

	if ((usuario != "") && (clave != "")){
	   return true;
	} else {
		  alert("Usuario/Contrase;a incorrecta");
		return false;
	}

}
