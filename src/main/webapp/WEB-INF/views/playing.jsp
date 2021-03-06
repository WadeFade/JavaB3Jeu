<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Polish Brain'z App !</title>
    <meta name="description" content="L'application pour vous entrainer au calcul mental !">
    <link rel="icon" type="image/png" href="<%= request.getContextPath()%>/assets/favicon/favicon-16x16.png">
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://use.typekit.net/ksz8gnz.js"></script>
    <script>try {
        Typekit.load({async: true});
    } catch (e) {
    }</script>
    <script src="<%= request.getContextPath()%>/js/index.js" defer></script>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/firefly.css"/>
</head>

<body class="relative text-gray-50 bg-gray-900">
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="firefly"></div>
<div class="overflow-hidden absolute w-screen h-screen">
    <div class="relative w-full h-full">
        <img src="<%= request.getContextPath()%>/assets/svg/think.svg" alt="Thinking"
             class="absolute -right-20 -bottom-20 w-96 h-96 opacity-10 transform -rotate-12 pointer-events-none">
        <a href="/JavaB3Jeu/accueil" class="flex absolute top-0 left-0 z-50 justify-center items-center p-4 w-20 h-20">
            <img src="<%= request.getContextPath()%>/assets/svg/home.svg" alt="accueil"
                 class="w-8 h-8">
        </a>
        <button id="btnOpenModal" class="flex absolute top-0 right-0 z-50 justify-center items-center p-4 w-20 h-20">
            <img src="<%= request.getContextPath()%>/assets/svg/info.svg" alt="info"
                 class="w-8 h-8">
        </button>
        <div id="modal"
             class="overflow-x-auto absolute top-1/2 right-1/2 z-0 my-3 max-w-lg bg-gray-800 rounded-lg shadow-lg opacity-0 transition transition-opacity transform translate-x-1/2 -translate-y-1/2 pointer-events-none">
            <div class="flex px-5 py-4 border-b border-gray-900">
                <div class="flex justify-center items-center w-5">
                    <svg class="w-6 h-6 text-blue-400 fill-current" viewBox="0 0 40 40"
                         xmlns="http://www.w3.org/2000/svg">
                        <path
                                d="M20 3.33331C10.8 3.33331 3.33337 10.8 3.33337 20C3.33337 29.2 10.8 36.6666 20 36.6666C29.2 36.6666 36.6667 29.2 36.6667 20C36.6667 10.8 29.2 3.33331 20 3.33331ZM21.6667 28.3333H18.3334V25H21.6667V28.3333ZM21.6667 21.6666H18.3334V11.6666H21.6667V21.6666Z"/>
                    </svg>
                </div>
                <span class="ml-2 text-lg font-bold text-gray-100">Les r??gles du jeu !</span>
            </div>

            <div class="px-10 py-5 text-xs text-gray-300">
                <p class="my-1">
                    On observe les ??l??ments de l'expression de gauche ?? droite, on y trouve deux types d'??l??ments : les
                    op??randes et les op??rateurs.
                    Lorsque l'on voit un op??rande, on l'ajoute ?? une liste, au d??part vide, qui se remplit d'op??rande
                    petit ?? petit.
                    Lorsque l'on voit un op??rateur, deux possibilit??s s'offre a nous :
                </p>
                <p class="my-1">
                    - S???il n'y a qu'un op??rande dans la liste alors que l'op??rateur a besoin de deux param??tres ou plus,
                    on continue d'observer l'expression jusqu'a que l'on est le nombre d'op??randes souhait??.
                </p>
                <p class="my-1">
                    - S???il y a le bon nombre d'op??randes dans la liste, alors on effectue l'op??ration avec l'op??rateur
                    en passant en param??tre les op??randes selon leurs ordres d'apparition dans l'expression.
                </p>
                <p class="my-1">
                    On remplace alors l'ensemble des op??randes utilis?? dans notre liste par le r??sultat obtenu (que l'on
                    place donc au d??but de la liste)
                </p>
                <p class="my-1">
                    Si l'on r??p??te l'op??ration pour tous les ??l??ments de notre expression,
                    on doit finir l'expression avec un seul ??l??ment dans notre liste temporaire d'op??rande : il s'agit
                    du
                    r??sultat de l'expression.
                </p>
                <p class="my-1">
                    Attention cependant : les op??randes pr??sents dans l'expression sont forc??ment des chiffres, ainsi,
                    si
                    vous avec l'expression "124*2+-",
                    la liste des op??randes est [1,2,4,2] et la liste des op??rateurs est [*,+,-]
                </p>
                <p class="my-4 ml-4 text-sm font-bold">
                    Si on prend un exemple : (Wikip??dia)
                    <br>Le calcul [ 1 + 2 * 4 + 3] peut se lire intuitivement :
                    <br>
                    <br>je mets 1, (1) ;
                    <br>j'ajoute 2, (2 +) ;
                    <br>je multiplie par 4, (4 *) ;
                    <br>j'ajoute 3. (3 +).
                    <br>
                    <br>Ce qui donne simplement 1 2 + 4 * 3 +
                    <br>Et r??sulte en "15"
                </p>
            </div>
            <div class="flex justify-end px-5 py-4 bg-gray-800 border-t border-gray-900">
                <button id="btnCloseModal" class="px-3 py-2 text-sm text-gray-200 transition duration-150 hover:text-gray-100">
                    Ok !
                </button>
            </div>
        </div>

    </div>
</div>
<div class="absolute w-screen h-screen">
    <div class="flex flex-col justify-center items-center w-full h-full align-center">
        <form class="flex flex-col justify-center items-center w-96 h-full text-blue-300">
            <h2 class="py-14 text-6xl font-bold text-blue-300"><%= request.getAttribute("expression") %>
            </h2>
            <div class="flex relative flex-col my-10">
                <label for="reponsePrecedente" class="text-xs uppercase">R??ponse</label>
                <div class="flex flex-row">
                    <input name="reponsePrecedente" placeholder=""
                           type="number" id="reponsePrecedente"
                           class="px-2 py-6 my-2 w-96 text-sm bg-black bg-opacity-20 rounded-lg border border-blue-300 shadow-2xl md:px-8">
                    <div class="flex justify-center items-center ml-8">
                        <button>
                            <img src="<%= request.getContextPath()%>/assets/svg/send.svg" alt="Chrono logo"
                                 class="w-20 h-20">
                        </button>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
<div class="flex relative flex-col justify-center items-center w-full h-full align-center">
    <div class="flex flex-col-reverse justify-center items-center mt-20 lg:flex-row">
        <h2 class="text-5xl font-black lg:p-10">Polish Brain'z</h2>
    </div>
    <div class="relative pt-1 w-96">
        <div class="flex justify-between items-center mb-2">
            <div>
      <span class="inline-block px-2 py-1 text-xs font-semibold text-teal-600 uppercase bg-green-200 rounded-full">
        ??valuation en cours
      </span>
            </div>
            <div class="text-right">
      <span class="inline-block text-xs font-semibold text-green-600">
          <%--            todo change the value of the progress bar --%>
         <%= request.getAttribute("step")  %>%
      </span>
            </div>
        </div>
        <div class="flex overflow-hidden mb-4 h-2 text-xs bg-green-200 rounded">
            <%--            todo change the value of the progress bar --%>
            <div style="width:<%= request.getAttribute("step") %>%"
                 class="flex flex-col justify-center text-center text-white whitespace-nowrap bg-green-500 shadow-none"></div>
        </div>
    </div>
</div>
<script>
    document.getElementById("reponsePrecedente").focus();
    document.getElementById("reponsePrecedente").select();
</script>
</body>
</html>
