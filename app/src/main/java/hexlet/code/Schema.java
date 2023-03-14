package hexlet.code;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class Schema {
    private List<Predicate<Object>> predicates = new ArrayList<>();

    protected void addPredicate(Predicate<Object> predicate) {
        predicates.add(predicate);
    }

    public boolean isValid(Object object) {
        return predicates.stream().allMatch(predicate -> predicate.test(object));
    }
}