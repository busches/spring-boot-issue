import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// blah
plugins {
//	id("org.springframework.boot") version "2.2.8.RELEASE"
	// This works until we toggle to 2.3.1
	id("org.springframework.boot") version "2.3.1.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	kotlin("jvm") version "1.3.72"
	kotlin("plugin.spring") version "1.3.72"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
	maven("https://repo.spring.io/milestone")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	runtimeOnly("com.microsoft.sqlserver:mssql-jdbc")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}

	implementation("org.springframework.boot.experimental:spring-boot-starter-data-r2dbc")
	testImplementation("org.springframework.boot.experimental:spring-boot-test-autoconfigure-r2dbc")
	testImplementation("io.r2dbc:r2dbc-h2:0.8.3.RELEASE")
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.boot.experimental:spring-boot-bom-r2dbc:0.1.0.M3")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}
