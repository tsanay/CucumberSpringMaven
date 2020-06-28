package skynet.bagCommons;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BagCommonsSteps {
    @Autowired
    private BagHttpClient bagHttpClient;

    @Given("^the bag is empty$")
    public void the_bag_is_empty() {
        bagHttpClient.clean();
        assertThat(bagHttpClient.getContents().isEmpty()).isTrue();
    }
}
