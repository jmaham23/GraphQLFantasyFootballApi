package com.jmaham.fantasy.types;

import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class DSTInput {
  private Integer rank;

  private String name;

  private String team;

  private Integer sack;

  private Integer _int;

  private Integer fr;

  private Integer ff;

  private Integer defTds;

  private Integer sfty;

  private Integer spcTds;

  private Integer games;

  private double fPts;

  private double fPtsAGame;

  private Double rostPct;

  private int year;

  public DSTInput() {
  }

  public DSTInput(Integer rank, String name, String team, Integer sack, Integer _int, Integer fr,
      Integer ff, Integer defTds, Integer sfty, Integer spcTds, Integer games, double fPts,
      double fPtsAGame, Double rostPct, int year) {
    this.rank = rank;
    this.name = name;
    this.team = team;
    this.sack = sack;
    this._int = _int;
    this.fr = fr;
    this.ff = ff;
    this.defTds = defTds;
    this.sfty = sfty;
    this.spcTds = spcTds;
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

  public Integer getSack() {
    return sack;
  }

  public void setSack(Integer sack) {
    this.sack = sack;
  }

  public Integer getInt() {
    return _int;
  }

  public void setInt(Integer _int) {
    this._int = _int;
  }

  public Integer getFr() {
    return fr;
  }

  public void setFr(Integer fr) {
    this.fr = fr;
  }

  public Integer getFf() {
    return ff;
  }

  public void setFf(Integer ff) {
    this.ff = ff;
  }

  public Integer getDefTds() {
    return defTds;
  }

  public void setDefTds(Integer defTds) {
    this.defTds = defTds;
  }

  public Integer getSfty() {
    return sfty;
  }

  public void setSfty(Integer sfty) {
    this.sfty = sfty;
  }

  public Integer getSpcTds() {
    return spcTds;
  }

  public void setSpcTds(Integer spcTds) {
    this.spcTds = spcTds;
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
    return "DSTInput{" + "rank='" + rank + "'," +"name='" + name + "'," +"team='" + team + "'," +"sack='" + sack + "'," +"int='" + _int + "'," +"fr='" + fr + "'," +"ff='" + ff + "'," +"defTds='" + defTds + "'," +"sfty='" + sfty + "'," +"spcTds='" + spcTds + "'," +"games='" + games + "'," +"fPts='" + fPts + "'," +"fPtsAGame='" + fPtsAGame + "'," +"rostPct='" + rostPct + "'," +"year='" + year + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DSTInput that = (DSTInput) o;
        return java.util.Objects.equals(rank, that.rank) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(team, that.team) &&
                            java.util.Objects.equals(sack, that.sack) &&
                            java.util.Objects.equals(_int, that._int) &&
                            java.util.Objects.equals(fr, that.fr) &&
                            java.util.Objects.equals(ff, that.ff) &&
                            java.util.Objects.equals(defTds, that.defTds) &&
                            java.util.Objects.equals(sfty, that.sfty) &&
                            java.util.Objects.equals(spcTds, that.spcTds) &&
                            java.util.Objects.equals(games, that.games) &&
                            fPts == that.fPts &&
                            fPtsAGame == that.fPtsAGame &&
                            java.util.Objects.equals(rostPct, that.rostPct) &&
                            year == that.year;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(rank, name, team, sack, _int, fr, ff, defTds, sfty, spcTds, games, fPts, fPtsAGame, rostPct, year);
  }

  public static com.jmaham.fantasy.types.DSTInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Integer rank;

    private String name;

    private String team;

    private Integer sack;

    private Integer _int;

    private Integer fr;

    private Integer ff;

    private Integer defTds;

    private Integer sfty;

    private Integer spcTds;

    private Integer games;

    private double fPts;

    private double fPtsAGame;

    private Double rostPct;

    private int year;

    public DSTInput build() {
                  com.jmaham.fantasy.types.DSTInput result = new com.jmaham.fantasy.types.DSTInput();
                      result.rank = this.rank;
          result.name = this.name;
          result.team = this.team;
          result.sack = this.sack;
          result._int = this._int;
          result.fr = this.fr;
          result.ff = this.ff;
          result.defTds = this.defTds;
          result.sfty = this.sfty;
          result.spcTds = this.spcTds;
          result.games = this.games;
          result.fPts = this.fPts;
          result.fPtsAGame = this.fPtsAGame;
          result.rostPct = this.rostPct;
          result.year = this.year;
                      return result;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder rank(Integer rank) {
      this.rank = rank;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder team(String team) {
      this.team = team;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder sack(Integer sack) {
      this.sack = sack;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder _int(Integer _int) {
      this._int = _int;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder fr(Integer fr) {
      this.fr = fr;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder ff(Integer ff) {
      this.ff = ff;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder defTds(Integer defTds) {
      this.defTds = defTds;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder sfty(Integer sfty) {
      this.sfty = sfty;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder spcTds(Integer spcTds) {
      this.spcTds = spcTds;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder games(Integer games) {
      this.games = games;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder fPts(double fPts) {
      this.fPts = fPts;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder fPtsAGame(double fPtsAGame) {
      this.fPtsAGame = fPtsAGame;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder rostPct(Double rostPct) {
      this.rostPct = rostPct;
      return this;
    }

    public com.jmaham.fantasy.types.DSTInput.Builder year(int year) {
      this.year = year;
      return this;
    }
  }
}
