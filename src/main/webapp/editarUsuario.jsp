<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

<h1>Editar Usuario</h1>
<p>Este apartado es para editar usuarios del sistema</p>

<%Usuario usu =(Usuario) request.getSession().getAttribute("usu");  %>

<form class="user" action="SvEditUsuarios" method="POST">
    <input type="hidden" name="id" value="<%=usu.getId_usuario()%>"> 
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                                               placeholder="Nombre Usuario" value="<%=usu.getNombreUsuario()%>">
                                    </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                                            placeholder="Contraseña" value="<%=usu.getContrasenia()%>">
                                    </div>
                                     <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol" name="rol"
                                            placeholder="Rol" value="<%=usu.getRol()%>">
                                    </div>
                                 
                                
                                    
                                    
                                </div>
                                <button  class="btn btn-primary btn-user btn-block" type="submit">
                                    Guardar Modificación
                                </button>
                             
                            </form>
<%@include file="components/bodyfinal.jsp" %>
