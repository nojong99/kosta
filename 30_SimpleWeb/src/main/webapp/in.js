// 모든 html element를 메모리에 로딩 후 마지막에 실행 콜백
var userEventHandling = function(){
	var optionData = document.querySelector("#sel").value;
	var m = "";
	for(let i=1; i<10; i++){
		m += optionData+" * "+i + " = " + optionData*i +"\n";
	}	
	document.querySelector("div").innerText = m;
}

onload = function(){
	var inputId = document.querySelector("#in");
	inputId.type="number";
	inputId.max="9";
	inputId.min="2";
	var selectOption = document.querySelector("select");
	var optionData = "<option>구구단 선택</option>";
	for(let i =2; i<10; i++){
		optionData +="<option>"+i+"</option>";
	}
	selectOption.innerHTML=optionData;
	document.querySelector("#sel").addEventListener("change",userEventHandling);
}
 