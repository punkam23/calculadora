plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.cucumber:cucumber-java:7.1.0")
    testImplementation("io.cucumber:cucumber-junit:7.1.0")
    testImplementation("net.masterthought:cucumber-reporting:5.6.0")
}

tasks.test {
    useJUnitPlatform()
}