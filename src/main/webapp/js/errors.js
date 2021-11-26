checkEmpty = (mainElem,errorElem) => {
    if (!_.isEmpty(mainElem.value)) {
        // on supprime l'erreur
        errorElem.classList.add("hidden");
        errorElem.classList.remove("flex");
        return true;
    } else {
        // on affiche l'erreur
        errorElem.classList.remove("hidden");
        errorElem.classList.add("flex");
        return false;
    }
};

checkEmail = (mainElem,errorElem) => {
    if (!_.isEmpty(mainElem.value) && mainElem.value.match(/\b[\w\.-]+@[\w\.-]+\.\w{2,4}\b/gi)) {
        // on supprime l'erreur
        errorElem.classList.add("hidden");
        errorElem.classList.remove("flex");
    } else {
        // on affiche l'erreur
        errorElem.classList.remove("hidden");
        errorElem.classList.add("flex");
    }
};