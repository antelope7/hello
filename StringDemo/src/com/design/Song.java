package com.design;

public class Song {
    private String name;
    private String singerName;
    private String year;
    private String pubAddress;
    private String copyRight;

    public Song(String name, String singerName, String year, String pubAddress, String copyRight) {
        this.name = name;
        this.singerName = singerName;
        this.year = year;
        this.pubAddress = pubAddress;
        this.copyRight = copyRight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPubAddress() {
        return pubAddress;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress;
    }

    public String getCopyRight() {
        return copyRight;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", singerName='" + singerName + '\'' +
                ", year='" + year + '\'' +
                ", pubAddress='" + pubAddress + '\'' +
                ", copyRight='" + copyRight + '\'' +
                '}';
    }
}
