package tng3.staffapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("tng3.staffapi, tng3.base, tng3.helper")
@PropertySource({"config.properties"})
public class Config {


    @Value("${staff_app_id}")   public String appID;


    public Config(){}
}