package edu.javavt19.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import edu.javavt19.dao.CarBrandDAO;
import edu.javavt19.dao.CarModelDAO;
import edu.javavt19.dao.jpa.CarBrandDAOJpaImpl;
import edu.javavt19.dao.jpa.CarModelDAOJpaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource(value = {"classpath:application.properties"})
@ComponentScan
@EnableTransactionManagement
@PersistenceContext(unitName = "JpaPrefix")
public class JpaConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean entityManagerFactory =  new LocalContainerEntityManagerFactoryBean();

        entityManagerFactory.setDataSource(dataSource);
        entityManagerFactory.setPackagesToScan(new String[] {"edu.javavt19.model.jpa"});
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        entityManagerFactory.setJpaVendorAdapter(vendorAdapter);

        return entityManagerFactory;
    }

    @Bean
    @Autowired
    public PlatformTransactionManager jpaTransactionManager(EntityManagerFactory emf) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(emf);
        return txManager;
    }

    @Bean
    public CarBrandDAO getCarBrandJpaDAO() {
        return new CarBrandDAOJpaImpl();
    }

    @Bean
    public CarModelDAO getCarModelJpaDAO() {
        return new CarModelDAOJpaImpl();
    }
}