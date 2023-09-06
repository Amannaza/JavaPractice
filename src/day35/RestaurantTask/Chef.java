package day35.RestaurantTask;public class Chef {    private String name;    private int employeeId;    private double hourlyRate;    private boolean isFullTime;    public Chef(String name, int employeeId, double hourlyRate, boolean isFullTime) {        setName(name);        setEmployeeId(employeeId);        setHourlyRate(hourlyRate);        setFullTime(isFullTime);    }    public String getName() {        return name;    }    public void setName(String name) {        if (name.isEmpty() || name.isBlank()) {            System.err.println("Invalid name");            System.exit(1);        }        this.name = name;    }    public int getEmployeeId() {        return employeeId;    }    public void setEmployeeId(int employeeId) {        if (employeeId <= 0) {            System.out.println("Invalid employee Id" + employeeId);            System.exit(0);        }        this.employeeId = employeeId;    }    public double getHourlyRate() {        return hourlyRate;    }    public void setHourlyRate(double hourlyRate) {        if (hourlyRate < 0) {            System.out.println("Invalid hourly rate" + hourlyRate);            System.exit(0);        }        this.hourlyRate = hourlyRate;    }    public boolean isFullTime() {        return isFullTime;    }    public void setFullTime(boolean fullTime) {        isFullTime = fullTime;    }    public String toString() {        return "Chef{" +                "name='" + name + '\'' +                ", employeeId=" + employeeId +                ", hourlyRate=" + hourlyRate +                ", isFullTime=" + isFullTime +                '}';    }}/*Old version Restaurant Task:		6.2 Create a class called Chef		            Attributes:		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)			   Add A constructor that can set all the fields		            Actions: (all void methods)		                makeOrder(): chef's name + "is making an order"		                washDishes(): chef's name + "is washing the dishes"		                toString(): Returns (String) all the information of a Chef		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"*/