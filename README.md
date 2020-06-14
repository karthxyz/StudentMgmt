# StudentMgmt
Springboot learnings
Spring boot Validations
Spring boot Exception Handling
Spring Profile
Spring boot JPA
Spring boot Resttemaplate
H2 
Log4j2
sleuth
Junit testing with Surefire reports
Jacoco for code coverage
Docker File
    

----------------------------------------------------------------------------------------------------------------------------------
1) Create a spring boot project -> starter spring project
2) Created base project structure
3) how to create packages -> com.companyname.projectname.module
4) base package -> com.companyname.projectname which has the application class
5) main annotation for application @SpringBootApplication
6) application properties --> to change port...context path ....h2 properties ....sql properties
7) learnt how to add dependencies in maven like log4j,h2,sql driver,validation
8) created Restcontroller class to handle request/response. and used following annotations (com.companyname.projectname.controller)

@RestController -> handle http request/response
@RequestMapping --> to handle context path example base path + (/student)
@PostMapping --> http post method call
@Valid --> input parameter validation
@RequestBody -> convert payload to java bean/pojo(object)
@GetMapping -> http post method call
@PathVariable -> parameter during get http
@PutMapping -> http update method call
@DeleteMapping -> http delete method call

9) create package for bean -> com.companyname.projectname.bean
10) create package for dto -> com.companyname.projectname.dto
        a) convert entity to dto for dbs or external communication(for data peristence)
		b) @Data - lombok - to create getter and setter
		   @AllArgsConstructor
		   @NoArgsConstructor
		   @ToString
		   @Entity(name = "student")
		   @Table(name = "student")
		   @Scope(value="prototype")
		   @Component

11) create package for exception -> com.companyname.projectname.exception
    a) default and custom exception classes goes here
	b) handle response for exception scenario
	c) @controlleradvice -  which allows to handle exceptions across the whole application in one global handling component.
	   @exceptionhandler - active for that particular Controller. used to handle the specific exceptions and sending the custom responses to the client
	
12) create package for service -> com.companyname.projectname.service
      a) all service implemenatation classes goes here
	  b) @service
	  
13) create package for repository -> com.companyname.projectname.repository
    a) all database classes goes here....
    b) for JPA - extend Jpa repository
	c) annotations - @repository

14) custom application properties - profile
	port
	contextpath
	h2/sql properties
	
15) logback and log4j....logging to a log file.(slf4j)
	log4j2.xml
	
16) h2 - memory based db

17) JPA repository
    saveandflush
    findbyId
	deletebyID
	
18) Junit test	

19) resttemplate - to call another service

20) sleuth for logging
	



@SpringBootApplication
@RestController
@RequestMapping
@PostMapping
@Valid 
@RequestBody
@Autowired
@GetMapping
@PathVariable
@PutMapping
@DeleteMapping
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NotBlank
@NotNull
@Entity 
@Table 
@Scope 
@Component
@Id
@GeneratedValue
@Column
@ControllerAdvice
@ExceptionHandler
@Repository
@Service
