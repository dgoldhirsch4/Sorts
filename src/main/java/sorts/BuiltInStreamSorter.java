package sorts;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class BuiltInStreamSorter implements Sorter {

   @Override
   public List<Integer> sort(List<Integer> integers) {
      assert (integers != null);

      return integers.stream().sorted().collect(toList());
   }
}
