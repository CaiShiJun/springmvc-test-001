<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String contextPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();

    String clazzPackageAndName = "com.tingyun.controller.DataItemController";
%>
<html>
<head>
    <title>数据项-自定义指标测试用</title>
    <script src="<%=contextPath%>/js/jquery-3.3.1.min.js"></script>
</head>
<body>
	
	常用查询SQL语句：

	select * from SVR_U_DI_DETAIL_SETTING order by id desc;
	select * from SVR_U_DATA_ITEM_SETTING order by id desc;

    <table border="1">
        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramShortReturnByteMapping">
                    参数类型为 short （不能大于32767），返回值类型为 byte ：
                    <input type="text" value="12" name="param"/>
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramShortReturnByte
                <br>
                参数类型：short
                <br>
                返回值类型：byte
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramBooleanReturnDoubleMapping">
                    参数类型为 boolean ，返回值类型为 double ：
                    <select name="param">
                        <option value="true">true</option>
                        <option value="false">false</option>
                    </select>
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramBooleanReturnDouble
                <br>
                参数类型：boolean
                <br>
                返回值类型：double
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramIntReturnShortMapping">
                    参数类型为 int （不能大于2147483647），返回值类型为 short ：
                    <input type="text" value="12" name="param"/>
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramIntReturnShort
                <br>
                参数类型：int
                <br>
                返回值类型：short
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramLongReturnIntMapping">
                    参数类型为 long （不能大于9223372036854775807），返回值类型为 int ：
                    <input type="text" value="12" name="param"/>
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramLongReturnInt
                <br>
                参数类型：long
                <br>
                返回值类型：int
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramFloatReturnLongMapping">
                    参数类型为 float ，返回值类型为 long ：
                    <input type="text" value="12.12" name="param">
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramFloatReturnLong
                <br>
                参数类型：float
                <br>
                返回值类型：long
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramIntReturnCharMapping">
                    参数类型为 int （不能大于2147483647），返回值类型为 char ：
                    <input type="text" value="76" name="param">
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramIntReturnChar
                <br>
                参数类型：int
                <br>
                返回值类型：char
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramDoubleReturnFloatMapping">
                    参数类型为 double ，返回值类型为 float ：
                    <input type="text" value="12.12" name="param">
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramDoubleReturnFloat
                <br>
                参数类型：double
                <br>
                返回值类型：float
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramObjectReturnVoidMapping">
                    参数类型为 Object，返回值类型为 void ：
                    <input type="text" value="xiaoming" name="name">
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramObjectReturnVoid
                <br>
                参数类型：java.lang.Object
                |
                Getter链：hashCode()
                <br>
                返回值类型：无
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramCharReturnBooleanMapping">
                    参数类型为 char ，返回值类型为 boolean ：
                    <input type="text" value="J" name="param">
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramCharReturnBoolean
                <br>
                参数类型：char
                <br>
                返回值类型：boolean
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramByteReturnCharMapping">
                    参数类型为 byte （不能大于127），返回值类型为 char ：
                    <input type="text" value="76" name="param">
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramByteReturnChar
                <br>
                参数类型：byte
                <br>
                返回值类型：char
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramClassReturnExceptionMapping">
                    参数类型为 Class，返回值类型为 Exception 类型 ：
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramClassReturnException
                <br>
                参数类型：java.lang.Class
                |
                Getter链：getName()
                <br>
                返回值类型：java.lang.Exception
                |
                Getter链：getStackTrace().toString()
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramAutowiredBeanReturnLongMapping">
                    参数类型为Autowired注入的Spring维护的Bean，返回值为Long类型 ：
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramAutowiredBeanReturnLong
                <br>
                参数类型：com.tingyun.bean.spring.SpringComponentBean
                |
                Getter链：getSpringComponentPerson().getContact().getPhoneNumber()
                <br>
                返回值类型：java.lang.Long
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/paramDoubleReturnAutowiredBeanMapping">
                    参数类型为Double，返回值类型为Autowired注入的Spring维护的Bean ：
                    <input type="text" value="12.12" name="param">
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：paramDoubleReturnAutowiredBean
                <br>
                参数类型：java.lang.Double
                <br>
                返回值类型：com.tingyun.bean.spring.SpringComponentBean
                |
                Getter链：getSpringComponentPerson().getContact().getPhoneNumber()
            </td>
        </tr>


        <tr>
            <td>
                <form method="get" action="<%=contextPath%>/DataItemController/multiParameterMultiTypeMapping">
                    多参数多类型测试 ：
                    <br>
                    int：<input type="text" value="76" name="paramInt">
                    <br>
                    int：<input type="text" value="10082" name="id">
                    <br>
                    String：<input type="text" value="xiaoming" name="name">
                    <br>
                    int：<input type="text" value="25" name="age">
                    <br>
                    String：<input type="text" value="dafsadf" name="paramStr">
                    <br>
                    <input type="submit" value="提交">
                </form>
            </td>
            <td>
                类名：<%=clazzPackageAndName%>
                <br>
                方法名：multiParameterMultiType
                <br>
                参数类型：int 、 com.tingyun.bean.Person 、 java.lang.String
                <br>
                返回值类型：com.tingyun.bean.Person
                |
                Getter链：getName()
            </td>
        </tr>

    </table>
</body>
</html>
