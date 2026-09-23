var v1=10;
console.log(typeof v1);
v1 = 'hello';
console.log(typeof v1);
v1 = function(){}
console.log(typeof v1);
v1 = new Date();
console.log(typeof v1);
v1 = {}
console.log(typeof v1);
v1 = []
console.log(typeof v1, v1 instanceof Date, v1 instanceof Array);
v1=[10,20,30,'S','M'];
v1[10]='xxxxx';
for(let i=0; i<v1.length; i++){
	console.log(i, v1[i])
}


v1 = {age:10, name:'홍길동', print : function(){}}; // 클래스 없이 객체를 정의할 수 있다...
console.log(v1.name);	
for(let k in v1){
	console.log(k, v1[k], v1.k);
}
// 함수의 입력 자료형이 없다.
// 함수를 선언하면 - 자동으로 overloading -> 입력값의 다양성
// s는 배열
v1 = function(name, age){ // 함수를 처리하기 전에 원하는 매개인자 여부 확인
	if(arguments.length==2 && typeof name === 'string' && typeof age === 'number'){
		
	console.log(name, age, arguments.length);
	}
}

v1('jeon', 20)
v1()
v1(20,19,29,19,33)
v1([20,19,29,19,33])
v1({age:19, name:'hong'})