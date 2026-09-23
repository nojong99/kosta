var userEventHandling = function() {
	var in1 = document.querySelector("#hour").value;
	var time = parseInt(in1);
	var result;
	// document.querySelector("div").innerText를 변수선언
	
	if (time>=9 && time<13){
		result ="오전 수업 시간";
	}else if(13<=time && time<14){
		result="점심 시간";
	}else if(time>=14 && time<18){
		result="오후 수업 시간";
	}else if(time<=24){
		result="자유 시간";
	}else{
		result="24이하로 넣어주세요.";
	}
	
	document.querySelector("div").innerText = result;
}

window.onload = function(){
	document.querySelector("#hour").addEventListener("change", userEventHandling);
};