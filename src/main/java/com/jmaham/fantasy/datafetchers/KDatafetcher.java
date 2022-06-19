package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.K;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class KDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "K"
  )
  public K getK(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
