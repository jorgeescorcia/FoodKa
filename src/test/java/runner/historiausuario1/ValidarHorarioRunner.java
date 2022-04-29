package runner.historiausuario1;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/historiausuario1/ValidarHorario.feature"},
        glue ="stepsdefinition.historiausuario1"
)
public class ValidarHorarioRunner {
}
