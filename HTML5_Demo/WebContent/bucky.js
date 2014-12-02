/**
 * 
 */
function getStuff() {
	document.querySelector("#tuna").oncilck = talk;
}

function talk() {
	alert("yoyoma!");
}

window.onload = getStuff;