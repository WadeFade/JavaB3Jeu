// gestion de la popup
const modal = document.getElementById("modal");
const parent = document.getElementById("parent");
const btnCloseModal = document.getElementById("btnCloseModal");
const btnOpenModal = document.getElementById("btnOpenModal");

var flag = false;

closeModal = () => {
    modal.classList.remove("z-50");
    modal.classList.remove("opacity-100");
    modal.classList.remove("pointer-events-auto");
    modal.classList.add("z-0");
    modal.classList.add("opacity-0");
    modal.classList.add("pointer-events-none");
}

btnCloseModal.addEventListener("click", () => {
    closeModal();
})

btnOpenModal.addEventListener("click", () => {
    modal.classList.add("z-50");
    modal.classList.add("opacity-100");
    modal.classList.add("pointer-events-auto");
    modal.classList.remove("z-0");
    modal.classList.remove("opacity-0");
    modal.classList.remove("pointer-events-none");
})