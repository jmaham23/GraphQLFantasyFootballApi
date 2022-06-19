package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.RB;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class AllRBDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "allRB"
  )
  public List<RB> getAllRB(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
