package meghanada.completion.matcher;

import java.util.Comparator;
import java.util.function.Predicate;
import meghanada.reflect.CandidateUnit;

public interface CompletionMatcher {

  boolean match(CandidateUnit c);

  boolean matchString(String s);

  Predicate<CandidateUnit> filter();

  Comparator<CandidateUnit> comparator();
}
