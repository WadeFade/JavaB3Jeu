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
<body class="bg-gray-900 text-gray-50">


<div class="w-screen h-screen flex flex-col justify-center items-center">


    <h1 class="text-8xl font-bold mb-48 ">Polish Brain'Z</h1>


    <div class="flex justify-center items-center">


        <div class="flex flex-col justify-center items-center mx-24">
            <div class="m-4 p-32 w-2 h-2 rounded-full bg-gray-900 border border-black"></div>
            <div class="text-4xl">Jouer !</div>
        </div>
        <div class="flex flex-col justify-center items-center mx-24">
            <div class="m-4 p-32 w-2 h-2 rounded-full bg-gray-900 border border-black"></div>
            <div class="text-4xl">Classement</div>
        </div>
    </div>


</div>


<script src="<%= request.getContextPath()%>/js/index.js"></script>

</body>
</html>
