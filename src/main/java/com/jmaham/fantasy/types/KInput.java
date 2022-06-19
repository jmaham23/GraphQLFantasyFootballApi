package com.jmaham.fantasy.types;

import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class KInput {
  private Integer rank;

  private String name;

  private String team;

  private Integer fg;

  private Integer fga;

  private Double pct;

  private Integer lg;

  private Integer oneToNineteen;

  private Integer twentyToTwentynine;

  private Integer thirtyToThirtynine;

  private Integer fortyToFortynine;

  private Integer fiftyPlus;

  private Integer xpt;

  private Integer xpa;

  private Integer games;

  private int fPts;

  private double fPtsAGame;

  private Double rostPct;

  private int year;

  public KInput() {
  }

  public KInput(Integer rank, String name, String team, Integer fg, Integer fga, Double pct,
      Integer lg, Integer oneToNineteen, Integer twentyToTwentynine, Integer thirtyToThirtynine,
      Integer fortyToFortynine, Integer fiftyPlus, Integer xpt, Integer xpa, Integer games,
      int fPts, double fPtsAGame, Double rostPct, int year) {
    this.rank = rank;
    this.name = name;
    this.team = team;
    this.fg = fg;
    this.fga = fga;
    this.pct = pct;
    this.lg = lg;
    this.oneToNineteen = oneToNineteen;
    this.twentyToTwentynine = twentyToTwentynine;
    this.thirtyToThirtynine = thirtyToThirtynine;
    this.fortyToFortynine = fortyToFortynine;
    this.fiftyPlus = fiftyPlus;
    this.xpt = xpt;
    this.xpa = xpa;
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

  public Integer getFg() {
    return fg;
  }

  public void setFg(Integer fg) {
    this.fg = fg;
  }

  public Integer getFga() {
    return fga;
  }

  public void setFga(Integer fga) {
    this.fga = fga;
  }

  public Double getPct() {
    return pct;
  }

  public void setPct(Double pct) {
    this.pct = pct;
  }

  public Integer getLg() {
    return lg;
  }

  public void setLg(Integer lg) {
    this.lg = lg;
  }

  public Integer getOneToNineteen() {
    return oneToNineteen;
  }

  public void setOneToNineteen(Integer oneToNineteen) {
    this.oneToNineteen = oneToNineteen;
  }

  public Integer getTwentyToTwentynine() {
    return twentyToTwentynine;
  }

  public void setTwentyToTwentynine(Integer twentyToTwentynine) {
    this.twentyToTwentynine = twentyToTwentynine;
  }

  public Integer getThirtyToThirtynine() {
    return thirtyToThirtynine;
  }

  public void setThirtyToThirtynine(Integer thirtyToThirtynine) {
    this.thirtyToThirtynine = thirtyToThirtynine;
  }

  public Integer getFortyToFortynine() {
    return fortyToFortynine;
  }

  public void setFortyToFortynine(Integer fortyToFortynine) {
    this.fortyToFortynine = fortyToFortynine;
  }

  public Integer getFiftyPlus() {
    return fiftyPlus;
  }

  public void setFiftyPlus(Integer fiftyPlus) {
    this.fiftyPlus = fiftyPlus;
  }

  public Integer getXpt() {
    return xpt;
  }

  public void setXpt(Integer xpt) {
    this.xpt = xpt;
  }

  public Integer getXpa() {
    return xpa;
  }

  public void setXpa(Integer xpa) {
    this.xpa = xpa;
  }

  public Integer getGames() {
    return games;
  }

  public void setGames(Integer games) {
    this.games = games;
  }

  public int getFPts() {
    return fPts;
  }

  public void setFPts(int fPts) {
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
    return "KInput{" + "rank='" + rank + "'," +"name='" + name + "'," +"team='" + team + "'," +"fg='" + fg + "'," +"fga='" + fga + "'," +"pct='" + pct + "'," +"lg='" + lg + "'," +"oneToNineteen='" + oneToNineteen + "'," +"twentyToTwentynine='" + twentyToTwentynine + "'," +"thirtyToThirtynine='" + thirtyToThirtynine + "'," +"fortyToFortynine='" + fortyToFortynine + "'," +"fiftyPlus='" + fiftyPlus + "'," +"xpt='" + xpt + "'," +"xpa='" + xpa + "'," +"games='" + games + "'," +"fPts='" + fPts + "'," +"fPtsAGame='" + fPtsAGame + "'," +"rostPct='" + rostPct + "'," +"year='" + year + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KInput that = (KInput) o;
        return java.util.Objects.equals(rank, that.rank) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(team, that.team) &&
                            java.util.Objects.equals(fg, that.fg) &&
                            java.util.Objects.equals(fga, that.fga) &&
                            java.util.Objects.equals(pct, that.pct) &&
                            java.util.Objects.equals(lg, that.lg) &&
                            java.util.Objects.equals(oneToNineteen, that.oneToNineteen) &&
                            java.util.Objects.equals(twentyToTwentynine, that.twentyToTwentynine) &&
                            java.util.Objects.equals(thirtyToThirtynine, that.thirtyToThirtynine) &&
                            java.util.Objects.equals(fortyToFortynine, that.fortyToFortynine) &&
                            java.util.Objects.equals(fiftyPlus, that.fiftyPlus) &&
                            java.util.Objects.equals(xpt, that.xpt) &&
                            java.util.Objects.equals(xpa, that.xpa) &&
                            java.util.Objects.equals(games, that.games) &&
                            fPts == that.fPts &&
                            fPtsAGame == that.fPtsAGame &&
                            java.util.Objects.equals(rostPct, that.rostPct) &&
                            year == that.year;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(rank, name, team, fg, fga, pct, lg, oneToNineteen, twentyToTwentynine, thirtyToThirtynine, fortyToFortynine, fiftyPlus, xpt, xpa, games, fPts, fPtsAGame, rostPct, year);
  }

  public static com.jmaham.fantasy.types.KInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Integer rank;

    private String name;

    private String team;

    private Integer fg;

    private Integer fga;

    private Double pct;

    private Integer lg;

    private Integer oneToNineteen;

    private Integer twentyToTwentynine;

    private Integer thirtyToThirtynine;

    private Integer fortyToFortynine;

    private Integer fiftyPlus;

    private Integer xpt;

    private Integer xpa;

    private Integer games;

    private int fPts;

    private double fPtsAGame;

    private Double rostPct;

    private int year;

    public KInput build() {
                  com.jmaham.fantasy.types.KInput result = new com.jmaham.fantasy.types.KInput();
                      result.rank = this.rank;
          result.name = this.name;
          result.team = this.team;
          result.fg = this.fg;
          result.fga = this.fga;
          result.pct = this.pct;
          result.lg = this.lg;
          result.oneToNineteen = this.oneToNineteen;
          result.twentyToTwentynine = this.twentyToTwentynine;
          result.thirtyToThirtynine = this.thirtyToThirtynine;
          result.fortyToFortynine = this.fortyToFortynine;
          result.fiftyPlus = this.fiftyPlus;
          result.xpt = this.xpt;
          result.xpa = this.xpa;
          result.games = this.games;
          result.fPts = this.fPts;
          result.fPtsAGame = this.fPtsAGame;
          result.rostPct = this.rostPct;
          result.year = this.year;
                      return result;
    }

    public com.jmaham.fantasy.types.KInput.Builder rank(Integer rank) {
      this.rank = rank;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder team(String team) {
      this.team = team;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder fg(Integer fg) {
      this.fg = fg;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder fga(Integer fga) {
      this.fga = fga;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder pct(Double pct) {
      this.pct = pct;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder lg(Integer lg) {
      this.lg = lg;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder oneToNineteen(Integer oneToNineteen) {
      this.oneToNineteen = oneToNineteen;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder twentyToTwentynine(
        Integer twentyToTwentynine) {
      this.twentyToTwentynine = twentyToTwentynine;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder thirtyToThirtynine(
        Integer thirtyToThirtynine) {
      this.thirtyToThirtynine = thirtyToThirtynine;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder fortyToFortynine(Integer fortyToFortynine) {
      this.fortyToFortynine = fortyToFortynine;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder fiftyPlus(Integer fiftyPlus) {
      this.fiftyPlus = fiftyPlus;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder xpt(Integer xpt) {
      this.xpt = xpt;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder xpa(Integer xpa) {
      this.xpa = xpa;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder games(Integer games) {
      this.games = games;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder fPts(int fPts) {
      this.fPts = fPts;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder fPtsAGame(double fPtsAGame) {
      this.fPtsAGame = fPtsAGame;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder rostPct(Double rostPct) {
      this.rostPct = rostPct;
      return this;
    }

    public com.jmaham.fantasy.types.KInput.Builder year(int year) {
      this.year = year;
      return this;
    }
  }
}
