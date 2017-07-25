/**
 * 
 */

function call() {
    m(60,3);        
}
function m(a,b){
	document.getElementById("demo").innerHTML = a*b;
	return a*b;
}

function changecolor(){
	var s = document.getElementById("p2");
	s.style.backgroundColor="yellow";
}
function app(){
	var para = document.createElement("p");
	var ele = document.createTextNode("Hello Para node");
	para.appendChild(ele);
	var loc = document.getElementById("div1");
	loc.appendChild(para);
}
document.write("<h1>Welcome to JS!!!");