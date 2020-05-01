package sorts;

import java.util.List;

public interface Sorter {
   /**
    * Return a new list containing the sorted integers of the
    * old list.
    *
    * @param integers (not null)
    * @return new list of the same integers, sorted
    */
   List<Integer> sort(List<Integer> integers);
}
