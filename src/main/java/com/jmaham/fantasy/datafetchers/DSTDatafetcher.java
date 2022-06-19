package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.DST;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class DSTDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "DST"
  )
  public DST getDST(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
