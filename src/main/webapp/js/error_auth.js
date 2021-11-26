const password = document.getElementById("password");
const error_password = document.getElementById("error_password");
password.addEventListener("change", () => {
    checkEmpty(password, error_password)
}, false);
password.addEventListener("input", () => {
    checkEmpty(password, error_password)
}, false);

const email = document.getElementById("email");
const error_email = document.getElementById("error_email");
email.addEventListener("change", () => {
    checkEmail(email, error_email);
}, false);
email.addEventListener("input", () => {
    checkEmail(email, error_email);
}, false);