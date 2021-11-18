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
<div class="overflow-hidden absolute h-screen w-screen pointer-events-none">
    <div class="w-full h-full relative">
        <img src="<%= request.getContextPath()%>/assets/svg/mental-health.svg" alt="Head"
             class="w-96 h-96 absolute -bottom-20 -right-20 transform -rotate-12 opacity-10">
    </div>
</div>

<div class="h-full w-full flex flex-col justify-center items-center align-center relative">
    <div class="flex flex-col-reverse lg:flex-row justify-center items-center mt-20">
        <h2 class="text-5xl lg:text-4xl lg:p-10">Polish Brain'z</h2>
    </div>

    <form class="text-blue-300 flex flex-col justify-center items-center h-full w-96">
        <fieldset>
            <div class="flex flex-col my-10 relative">
                <label for="email" class="text-xs">Email</label>
                <input name="email" placeholder="..."
                       oninput="this.value = this.value.toLowerCase()"
                       type="email" id="email"
                       class="w-96 bg-black bg-opacity-20 border-blue-300 border rounded-lg px-2 py-6 md:px-8 text-sm my-2">
                <span class="mt-5 text-red-400 text-xs absolute -bottom-3 left-0">
                    * L'email saisie n'est pas valide
                </span>
            </div>
            <div class="flex flex-col my-10 relative">
                <label for="password" class="text-xs">Mot de passe</label>
                <input name="password" placeholder="*************"
                       type="password" id="password"
                       class="w-96 bg-black bg-opacity-20 border-blue-300 border rounded-lg px-2 py-6 md:px-8 text-sm my-2">
                <span class="mt-5 text-red-400 text-xs absolute -bottom-3 left-0">
                    * Erreur
                </span>
            </div>
        </fieldset>
        <div class="form-buttons w-full flex justify-between flex-row-reverse">
            <button class="bg-blue-300 px-10 py-5 rounded-lg text-gray-800 text-sm">
                Se connecter
            </button>
            <a type="button" class="border border-blue-300 px-10 py-5 rounded-lg text-blue-300 text-sm"
               href="/JavaB3Jeu/register">
                S'inscrire
            </a>
        </div>
    </form>
</div>

<script src="<%= request.getContextPath()%>/js/index.js"></script>

</body>
</html>
