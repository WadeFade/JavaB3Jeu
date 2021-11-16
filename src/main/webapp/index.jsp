<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Polish Brain'z App !</title>
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <script src="https://use.typekit.net/ksz8gnz.js"></script>
    <script>try {
        Typekit.load({async: true});
    } catch (e) {
    }</script>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/css/firefly.css"/>
</head>

<body class="bg-black text-gray-50">
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
<div class="h-full w-full flex flex-col justify-center items-center align-center">

    <div class="flex flex-col-reverse lg:flex-row justify-center items-center mt-36">
        <h2 class="text-5xl lg:text-4xl lg:p-10">Polish Brain'z</h2>
    </div>

    <form class="text-blue-300 flex flex-col justify-center items-center h-full w-80">
        <fieldset>
            <div class="flex flex-col my-10 relative">
                <label class="text-xs">IDENTIFIANT</label>
                <input name="email" placeholder="..."
                       oninput="this.value = this.value.toLowerCase()"
                       type="email"
                       class="w-96 h-20 bg-gray-800 border-blue-300 border-2 rounded-lg px-2 md:px-8 text-sm my-2">
                <span class="mt-5 text-red-400 text-xs absolute -bottom-3 left-0">
                    * L'email saisie n'est pas valide
                </span>
            </div>
            <div class="flex flex-col my-10 relative">
                <label class="text-xs">MOT DE PASSE</label>
                <input name="password" placeholder="*************"
                       type="password"
                       class="w-96 h-20 bg-gray-800 border-blue-300 border-2 rounded-lg px-2 md:px-8 text-sm my-2">
                <span class="mt-5 text-red-400 text-xs absolute -bottom-3 left-0">
                    * Erreur
                </span>
            </div>
        </fieldset>
        <div class="form-buttons w-full flex justify-between flex flex-row-reverse">
            <button class="bg-blue-300 px-10 py-5 rounded-lg text-gray-800 text-sm">
                Se connecter
            </button>
            <button class="border-2 border-blue-300 px-10 py-5 rounded-lg text-blue-300 text-sm">
                S'inscrire
            </button>
        </div>
    </form>
</div>

<script src="<%= request.getContextPath()%>/js/index.js"></script>

</body>
</html>
