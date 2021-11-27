const rank = document.getElementById("rank");
const back_btn = document.getElementById("back_btn");
const next_btn = document.getElementById("next_btn");
var actual_page = 1;

/**
 * On parcours les différents éléments dans le tbody, et on affiche (ou non) les différents éléments en fonction
 * de la page passé en paramètre
 * @param displayPage
 */
display = (displayPage = 1) => {
    var page = 0;
    for (let i = 0; i < rank.children.length; i++) {
        if ((i % 5) === 0) {
            page++;
        }
        if ((displayPage === page)) {
            rank.children[i].classList.remove("hidden");
        } else {
            rank.children[i].classList.add("hidden");
        }
    }
};

/**
 * Lorsqu'on clique on change la page, si la page est la première alors on desactive le bouton précédent
 */
back_btn.addEventListener("click", () => {
    next_btn.classList.remove("opacity-30");
    next_btn.classList.remove("pointer-events-none");
    actual_page--;
    display(actual_page);
    if(actual_page === 1){
        back_btn.classList.add("opacity-30");
        back_btn.classList.add("pointer-events-none");
    }
}, false);

/**
 * Lorsqu'on clique on change la page, si la page est la dernière alors on desactive le bouton suivant
 */
next_btn.addEventListener("click", () => {
    back_btn.classList.remove("opacity-30");
    back_btn.classList.remove("pointer-events-none");
    actual_page++;
    display(actual_page);
    if ((actual_page === Math.ceil(rank.children.length / 5))) {
        next_btn.classList.add("opacity-30");
        next_btn.classList.add("pointer-events-none");
    }
}, false);

document.addEventListener('DOMContentLoaded', function () {
    display(actual_page);
}, false);