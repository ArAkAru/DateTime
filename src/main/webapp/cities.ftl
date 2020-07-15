<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cities</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</head>

<body>
<h2>City And Time </h2>
<table class="table">
    <thead>
    <tr>
        <th>City</th>
        <th>Time</th>
    </tr>
 </thead>

    <tbody>
    <#list cities as row>

    <tr class="table-warning">
        <#if AM>
        <#if row.time?contains("AM")>


        <td>${row}</td>
        <td>${row.time}</td>
    </#if>

    <#else>
    <td>${row}</td>
    <td>${row.time}</td>
    </#if>
    </tr>


    </#list>
    </tbody>
</table>
</body>
</html>

