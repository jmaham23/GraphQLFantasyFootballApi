package com.jmaham.fantasy.types;

import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class QBInput {
  private Integer rank;

  private String name;

  private String team;

  private Integer cmp;

  private Integer passAtt;

  private Double pct;

  private Integer passYds;

  private Double yA;

  private Integer passTd;

  private Integer _int;

  private Integer sacks;

  private Integer rushAtt;

  private Integer rushYds;

  private Integer rushTds;

  private Integer fl;

  private Integer games;

  private double fPts;

  private double fPtsAGame;

  private Double rostPct;

  private int year;

  public QBInput() {
  }

  public QBInput(Integer rank, String name, String team, Integer cmp, Integer passAtt, Double pct,
      Integer passYds, Double yA, Integer passTd, Integer _int, Integer sacks, Integer rushAtt,
      Integer rushYds, Integer rushTds, Integer fl, Integer games, double fPts, double fPtsAGame,
      Double rostPct, int year) {
    this.rank = rank;
    this.name = name;
    this.team = team;
    this.cmp = cmp;
    this.passAtt = passAtt;
    this.pct = pct;
    this.passYds = passYds;
    this.yA = yA;
    this.passTd = passTd;
    this._int = _int;
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

  public Integer getPassTd() {
    return passTd;
  }

  public void setPassTd(Integer passTd) {
    this.passTd = passTd;
  }

  public Integer getInt() {
    return _int;
  }

  public void setInt(Integer _int) {
    this._int = _int;
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

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "QBInput{" + "rank='" + rank + "'," +"name='" + name + "'," +"team='" + team + "'," +"cmp='" + cmp + "'," +"passAtt='" + passAtt + "'," +"pct='" + pct + "'," +"passYds='" + passYds + "'," +"yA='" + yA + "'," +"passTd='" + passTd + "'," +"int='" + _int + "'," +"sacks='" + sacks + "'," +"rushAtt='" + rushAtt + "'," +"rushYds='" + rushYds + "'," +"rushTds='" + rushTds + "'," +"fl='" + fl + "'," +"games='" + games + "'," +"fPts='" + fPts + "'," +"fPtsAGame='" + fPtsAGame + "'," +"rostPct='" + rostPct + "'," +"year='" + year + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QBInput that = (QBInput) o;
        return java.util.Objects.equals(rank, that.rank) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(team, that.team) &&
                            java.util.Objects.equals(cmp, that.cmp) &&
                            java.util.Objects.equals(passAtt, that.passAtt) &&
                            java.util.Objects.equals(pct, that.pct) &&
                            java.util.Objects.equals(passYds, that.passYds) &&
                            java.util.Objects.equals(yA, that.yA) &&
                            java.util.Objects.equals(passTd, that.passTd) &&
                            java.util.Objects.equals(_int, that._int) &&
                            java.util.Objects.equals(sacks, that.sacks) &&
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
    return java.util.Objects.hash(rank, name, team, cmp, passAtt, pct, passYds, yA, passTd, _int, sacks, rushAtt, rushYds, rushTds, fl, games, fPts, fPtsAGame, rostPct, year);
  }

  public static com.jmaham.fantasy.types.QBInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Integer rank;

    private String name;

    private String team;

    private Integer cmp;

    private Integer passAtt;

    private Double pct;

    private Integer passYds;

    private Double yA;

    private Integer passTd;

    private Integer _int;

    private Integer sacks;

    private Integer rushAtt;

    private Integer rushYds;

    private Integer rushTds;

    private Integer fl;

    private Integer games;

    private double fPts;

    private double fPtsAGame;

    private Double rostPct;

    private int year;

    public QBInput build() {
                  com.jmaham.fantasy.types.QBInput result = new com.jmaham.fantasy.types.QBInput();
                      result.rank = this.rank;
          result.name = this.name;
          result.team = this.team;
          result.cmp = this.cmp;
          result.passAtt = this.passAtt;
          result.pct = this.pct;
          result.passYds = this.passYds;
          result.yA = this.yA;
          result.passTd = this.passTd;
          result._int = this._int;
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

    public com.jmaham.fantasy.types.QBInput.Builder rank(Integer rank) {
      this.rank = rank;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder team(String team) {
      this.team = team;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder cmp(Integer cmp) {
      this.cmp = cmp;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder passAtt(Integer passAtt) {
      this.passAtt = passAtt;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder pct(Double pct) {
      this.pct = pct;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder passYds(Integer passYds) {
      this.passYds = passYds;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder yA(Double yA) {
      this.yA = yA;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder passTd(Integer passTd) {
      this.passTd = passTd;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder _int(Integer _int) {
      this._int = _int;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder sacks(Integer sacks) {
      this.sacks = sacks;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder rushAtt(Integer rushAtt) {
      this.rushAtt = rushAtt;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder rushYds(Integer rushYds) {
      this.rushYds = rushYds;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder rushTds(Integer rushTds) {
      this.rushTds = rushTds;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder fl(Integer fl) {
      this.fl = fl;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder games(Integer games) {
      this.games = games;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder fPts(double fPts) {
      this.fPts = fPts;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder fPtsAGame(double fPtsAGame) {
      this.fPtsAGame = fPtsAGame;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder rostPct(Double rostPct) {
      this.rostPct = rostPct;
      return this;
    }

    public com.jmaham.fantasy.types.QBInput.Builder year(int year) {
      this.year = year;
      return this;
    }
  }
}
