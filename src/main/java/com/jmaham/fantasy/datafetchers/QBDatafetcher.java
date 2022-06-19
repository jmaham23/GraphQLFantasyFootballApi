package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.QB;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class QBDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "QB"
  )
  public QB getQB(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
