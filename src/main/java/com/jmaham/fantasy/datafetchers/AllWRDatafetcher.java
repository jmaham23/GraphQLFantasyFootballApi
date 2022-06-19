package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.WR;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class AllWRDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "allWR"
  )
  public List<WR> getAllWR(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
