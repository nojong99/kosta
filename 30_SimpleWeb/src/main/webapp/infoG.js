var userEventHandling = function() {
	var in1 = document.querySelector("#num").value;
	var num1 = parseInt(in1);
	var t="";
	for(let i= 1; i<=9; i++){
		t += num1 +" * " + i +"= "+num1*i +"\n"
	}
	document.querySelector("div").innerText = t
}

window.onload = function(){
	document.querySelector("#num").addEventListener("change", userEventHandling);
};