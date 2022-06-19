package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.TE;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class TEDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "TE"
  )
  public TE getTE(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
