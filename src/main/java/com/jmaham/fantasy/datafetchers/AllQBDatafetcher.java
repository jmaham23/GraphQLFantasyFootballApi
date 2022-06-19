package com.jmaham.fantasy.datafetchers;

import com.jmaham.fantasy.types.QB;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class AllQBDatafetcher {
  private final List<QB> qbs = List.of(
          new QB("1", 5, "Bob Dylan", "Bears", 4, 5, 50.20, 50, 65.89, 4, 1, 6, 100, 560, 7, 3, 17, 56.89, 67.98, 32.11, "2021"),
          new QB("2", 5, "job fylan", "Bears", 4, 5, 50.20, 50, 65.89, 4, 1, 6, 100, 560, 7, 3, 17, 56.89, 67.98, 32.11, "2019")
  );

  @DgsQuery
  public List<QB> allQB(@InputArgument String yearFilter) {
    if(yearFilter==null){
      return qbs;
    }
    return qbs.stream().filter(s->s.getYear().contains(yearFilter)).collect(Collectors.toList());
  }
}