package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.TE;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class AllTEDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "allTE"
  )
  public List<TE> getAllTE(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
