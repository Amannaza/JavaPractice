package day38.browserTask;public class BrowserObject {    public static void main(String[] args) {        Safari s1=new Safari();        s1.closeBrowser();        s1.openBrowser();        Opera o1=new Opera();        o1.openBrowser();        o1.closeBrowser();        Firefox f=new Firefox();        f.closeBrowser();        f.openBrowser();    }}