package test;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.HTMLUNIT;
import static play.test.Helpers.running;
import static play.test.Helpers.testServer;

import org.junit.Test;

import play.libs.F.Callback;
import play.test.TestBrowser;

public class SimpleTest{

@Test
public void runInBrowser() {
    running(testServer(3333), HTMLUNIT, new Callback<TestBrowser>() {
        public void invoke(TestBrowser browser) {
           browser.goTo("http://localhost:3333"); 
           assertThat(browser.$("#title").getTexts().get(0)).isEqualTo("Hello Guest");
           browser.$("a").click();
           assertThat(browser.url()).isEqualTo("http://localhost:3333/Coco");
           assertThat(browser.$("#title", 0).getText()).isEqualTo("Hello Coco");
        }
    });
}
}
