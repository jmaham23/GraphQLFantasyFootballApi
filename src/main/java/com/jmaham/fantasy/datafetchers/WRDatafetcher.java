package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.WR;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class WRDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "WR"
  )
  public WR getWR(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
