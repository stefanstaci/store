<#import "blocks/template.ftlh" as t>
<@t.template user>
    `<h1 style="text-align: center">Panoul Administratorului</h1><hr>
    <table class="table table-hover table-dark">
        <tr>
            <th scope="col">Email</th>
            <th scope="col">Telefon</th>
            <th scope="col">Activitatea</th>
            <th scope="col">Rol</th>
            <th scope="col">Ban</th>
            <th scope="col">Redactare</th>
            <th scope="col">Informatie detaliata</th>
        </tr>
        <#list users as user>
            <tr>
                <th>${user.email}</th>
                <th>${user.phoneNumber}</th>
                <th><#if user.active>true<#else>false</#if></th>
                <th><#list user.roles as role>${role}</#list></th>
                <th>
                    <form action="/admin/user/ban/${user.id}" method="post">
                        <input type="hidden" name="_csrf" value="${_csrf.token}">
                        <input type="submit" class="btn btn-light" value="Бан">
                    </form>
                </th>
                <th><a href="/admin/user/edit/${user.id}">Redactare</a></th>
                <th><a href="/user/${user.id}">Informatie detaliata</a></th>
            </tr>
        <#else>
            <h3>Utilizatori nu sunt</h3>
        </#list>
    </table>
</@t.template>