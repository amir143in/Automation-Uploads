function fn(){
	
	var config = {
		name: "Raghav",
		tokenID: "772e2da976e5bbee63e3586cf04d16be340776ad0d32bae06a65b35bfd4f4329"
	};
	
	var env = karate.env;
	karate.log("El valor de env es :: " + env);
	
	if(env=='qa'){
		config.baseURL = "https://petstore.swagger.io/"
	}
	
	karate.configure('connectTimeout',10000);
	karate.configure('readTimeout',10000);
	
	return config;
	
}