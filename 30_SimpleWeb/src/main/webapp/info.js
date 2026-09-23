console.log('info.js');
//userEventHandling 이벤트를 처리하는 애
var userEventHandling = function() {
	var in1 = document.querySelector("#in1").value;
	var in2 = document.querySelector("#in2").value;
	document.querySelector("div").innerText = parseInt(in1)+parseInt(in2);
}

window.onload = function(){
	document.querySelector("#in2").addEventListener("change", userEventHandling);
};