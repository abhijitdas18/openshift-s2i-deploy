package com.openshift.s2i.openshifts2ideploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenshiftS2iDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftS2iDeployApplication.class, args);
		System.out.println("This is demo on S2I for OpenShift");
	}

}
