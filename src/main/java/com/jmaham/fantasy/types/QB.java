package com.jmaham.fantasy.types;

import javax.persistence.*;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

@Entity
@Table
public class QB {
  @Id
  @SequenceGenerator(name = "qb_sequence", sequenceName = "qb_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "qb_sequence")
  private String id;

  private Integer rank;

  private String name;

  private String team;

  private Integer cmp;

  private Integer passAtt;

  private Double pct;

  private Integer passYds;

  private Double yA;

  private Integer passTds;

  private Integer inter;

  private Integer sacks;

  private Integer rushAtt;

  private Integer rushYds;

  private Integer rushTds;

  private Integer fl;

  private Integer games;

  private double fPts;

  private double fPtsAGame;

  private Double rostPct;

  private String year;

  public QB() {
  }

  public QB(String id, Integer rank, String name, String team, Integer cmp, Integer passAtt,
      Double pct, Integer passYds, Double yA, Integer passTds, Integer inter, Integer sacks,
      Integer rushAtt, Integer rushYds, Integer rushTds, Integer fl, Integer games, double fPts,
      double fPtsAGame, Double rostPct, String year) {
    this.id = id;
    this.rank = rank;
    this.name = name;
    this.team = team;
    this.cmp = cmp;
    this.passAtt = passAtt;
    this.pct = pct;
    this.passYds = passYds;
    this.yA = yA;
    this.passTds = passTds;
    this.inter = inter;
    this.sacks = sacks;
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

  public Integer getCmp() {
    return cmp;
  }

  public void setCmp(Integer cmp) {
    this.cmp = cmp;
  }

  public Integer getPassAtt() {
    return passAtt;
  }

  public void setPassAtt(Integer passAtt) {
    this.passAtt = passAtt;
  }

  public Double getPct() {
    return pct;
  }

  public void setPct(Double pct) {
    this.pct = pct;
  }

  public Integer getPassYds() {
    return passYds;
  }

  public void setPassYds(Integer passYds) {
    this.passYds = passYds;
  }

  public Double getYA() {
    return yA;
  }

  public void setYA(Double yA) {
    this.yA = yA;
  }

  public Integer getPassTds() {
    return passTds;
  }

  public void setPassTds(Integer passTds) {
    this.passTds = passTds;
  }

  public Integer getInter() {
    return inter;
  }

  public void setInter(Integer inter) {
    this.inter = inter;
  }

  public Integer getSacks() {
    return sacks;
  }

  public void setSacks(Integer sacks) {
    this.sacks = sacks;
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

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "QB{" + "id='" + id + "'," +"rank='" + rank + "'," +"name='" + name + "'," +"team='" + team + "'," +"cmp='" + cmp + "'," +"passAtt='" + passAtt + "'," +"pct='" + pct + "'," +"passYds='" + passYds + "'," +"yA='" + yA + "'," +"passTds='" + passTds + "'," +"inter='" + inter + "'," +"sacks='" + sacks + "'," +"rushAtt='" + rushAtt + "'," +"rushYds='" + rushYds + "'," +"rushTds='" + rushTds + "'," +"fl='" + fl + "'," +"games='" + games + "'," +"fPts='" + fPts + "'," +"fPtsAGame='" + fPtsAGame + "'," +"rostPct='" + rostPct + "'," +"year='" + year + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QB that = (QB) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(rank, that.rank) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(team, that.team) &&
                            java.util.Objects.equals(cmp, that.cmp) &&
                            java.util.Objects.equals(passAtt, that.passAtt) &&
                            java.util.Objects.equals(pct, that.pct) &&
                            java.util.Objects.equals(passYds, that.passYds) &&
                            java.util.Objects.equals(yA, that.yA) &&
                            java.util.Objects.equals(passTds, that.passTds) &&
                            java.util.Objects.equals(inter, that.inter) &&
                            java.util.Objects.equals(sacks, that.sacks) &&
                            java.util.Objects.equals(rushAtt, that.rushAtt) &&
                            java.util.Objects.equals(rushYds, that.rushYds) &&
                            java.util.Objects.equals(rushTds, that.rushTds) &&
                            java.util.Objects.equals(fl, that.fl) &&
                            java.util.Objects.equals(games, that.games) &&
                            fPts == that.fPts &&
                            fPtsAGame == that.fPtsAGame &&
                            java.util.Objects.equals(rostPct, that.rostPct) &&
                            java.util.Objects.equals(year, that.year);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, rank, name, team, cmp, passAtt, pct, passYds, yA, passTds, inter, sacks, rushAtt, rushYds, rushTds, fl, games, fPts, fPtsAGame, rostPct, year);
  }

  public static com.jmaham.fantasy.types.QB.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private Integer rank;

    private String name;

    private String team;

    private Integer cmp;

    private Integer passAtt;

    private Double pct;

    private Integer passYds;

    private Double yA;

    private Integer passTds;

    private Integer inter;

    private Integer sacks;

    private Integer rushAtt;

    private Integer rushYds;

    private Integer rushTds;

    private Integer fl;

    private Integer games;

    private double fPts;

    private double fPtsAGame;

    private Double rostPct;

    private String year;

    public QB build() {
                  com.jmaham.fantasy.types.QB result = new com.jmaham.fantasy.types.QB();
                      result.id = this.id;
          result.rank = this.rank;
          result.name = this.name;
          result.team = this.team;
          result.cmp = this.cmp;
          result.passAtt = this.passAtt;
          result.pct = this.pct;
          result.passYds = this.passYds;
          result.yA = this.yA;
          result.passTds = this.passTds;
          result.inter = this.inter;
          result.sacks = this.sacks;
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

    public com.jmaham.fantasy.types.QB.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder rank(Integer rank) {
      this.rank = rank;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder team(String team) {
      this.team = team;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder cmp(Integer cmp) {
      this.cmp = cmp;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder passAtt(Integer passAtt) {
      this.passAtt = passAtt;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder pct(Double pct) {
      this.pct = pct;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder passYds(Integer passYds) {
      this.passYds = passYds;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder yA(Double yA) {
      this.yA = yA;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder passTds(Integer passTds) {
      this.passTds = passTds;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder inter(Integer inter) {
      this.inter = inter;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder sacks(Integer sacks) {
      this.sacks = sacks;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder rushAtt(Integer rushAtt) {
      this.rushAtt = rushAtt;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder rushYds(Integer rushYds) {
      this.rushYds = rushYds;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder rushTds(Integer rushTds) {
      this.rushTds = rushTds;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder fl(Integer fl) {
      this.fl = fl;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder games(Integer games) {
      this.games = games;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder fPts(double fPts) {
      this.fPts = fPts;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder fPtsAGame(double fPtsAGame) {
      this.fPtsAGame = fPtsAGame;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder rostPct(Double rostPct) {
      this.rostPct = rostPct;
      return this;
    }

    public com.jmaham.fantasy.types.QB.Builder year(String year) {
      this.year = year;
      return this;
    }
  }
}
