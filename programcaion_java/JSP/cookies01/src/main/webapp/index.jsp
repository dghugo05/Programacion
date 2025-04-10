<%-- 
    Document   : newjsp
    Created on : Apr 7, 2025, 9:07:24 PM
    Author     : nocturno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            String idioma = "";
            boolean existe = false;
            Cookie[] cookies = request.getCookies();
            Cookie language = null;
            if(request.getParameter("bandera") == null){
                if(cookies != null){
                    for(Cookie cookie : cookies){
                        if(cookie.getName().equals("idioma")){
                            idioma = cookie.getValue();
                            language = cookie;
                            existe = true;
                        }
                    }
                }
            }else{
               idioma = request.getParameter("bandera");
            }
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=idioma.equalsIgnoreCase("en")?"English"
                :idioma.equalsIgnoreCase("fr")?"Français"
                :idioma.equalsIgnoreCase("ep")?"Esperanto"
                :"Español"
               %>
        </title>
    </head>
    <body>
        <%
            if(existe){
                language.setValue(idioma);
                language.setMaxAge(15 * 60);
                language.setPath("/");
                response.addCookie(language);
            }else{
                language = new Cookie("idioma", idioma);
                language.setPath("/");
                language.setMaxAge(15*60);
                response.addCookie(language);
            }
            
            if(idioma.equalsIgnoreCase("ep")){
                out.println("<h1>Donkiĥoto de La Mancha</h1>");
                out.println("<p>En loko de La Mancha, kies<br>" +
                            "nomon mi ne volas rememori, ne<br>" +
                            "antaŭ longe vivis hidalgo el<br>" +
                            "tiuj kun lanco en stando, ŝildo<br>" +
                            "malnova, ĉevalo maldika, kaj<br>" +
                            "kurhundo rapida.</p>");
            }else if(idioma.equalsIgnoreCase("en")){
                out.println("<h1>Don Quixote of La Mancha</h1>");
                out.println("<p>In a place in La Mancha, whose<br>" + 
                            "name I do not wish to recall, not<br>" +
                            "long ago there lived a gentleman of<br>" +
                            "those with a lance in the rack, an old<br>" +
                            "shield, a skinny horse, and a<br>" +
                            "swift greyhound.</p>");
            }else if (idioma.equalsIgnoreCase("fr")){
                out.println("<h1>Don Quichotte de la Manche</h1>");
                out.println("<p>Dans un endroit de la Manche, dont<br>" +
                            "je ne veux pas me souvenir du nom, il<br>" +
                            "n’y a pas longtemps vivait un hidalgo<br>" +
                            "de ceux avec une lance au râtelier, un<br>" +
                            "vieux bouclier, un cheval maigre, et un<br>" +
                            "lévrier rapide.</p>");
            }else{
                out.println("<h1>Don Quijote de La Mancha</h1>");
                out.println("<p>En un lugar de La Mancha, de cuyo<br>" +
                            "nombre no quiero acordarme, no hace<br>" +
                            "mucho tiempo que vivía un hidalgo de<br>" +
                            "los de lanza en astillero, adarga<br>" +
                            "antigua, rocín flaco, y galgo<br>" +
                            "corredor.</p>");
            }
        %>
        <div style="display:flex; flex-direction: row; gap:5px;">
            <form action="index.jsp" method="post">
                <input type="hidden" name="bandera" value="es">
                <input type="image" src="./Images/icons8-spain-96.png" alt="Enviar" width="50">
            </form>
            <form action="index.jsp" method="post">
                <input type="hidden" name="bandera" value="ep">
                <input type="image" src="./Images/icons8-esperanto-flag-96.png" alt="Enviar" width="50">
            </form>
            <form action="index.jsp" method="post">
                <input type="hidden" name="bandera" value="en">
                <input type="image" src="./Images/icons8-united-kingdom-96.png" alt="Enviar" width="50">
            </form>
            <form action="index.jsp" method="post">
                <input type="hidden" name="bandera" value="fr">
                <input type="image" src="./Images/icons8-france-96.png" alt="Enviar" width="50">
            </form>
        </div>
    </body>
</html>
