package runner.historiausuario2;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/historiausuario2/ValidarCamposReserva.feature"},
        glue ="stepsdefinition.historiausuario2"
)
public class ValidarCamposReservaRunner {
}
