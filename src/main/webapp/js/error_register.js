const pseudo = document.getElementById("pseudo");
const error_pseudo = document.getElementById("error_pseudo");
pseudo.addEventListener("change", () => {
    checkEmpty(pseudo, error_pseudo)
}, false);
pseudo.addEventListener("input", () => {
    checkEmpty(pseudo, error_pseudo)
}, false);
