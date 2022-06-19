package com.jmaham.fantasy.types;

import javax.persistence.*;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

@Entity
@Table
public class TE {
  @Id
  @SequenceGenerator(name = "te_sequence", sequenceName = "te_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "te_sequence")
  private String id;

  private Integer rank;

  private String name;

  private String team;

  private Integer rec;

  private Integer tgt;

  private Integer recYds;

  private Double yR;

  private Integer lg;

  private Integer recTd;

  private Integer rushAtt;

  private Integer rushYds;

  private Integer rushTds;

  private Integer fl;

  private Integer games;

  private double fPts;

  private double fPtsAGame;

  private Double rostPct;

  private int year;

  public TE() {
  }

  public TE(String id, Integer rank, String name, String team, Integer rec, Integer tgt,
      Integer recYds, Double yR, Integer lg, Integer recTd, Integer rushAtt, Integer rushYds,
      Integer rushTds, Integer fl, Integer games, double fPts, double fPtsAGame, Double rostPct,
      int year) {
    this.id = id;
    this.rank = rank;
    this.name = name;
    this.team = team;
    this.rec = rec;
    this.tgt = tgt;
    this.recYds = recYds;
    this.yR = yR;
    this.lg = lg;
    this.recTd = recTd;
    this.rushAtt = rushAtt;
    this.rushYds = rushYds;
    this.rushTds = rushTds;
    this.fl = fl;
    this.games = games;
    this.fPts = fPts;
    this.fPtsAGame = fPtsAGame;
    this.rostPct = rostPct;
    this.year = year;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public Integer getRec() {
    return rec;
  }

  public void setRec(Integer rec) {
    this.rec = rec;
  }

  public Integer getTgt() {
    return tgt;
  }

  public void setTgt(Integer tgt) {
    this.tgt = tgt;
  }

  public Integer getRecYds() {
    return recYds;
  }

  public void setRecYds(Integer recYds) {
    this.recYds = recYds;
  }

  public Double getYR() {
    return yR;
  }

  public void setYR(Double yR) {
    this.yR = yR;
  }

  public Integer getLg() {
    return lg;
  }

  public void setLg(Integer lg) {
    this.lg = lg;
  }

  public Integer getRecTd() {
    return recTd;
  }

  public void setRecTd(Integer recTd) {
    this.recTd = recTd;
  }

  public Integer getRushAtt() {
    return rushAtt;
  }

  public void setRushAtt(Integer rushAtt) {
    this.rushAtt = rushAtt;
  }

  public Integer getRushYds() {
    return rushYds;
  }

  public void setRushYds(Integer rushYds) {
    this.rushYds = rushYds;
  }

  public Integer getRushTds() {
    return rushTds;
  }

  public void setRushTds(Integer rushTds) {
    this.rushTds = rushTds;
  }

  public Integer getFl() {
    return fl;
  }

  public void setFl(Integer fl) {
    this.fl = fl;
  }

  public Integer getGames() {
    return games;
  }

  public void setGames(Integer games) {
    this.games = games;
  }

  public double getFPts() {
    return fPts;
  }

  public void setFPts(double fPts) {
    this.fPts = fPts;
  }

  public double getFPtsAGame() {
    return fPtsAGame;
  }

  public void setFPtsAGame(double fPtsAGame) {
    this.fPtsAGame = fPtsAGame;
  }

  public Double getRostPct() {
    return rostPct;
  }

  public void setRostPct(Double rostPct) {
    this.rostPct = rostPct;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "TE{" + "id='" + id + "'," +"rank='" + rank + "'," +"name='" + name + "'," +"team='" + team + "'," +"rec='" + rec + "'," +"tgt='" + tgt + "'," +"recYds='" + recYds + "'," +"yR='" + yR + "'," +"lg='" + lg + "'," +"recTd='" + recTd + "'," +"rushAtt='" + rushAtt + "'," +"rushYds='" + rushYds + "'," +"rushTds='" + rushTds + "'," +"fl='" + fl + "'," +"games='" + games + "'," +"fPts='" + fPts + "'," +"fPtsAGame='" + fPtsAGame + "'," +"rostPct='" + rostPct + "'," +"year='" + year + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TE that = (TE) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(rank, that.rank) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(team, that.team) &&
                            java.util.Objects.equals(rec, that.rec) &&
                            java.util.Objects.equals(tgt, that.tgt) &&
                            java.util.Objects.equals(recYds, that.recYds) &&
                            java.util.Objects.equals(yR, that.yR) &&
                            java.util.Objects.equals(lg, that.lg) &&
                            java.util.Objects.equals(recTd, that.recTd) &&
                            java.util.Objects.equals(rushAtt, that.rushAtt) &&
                            java.util.Objects.equals(rushYds, that.rushYds) &&
                            java.util.Objects.equals(rushTds, that.rushTds) &&
                            java.util.Objects.equals(fl, that.fl) &&
                            java.util.Objects.equals(games, that.games) &&
                            fPts == that.fPts &&
                            fPtsAGame == that.fPtsAGame &&
                            java.util.Objects.equals(rostPct, that.rostPct) &&
                            year == that.year;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, rank, name, team, rec, tgt, recYds, yR, lg, recTd, rushAtt, rushYds, rushTds, fl, games, fPts, fPtsAGame, rostPct, year);
  }

  public static com.jmaham.fantasy.types.TE.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private Integer rank;

    private String name;

    private String team;

    private Integer rec;

    private Integer tgt;

    private Integer recYds;

    private Double yR;

    private Integer lg;

    private Integer recTd;

    private Integer rushAtt;

    private Integer rushYds;

    private Integer rushTds;

    private Integer fl;

    private Integer games;

    private double fPts;

    private double fPtsAGame;

    private Double rostPct;

    private int year;

    public TE build() {
                  com.jmaham.fantasy.types.TE result = new com.jmaham.fantasy.types.TE();
                      result.id = this.id;
          result.rank = this.rank;
          result.name = this.name;
          result.team = this.team;
          result.rec = this.rec;
          result.tgt = this.tgt;
          result.recYds = this.recYds;
          result.yR = this.yR;
          result.lg = this.lg;
          result.recTd = this.recTd;
          result.rushAtt = this.rushAtt;
          result.rushYds = this.rushYds;
          result.rushTds = this.rushTds;
          result.fl = this.fl;
          result.games = this.games;
          result.fPts = this.fPts;
          result.fPtsAGame = this.fPtsAGame;
          result.rostPct = this.rostPct;
          result.year = this.year;
                      return result;
    }

    public com.jmaham.fantasy.types.TE.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder rank(Integer rank) {
      this.rank = rank;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder team(String team) {
      this.team = team;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder rec(Integer rec) {
      this.rec = rec;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder tgt(Integer tgt) {
      this.tgt = tgt;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder recYds(Integer recYds) {
      this.recYds = recYds;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder yR(Double yR) {
      this.yR = yR;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder lg(Integer lg) {
      this.lg = lg;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder recTd(Integer recTd) {
      this.recTd = recTd;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder rushAtt(Integer rushAtt) {
      this.rushAtt = rushAtt;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder rushYds(Integer rushYds) {
      this.rushYds = rushYds;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder rushTds(Integer rushTds) {
      this.rushTds = rushTds;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder fl(Integer fl) {
      this.fl = fl;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder games(Integer games) {
      this.games = games;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder fPts(double fPts) {
      this.fPts = fPts;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder fPtsAGame(double fPtsAGame) {
      this.fPtsAGame = fPtsAGame;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder rostPct(Double rostPct) {
      this.rostPct = rostPct;
      return this;
    }

    public com.jmaham.fantasy.types.TE.Builder year(int year) {
      this.year = year;
      return this;
    }
  }
}
