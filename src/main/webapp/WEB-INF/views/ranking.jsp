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
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/ranking.css"/>
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
        <img src="<%= request.getContextPath()%>/assets/svg/ranking.svg" alt="Rank"
             class="w-96 h-96 absolute -bottom-20 -left-20 transform rotate-12 opacity-10 pointer-events-none">
        <a href="/JavaB3Jeu/accueil" class="absolute top-0 left-0 flex justify-center items-center w-20 h-20 p-4 z-50">
            <img src="<%= request.getContextPath()%>/assets/svg/home.svg" alt="accueil"
                 class="w-8 h-8">
        </a>
        <a href="/JavaB3Jeu/infos" class="absolute top-0 right-0 flex justify-center items-center w-20 h-20 p-4 z-50">
            <img src="<%= request.getContextPath()%>/assets/svg/info.svg" alt="info"
                 class="w-8 h-8">
        </a>
        <div class="absolute bottom-0 right-0 flex justify-center items-center z-50">
            <div class="flex flex-col justify-center items-center p-8">
                <a href="/JavaB3Jeu/playing"
                   class="w-28 h-28 flex justify-center items-center bg-black bg-opacity-30 border border-black border-opacity-60 rounded-full shadow-2xl">
                    <img src="<%= request.getContextPath()%>/assets/svg/synchronize.svg" alt="Replay"
                         class="w-16 h-16">
                </a>
                <h2 class="text-2xl mt-4 text-gray-50">Rejouer !</h2>
            </div>
        </div>
    </div>
</div>
<div class="absolute h-screen w-screen">
    <div class="h-full w-full flex flex-col justify-center items-center align-center">
        <div>
            <div class="flex items-center justify-center min-h-screen bg-gray-900">
                <div class="col-span-12">
                    <div class="overflow-auto lg:overflow-visible ">
                        <table class="table text-gray-400 border-separate space-y-6 text-sm">
                            <thead class="bg-gray-800 text-gray-500">
                            <tr>
                                <th class="p-3">Rang</th>
                                <th class="p-3 text-left">Pseudo</th>
                                <th class="p-3 text-left"></th>
                                <th class="p-3 text-left"></th>
                                <th class="p-3 text-left">Points</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="bg-gray-800">
                                <td class="p-3 font-bold">
                                    #1
                                </td>
                                <td class="p-3 font-bold">
                                    Pseudo
                                </td>
                                <td></td>
                                <td></td>
                                <td class="p-3">
                                    <p class="text-blue-300">
                                        2365000 pts
                                    </p>
                                </td>
                            </tr>

                            <tr class="bg-gray-800">
                                <td class="p-3 font-bold">
                                    #2
                                </td>
                                <td class="p-3 font-bold">
                                    Pseudo
                                </td>
                                <td></td>
                                <td></td>
                                <td class="p-3">
                                    <p class="text-blue-300">
                                        23650 pts
                                    </p>
                                </td>
                            </tr>

                            <tr class="bg-gray-800">
                                <td class="p-3 font-bold">
                                    #3
                                </td>
                                <td class="p-3 font-bold">
                                    Pseudo
                                </td>
                                <td></td>
                                <td></td>
                                <td class="p-3">
                                    <p class="text-blue-300">
                                        50 pts
                                    </p>
                                </td>
                            </tr>

                            <tr class="bg-gray-800">
                                <td class="p-3 font-bold">
                                    #4
                                </td>
                                <td class="p-3 font-bold">
                                    Pseudo
                                </td>
                                <td></td>
                                <td></td>
                                <td class="p-3">
                                    <p class="text-blue-300">
                                        50 pts
                                    </p>
                                </td>
                            </tr>

                            <tr class="bg-gray-800">
                                <td class="p-3 font-bold">
                                    #5
                                </td>
                                <td class="p-3 font-bold">
                                    Pseudo
                                </td>
                                <td></td>
                                <td></td>
                                <td class="p-3">
                                    <p class="text-blue-300">
                                        50 pts
                                    </p>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <div class="flex">
                            <nav class="relative z-0 inline-flex justify-between w-full shadow-sm">
                                <%--                                v-if="pagination.current_page > pagination.last_page--%>
                                <div>
                                    <a href="#" class="relative inline-flex items-center px-2 py-2 rounded-l-md border border-black border-opacity-50
                                    bg-black bg-opacity-30 text-sm leading-5 font-medium text-blue-500
                                    hover:text-blue-400 focus:z-10 focus:outline-none focus:border-blue-300
                                    focus:shadow-outline-blue active:bg-opacity-20 active:text-blue-500
                                    transition ease-in-out duration-150" aria-label="Previous">
                                        <svg class="h-5 w-5" viewBox="0 0 20 20" fill="currentColor">
                                            <path fill-rule="evenodd"
                                                  d="M12.707 5.293a1 1 0 010 1.414L9.414 10l3.293 3.293a1 1 0 01-1.414 1.414l-4-4a1 1 0 010-1.414l4-4a1 1 0 011.414 0z"
                                                  clip-rule="evenodd"/>
                                        </svg>
                                    </a>
                                </div>
                                <%--                                v-if="pagination.current_page < pagination.last_page --%>
                                <div>
                                    <a href="#" class="-ml-px relative inline-flex items-center px-2 py-2 rounded-r-md border border-black border-opacity-50
                                       bg-black bg-opacity-30 text-sm leading-5 font-medium text-blue-500
                                       hover:text-blue-400 focus:z-10 focus:outline-none focus:border-blue-300
                                       focus:shadow-outline-blue active:bg-opacity-20 active:text-blue-500
                                       transition ease-in-out duration-150" aria-label="Next">
                                        <svg class="h-5 w-5" viewBox="0 0 20 20" fill="currentColor">
                                            <path fill-rule="evenodd"
                                                  d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z"
                                                  clip-rule="evenodd"/>
                                        </svg>
                                    </a>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="h-full w-full flex flex-col justify-center items-center align-center relative">
    <div class="flex flex-col-reverse lg:flex-row justify-center items-center mt-20">
        <h2 class="text-5xl lg:p-10 font-black">Polish Brain'z</h2>
    </div>
</div>
</body>
</html>
