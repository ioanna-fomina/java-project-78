package hexlet.code;

public class StringSchema extends Schema {
    public StringSchema required() {
        return this;
    }

    public StringSchema minLength() {
        return this;
    }

    public StringSchema contains(String str) {
        return this;
    }
}