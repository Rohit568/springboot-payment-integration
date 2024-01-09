package org.example.config;

import com.phonepe.sdk.pg.payments.v1.PhonePePaymentClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhonePeConfig {
    /**
     * Builds PhonePePaymentClient.
     * @param phonePeProperties
     * @return PhonePePaymentClient
     */
    @Bean
    PhonePePaymentClient phonePePaymentClient(
            final PhonePeProperties phonePeProperties) {
        System.out.println(phonePeProperties);
        return new PhonePePaymentClient(phonePeProperties.merchantId(),
                phonePeProperties.saltKey(),
                phonePeProperties.saltIndex(),
                phonePeProperties.env(),
                phonePeProperties.shouldPublishEvents());
    }
}
