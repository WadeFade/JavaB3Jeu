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
    <script src="<%= request.getContextPath()%>/js/index.js"></script>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/firefly.css"/>
</head>

<body class="bg-gray-900 text-gray-50 relative">
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

<div class="overflow-hidden absolute h-screen w-screen">
    <div class="w-full h-full relative">
        <img src="<%= request.getContextPath()%>/assets/svg/think.svg" alt="Thinking"
             class="w-96 h-96 absolute -bottom-20 -right-20 transform -rotate-12 opacity-10 pointer-events-none">
        <a href="/JavaB3Jeu/accueil" class="absolute top-0 left-0 flex justify-center items-center w-20 h-20 p-4 z-50">
            <img src="<%= request.getContextPath()%>/assets/svg/home.svg" alt="accueil"
                 class="w-8 h-8">
        </a>
        <a href="/JavaB3Jeu/infos" class="absolute top-0 right-0 flex justify-center items-center w-20 h-20 p-4 z-50">
            <img src="<%= request.getContextPath()%>/assets/svg/info.svg" alt="info"
                 class="w-8 h-8">
        </a>
    </div>
</div>
<div class="absolute h-screen w-screen">
    <div class="h-full w-full flex flex-col justify-center items-center align-center">
        <form class="text-blue-300 flex flex-col justify-center items-center h-full w-96">
            <div class="flex justify-center items-center">
                <div class="flex flex-col justify-center items-center">
                    <a href="/JavaB3Jeu/playing"
                       class="w-40 h-40 flex justify-center items-center bg-black bg-opacity-30 border border-black border-opacity-60 rounded-full shadow-2xl">
                        <img src="<%= request.getContextPath()%>/assets/svg/synchronize.svg" alt="Replay"
                             class="w-24 h-24">
                    </a>
                    <h2 class="text-3xl mt-4 text-gray-50">Rejouer !</h2>
                </div>
                <div class="flex flex-col justify-center items-center ml-8">
                    <a href="/JavaB3Jeu/rank"
                       class="w-40 h-40 flex justify-center items-center bg-black bg-opacity-30 border border-black border-opacity-60 rounded-full shadow-2xl ">
                        <img src="<%= request.getContextPath()%>/assets/svg/ranking.svg" alt="Rank" class="w-24 h-24">
                    </a>
                    <h2 class="text-3xl mt-4 text-gray-50">Classement !</h2>
                </div>
            </div>
        </form>
    </div>
</div>
<div class="h-full w-full flex flex-col justify-center items-center align-center relative">
    <div class="flex flex-col-reverse lg:flex-row justify-center items-center mt-20">
        <h2 class="text-5xl lg:p-10 font-black">Polish Brain'z</h2>
    </div>
    <div class="relative pt-1 w-96">
        <div class="flex mb-2 items-center justify-between">
            <div>
      <span class="text-xs font-semibold inline-block py-1 px-2 uppercase rounded-full text-teal-600 bg-green-200">
        evaluation terminee
      </span>
            </div>
            <div class="text-right">
      <span class="text-xs font-semibold inline-block text-green-600">
          <%--            todo change the value of the progress bar --%>
        100%
      </span>
            </div>
        </div>
        <div class="overflow-hidden h-2 mb-4 text-xs flex rounded bg-green-200">
            <%--            todo change the value of the progress bar --%>
            <div style="width:100%"
                 class="shadow-none flex flex-col text-center whitespace-nowrap text-white justify-center bg-green-500"></div>
        </div>
    </div>
    Resultat = <%= request.getAttribute("note") %>/10 !
</div>


<div class="flex ">

</div>
</body>
</html>
