checkEmpty = (mainElem,errorElem) => {
    if (_.isEmpty(mainElem.innerText)) {
        errorElem.classList.add("hidden");
        errorElem.classList.remove("flex");
    } else {
        errorElem.classList.remove("hidden");
        errorElem.classList.add("flex");
    }
};

checkEmail = (mainElem,errorElem) => {
    if (_.isEmpty(mainElem.innerText)) {
        errorElem.classList.add("hidden");
        errorElem.classList.remove("flex");
    } else {
        errorElem.classList.remove("hidden");
        errorElem.classList.add("flex");
    }
};

var password = document.getElementById("password")
var error_password = document.getElementById("error_password")
password.addEventListener("change", checkPassword(),false);
password.addEventListener("input", checkPassword(),false);

var email = document.getElementById("email")
var error_email = document.getElementById("error_email")
email.addEventListener("change", checkEmail(),false);
email.addEventListener("input", checkEmail(),false);