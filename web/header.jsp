<%-- 
    Document   : header
    Created on : Aug 6, 2019, 1:06:56 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.trilochan.service.loginServlet" %>
<header class="default-header">
		<nav class="navbar navbar-expand-lg navbar-light">
			<div class="container">
                            <h1 align="left" style="color:#FF3300"><b>Trilochan</b></h1>
				<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
				 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
					<span class="fa fa-bars"></span>
				</button>

				<div class="collapse navbar-collapse justify-content-end align-items-center" id="navbarSupportedContent">
					<ul class="navbar-nav">
						<li><a href="index.jsp">Home</a></li>
						<!--<li><a href="gallery.jsp">Gallery</a></li>-->
						<li><a href="work.jsp">Work</a></li>
						<li><a href="about.jsp">About Us</a></li>
						<li><a href="contact.jsp">Contact</a></li>
						<li><a href="donation.jsp">Donation</a></li>
                                                <%if(session.getAttribute("email")== null){%>
                                                <li><a href="userlogin.jsp">Login</a></li>
                                                                                               
                                                <%}else{%>
                                                 <li><a href="logoutServlet">Logout</a></li>
                                                 <li style="color: yellow">Welcome!!<br><%=session.getAttribute("name")%> </li>
                                                <%}%>

                                        </ul>
				</div>
			</div>
		</nav>
	</header>