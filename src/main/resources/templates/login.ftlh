<#import "blocks/template.ftlh" as t>
<@t.template user>
    <h1 style="text-align: center">Autorizare</h1>
    <hr>
    <form action="/login " method="post">
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" class="form-control <#if RequestParameters.error??>is-invalid</#if>" id="email" name="username">
            <div id="email" class="invalid-feedback">
                Email gresit
            </div>
        </div>
        <div class="form-group">
            <label for="password">Parola</label>
            <input type="password" class="form-control <#if RequestParameters.error??>is-invalid</#if>" id="password" name="password">
            <div id="password" class="invalid-feedback">
                Parola gresita
            </div>
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <button type="submit" style="width: 100%" class="btn btn-dark">Intra</button>
    </form>
    <hr>
    <h2>Nu ai cont ? <a href="/registration">Inregistreazate!</a></h2>
</@t.template>