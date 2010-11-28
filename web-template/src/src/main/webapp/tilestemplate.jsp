<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title><tiles:insertAttribute name="title"/></title>
    </head>
    <body>
        <div class="inside_frame_div">
            <tiles:insertAttribute name="header"/> <%-- Header logo --%>
            <tiles:insertAttribute name="menu"/> <%-- Menu and language chooser --%>
            <tiles:insertAttribute name="body"/> <%-- Dinamic content --%>
            <tiles:insertAttribute name="footer"/>
        </div>
    </body>
</html>