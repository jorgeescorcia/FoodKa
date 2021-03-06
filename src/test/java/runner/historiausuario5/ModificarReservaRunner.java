package runner.historiausuario5;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/historiausuario5/ModificarReserva.feature"},
        glue ="stepsdefinition.historiausuario5"
)
public class ModificarReservaRunner {
}
