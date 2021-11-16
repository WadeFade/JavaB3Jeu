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
</head>
<body class="bg-black text-gray-50">
<div class="w-screen h-screen">
    <div class="w-full h-full flex justify-center items-center">
        <h1>Bienvenue sur l'accueil du Jeu</h1>
    </div>
</div>

<script src="<%= request.getContextPath()%>/js/index.js"></script>

</body>
</html>
