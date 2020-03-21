/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication(proxyBeanMethods = false)
public class PetClinicApplication {
	
	/** 
	 * Java Application으로 Main Method를 실행하려면  Maven generate-resources, Pakcag을 먼저 실행하여 패키지에 필요한 자원을 생성한 후 실행애햐 합니다.
	 * 	
	 * ex) css 생성
	 *  - target/classes/static/resources/css/petclinic.css
	 */
	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
