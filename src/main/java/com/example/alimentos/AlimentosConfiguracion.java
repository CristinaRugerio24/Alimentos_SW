package com.example.alimentos;

import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.filter.CorsFilter;

@EnableWs
@Configuration
public class AlimentosConfiguracion extends WsConfigurerAdapter{
    @Bean 
    public XsdSchema alimentosSchema(){
        return new SimpleXsdSchema(new ClassPathResource("alimentos.xsd"));
    }

@Bean
    public ServletRegistrationBean messageDispatcherServlet (ApplicationContext applicationContext){
        
        MessageDispatcherServlet servlet = new MessageDispatcherServlet ();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

@Bean (name = "alimentos")
    public DefaultWsdl11Definition defaultWsdl11Definition (XsdSchema alimentosSchema){
        
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("alimentosPort");
        wsdl.setLocationUri("/ws/alimentos");
        wsdl.setTargetNamespace("http://tell.me/alimentos");
        wsdl.setSchema(alimentosSchema);
        return wsdl;
    }

    @Bean
    public FilterRegistrationBean corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }
}