let createMode = false;
let addMode = false;
let editMode = false;

const toggleCreateMode = () => {
	createMode = !createMode;
	const CREATE_BLOCK = document.getElementById("createBlock");
	if (createMode) {
		CREATE_BLOCK.style.display = "block";
	} else {
		CREATE_BLOCK.style.display = "none";
	}
}

const toggleAddMode = (elm) => {
	const ID = elm.id.split("_")[1];
	addMode = !addMode;
	const ADD_BLOCK = document.getElementById("addBlock_" + ID);
	if (addMode) {
		ADD_BLOCK.style.display = "block";
	} else {
		ADD_BLOCK.style.display = "none";
	}
};

const toggleEditMode = (elm) => {
	const ID = elm.id.split("_")[1];
	editMode = !editMode;
	const EDIT_BLOCK = document.getElementById("editBlock_" + ID);
	if (editMode) {
		EDIT_BLOCK.style.display = "block";
	} else {
		EDIT_BLOCK.style.display = "none";
	}
};

const toggleCheckbox = (elm) => {
	const XHR = new XMLHttpRequest();
	const FD = new FormData();
	const ID = elm.id.split("_")[1];
	const URL = "http://" + location.host
		+ location.pathname.match(/\/.+\//) + "toggleCheck";
	FD.append("targetId", ID);
	XHR.open("POST", URL);
	XHR.send(FD);
}

const setEventListener = (selector) => {
	const ELM = document.getElementById(selector);
	if (selector == "createBlock") {
		document.addEventListener('click', function(e) {
			if (!e.target.closest(".createButton")
					&& !e.target.closest("#createBlock")) {
				createMode = false;
				ELM.style.display = "none";
			}
		}, false)
		return;
	}
	const CLASSNAME = selector.split("_")[0];
	if (CLASSNAME == "addBlock") {
		document.addEventListener('click', function(e) {
			if (!e.target.closest(".addButton")
					&& !e.target.closest("#" + selector)) {
				addMode = false;
				ELM.style.display = "none";
			}
		}, false)
	} else {
		document.addEventListener('click', function(e) {
			if (!e.target.closest(".editButton")
					&& !e.target.closest("#" + selector)) {
				editMode = false;
				ELM.style.display = "none";
			}
		}, false)
	}
}

const setId = (str, settingListener) => {
	const LIST = document.getElementsByClassName(str);
	for (let i = 0; i < LIST.length; i++) {
		const ID = str + "_" + i;
		LIST[i].setAttribute("id", ID);
		if (settingListener) {
			setEventListener(ID);
		}
	}
}

const setIndex = () => {
	setEventListener("createBlock");
	setId("addButton", false);
	setId("addBlock", true);
	setId("editButton", false);
	setId("editBlock", true);
}

window.onload = function() {
	setIndex();
}
