checkEmpty = (mainElem,errorElem,btnElem) => {
    if (!_.isEmpty(mainElem.value)) {
        // on supprime l'erreur
        errorElem.classList.add("hidden");
        errorElem.classList.remove("flex");
        btnElem.disabled = false;
        btnElem.classList.remove("opacity-40");
        return true;
    } else {
        // on affiche l'erreur
        errorElem.classList.remove("hidden");
        errorElem.classList.add("flex");
        btnElem.disabled = true;
        btnElem.classList.add("opacity-40");
        return false;
    }
};

checkEmail = (mainElem,errorElem,btnElem) => {
    if (!_.isEmpty(mainElem.value) && mainElem.value.match(/\b[\w\.-]+@[\w\.-]+\.\w{2,4}\b/gi)) {
        // on supprime l'erreur
        errorElem.classList.add("hidden");
        errorElem.classList.remove("flex");
        btnElem.disabled = false;
        btnElem.classList.remove("opacity-40");
    } else {
        // on affiche l'erreur
        errorElem.classList.remove("hidden");
        errorElem.classList.add("flex");
        btnElem.disabled = true;
        btnElem.classList.add("opacity-40");
    }
};