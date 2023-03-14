package hexlet.code;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    public void testStringSchema() {
        String str = "what does the fox say";
        Validator v = new Validator();
        StringSchema schema = v.string();

        assertThat(schema.isValid("")).isTrue();
        assertThat(schema.isValid(null)).isTrue();

        schema.required();
        assertThat(schema.isValid(str)).isTrue();
        assertThat(schema.isValid("hexlet")).isTrue();

        assertThat(schema.isValid(null)).isFalse();
        assertThat(schema.isValid(5)).isFalse();
        assertThat(schema.isValid("")).isFalse();

        schema.minLength(2);
        assertThat(schema.isValid("w")).isFalse();
        assertThat(schema.isValid("wh")).isTrue();

        assertThat(schema.contains("wh").isValid(str)).isTrue();
        schema.contains("whatthe");
        assertThat(schema.isValid(str)).isFalse();
    }
}
