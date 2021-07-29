package com.phoenix.di.config;
/*
 * Creator Name: deepkamar.sherathiya@stltech.in
 * Date: 29/07/2021
 * Version: 1
 * copyright: Sterlite Technologies Ltd.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// configuration class
@Configuration
@ComponentScan(basePackages = {"com.phoenix.di.instruments", "com.phoenix.di.performers"})
public class PerformerConfig {

}
