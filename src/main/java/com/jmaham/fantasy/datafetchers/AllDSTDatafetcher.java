package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.DST;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class AllDSTDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "allDST"
  )
  public List<DST> getAllDST(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
