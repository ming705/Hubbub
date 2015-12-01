<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Hubbub &raquo; <g:layoutTitle default="Welcome" /></title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <asset:stylesheet src="application.css"/>
        <asset:stylesheet src="hubbub.css"/>
        <asset:javascript src="application.js"/>

        <g:layoutHead/>
    </head>
    <body>
        <div id="hd" role="banner">
        	<a href="/"><asset:image src="headerlogo.png" alt="hubbub logo"/></a>
        </div>
        <div id="bd"><!-- start body -->
        	<g:layoutBody/>
        </div>  <!-- end body -->
        <div id="ft">
      		<div id="footerText">Hubbub - Social Networking on Grails</div>
    	</div>

        <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
    </body>
</html>
