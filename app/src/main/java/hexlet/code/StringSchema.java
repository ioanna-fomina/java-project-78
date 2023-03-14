package hexlet.code;

public class StringSchema extends Schema {

    public StringSchema() {
        addPredicate(value -> value == null || value instanceof String);
    }
    public StringSchema required() {
        addPredicate(value -> value instanceof String && !((String) value).isEmpty());
        return this;
    }

    public StringSchema minLength(int length) {
        addPredicate(value -> ((String) value).length() >= length);
        return this;
    }

    public StringSchema contains(String str) {
        addPredicate(value -> ((String) value).contains(str));
        return this;
    }
}