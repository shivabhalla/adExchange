package config;


import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import rest.TestRes;

/**
 * Created by shiva.b on 22/08/16 at 7:49 PM.
 */
public class AdExchangeApplication extends Application<AdExchangeConfiguration>{

    public static void main(String args[]) throws Exception {
        new AdExchangeApplication().run(args);
    }

    public void run(AdExchangeConfiguration adExchangeConfiguration, Environment environment) throws Exception {
        TestRes testRes = new TestRes();
        environment.jersey().register(testRes);
    }
}
