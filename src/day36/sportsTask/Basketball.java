package day36.sportsTask;public class Basketball extends Sport {    private int numberOfPlayers;    public void setInfo(String name, int numberOfReferre, String rules,int numberOfPlayers) {        setInfo(name, numberOfReferre, rules);        setNumberOfPlayers(numberOfPlayers);    }    public int getNumberOfPlayers() {        return numberOfPlayers;    }    ;    public void setNumberOfPlayers(int numberOfPlayers) {        if (!(numberOfPlayers == 14)) {            System.out.println("Number of players mst be 14");            System.exit(0);        }this.numberOfPlayers=numberOfPlayers;    }    public String toString() {        return "Basketball{" +                "Name=" + '\''+getName() + '\''+                "numberOfReferre=" +'\''+ getNumberOfReferre()+ '\'' +                " Rules : " + getRules() +                "numberOfPlayers=" + '\''+ numberOfPlayers + '\''+                '}';    }}