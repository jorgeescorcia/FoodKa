package runner.historiausuario6;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/historiausuario6/CorreoCancReserva.feature"},
        glue ="stepsdefinition.historiausuario6"
)
public class CorreoCancReservaRunner {
}
