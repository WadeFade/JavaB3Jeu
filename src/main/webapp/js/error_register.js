var password = document.getElementById("password")
var error_password = document.getElementById("error_password")
password.addEventListener("change", () => {
    checkEmpty(password, error_password)
}, false);
password.addEventListener("input", () => {
    checkEmpty(password, error_password)
}, false);

var email = document.getElementById("email")
var error_email = document.getElementById("error_email")
email.addEventListener("change", () => {
    checkEmail(email, error_email);
}, false);
email.addEventListener("input", () => {
    checkEmail(email, error_email);
}, false);