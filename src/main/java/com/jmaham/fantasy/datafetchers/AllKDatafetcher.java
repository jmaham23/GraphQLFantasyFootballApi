package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.K;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class AllKDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "allK"
  )
  public List<K> getAllK(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
