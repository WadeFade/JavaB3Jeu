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
    <script src="https://cdn.jsdelivr.net/npm/lodash@4.17.21/lodash.min.js" defer></script>
    <script src="<%= request.getContextPath()%>/js/errors.js" defer></script>
    <script src="<%= request.getContextPath()%>/js/error_register.js" defer></script>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/firefly.css"/>
</head>

<body class="text-gray-50 bg-gray-900">
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

<div class="overflow-hidden absolute w-screen h-screen pointer-events-none">
    <div class="relative w-full h-full">
        <img src="<%= request.getContextPath()%>/assets/svg/mental-health.svg" alt="Head"
             class="absolute -right-20 -bottom-20 w-96 h-96 opacity-10 transform -rotate-12">
    </div>
</div>

<div class="flex flex-col justify-center items-center w-full h-full align-center">
    <div class="flex flex-col-reverse justify-center items-center mt-20 lg:flex-row">
        <h2 class="text-5xl font-black lg:p-10">Polish Brain'z</h2>
    </div>
    <form method="POST" action="/JavaB3Jeu/register" class="flex flex-col justify-center items-center w-96 h-full text-blue-300">
        <fieldset>
            <div class="flex relative flex-col my-10">
                <label for="email" class="text-xs">Email</label>
                <input name="email" placeholder="..."
                       oninput="this.value = this.value.toLowerCase()"
                       type="email" id="email"
                       class="px-2 py-6 my-2 w-96 text-sm bg-black bg-opacity-20 rounded-lg border border-blue-300 shadow-2xl md:px-8">
                <span id="error_email" class="hidden absolute left-0 -bottom-3 mt-5 text-xs text-red-400">
                    * L'email saisie n'est pas valide
                </span>
            </div>
            <div class="flex relative flex-col my-10">
                <label for="pseudo" class="text-xs">Pseudo</label>
                <input name="pseudo" placeholder="..."
                       oninput="this.value = this.value.toLowerCase()"
                       type="text" id="pseudo"
                       class="px-2 py-6 my-2 w-96 text-sm bg-black bg-opacity-30 rounded-lg border border-blue-300 shadow-2xl md:px-8">
                <span id="error_pseudo" class="hidden absolute left-0 -bottom-3 mt-5 text-xs text-red-400">
                    * Le pseudo saisi n'est pas valide
                </span>
            </div>
            <div class="flex relative flex-col my-10">
                <label for="password" class="text-xs">Mot de passe</label>
                <input name="password" placeholder="*************"
                       type="password" id="password"
                       class="px-2 py-6 my-2 w-96 text-sm bg-black bg-opacity-20 rounded-lg border border-blue-300 shadow-2xl md:px-8">
                <span id="error_password" class="hidden absolute left-0 -bottom-3 mt-5 text-xs text-red-400">
                    * Le mot de passe saisi n'est pas valide
                </span>
            </div>
        </fieldset>
        <div class="flex flex-row-reverse justify-between w-full form-buttons">
            <button id="button-form" type="submit" disabled class="px-10 py-5 text-sm text-gray-800 bg-blue-300 rounded-lg opacity-40">
                S'inscrire
            </button>
            <a type="button" class="px-10 py-5 text-sm text-blue-300 rounded-lg border border-blue-300"
               href="/JavaB3Jeu/login">
                Se connecter
            </a>
        </div>
    </form>
</div>
</body>
</html>
