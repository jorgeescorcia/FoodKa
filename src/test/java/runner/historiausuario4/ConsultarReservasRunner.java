package runner.historiausuario4;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/historiausuario4/ConsultarReservas.feature"},
        glue ="stepsdefinition.historiausuario4"
)
public class ConsultarReservasRunner {
}
