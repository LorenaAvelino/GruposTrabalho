package io.github.lorena.grupostrabalho.utils;

import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyOrderStrategy;
import java.util.Locale;

public final class HTMLBuilder {
    private static final JsonbConfig jsonbConfig = new JsonbConfig()
            .withFormatting(true)
            .withDateFormat("dd/MM/yyyy",
                    Locale.forLanguageTag("pt_BR"))
            .withPropertyOrderStrategy(
                    PropertyOrderStrategy.LEXICOGRAPHICAL
            );

    public static String toJson(Object object) {
        return JsonbBuilder
                .create(jsonbConfig)
                .toJson(object);
    }

    public static String blocoRelatorioBuilder(String title, Object relatorio) {
        return "<h2>" + title + "</h2>"
                + "<details style=\" font-size: 1.3em\"> " +
                "<summary style=\"cursor: pointer\">Respostas</summary> " +
                "<p><pre class=\"language-json\"> " + toJson(relatorio) + "</pre></p></details>";
    }
}
