<#import "blocks/template.ftlh" as t>
<@t.template user>
    <h1 style="text-align: center">cauta produse</h1><hr>
    <form method="get" action="/">
        <div class="form-row">
            <div class="form-group col-md-2">
                <label for="searchCity">Oras</label>
                <select id="searchCity" class="form-control">
                    <option value="">Orasul nu este ales</option>
                    <option value="Chisinau">Chisinau</option>
                    <option value="Balti">Balti</option>
                    <option value="Cahul">Cahul</option>
                </select>
            </div>
            <div class="form-group col-md-10">
                <label for="searchWord">Cautare dupa anunturi</label>
                <input type="text" name="searchWord" <#if searchWord??>value="${searchWord}"</#if> class="form-control"
                       id="searchWord">
            </div>
            <button style="width: 100%" type="submit" class="btn btn-dark">Cauta</button>
        </div>
    </form>
    <hr>
    <div class="card-columns">
        <#list products as product>
            <a href="/product/${product.id}" class="product-link">
                <div class="card text-white bg-dark my-3 product">

                    <img src="/images/${product.previewImageId}"
                         class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title">${product.title}</h5>
                        <p class="card-text">${product.price} $</p>
                    </div>
                    <div class="card-footer">
                        ${product.city}
                    </div>
                </div>
            </a>
        <#else>
            <h1 style="text-align: center">Nu a fost gasit</h1>
        </#list>
    </div>
</@t.template>