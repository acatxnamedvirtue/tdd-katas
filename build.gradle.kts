group = "specialprojects"
version = "1.0-SNAPSHOT"

plugins {
    application
    kotlin("jvm") version "1.3.21"
}

application {
    mainClassName = "specialprojects.bowlinggame"
}

dependencies {
    compile(kotlin("stdlib"))
    testImplementation("junit:junit:4.12")
}

repositories {
    jcenter()
}