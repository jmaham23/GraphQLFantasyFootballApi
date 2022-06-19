package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.RB;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class RBDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "RB"
  )
  public RB getRB(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
