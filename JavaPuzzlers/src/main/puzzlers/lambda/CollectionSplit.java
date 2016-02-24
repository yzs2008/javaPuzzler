package puzzlers.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by DELL on 2016/2/24.
 */
public class CollectionSplit {
  List<Integer> statusList = IntStream.of(100,200,10,30,40)
                                      .boxed()
                                      .collect(Collectors.toList());


}
