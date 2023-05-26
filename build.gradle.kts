plugins{
    base
    application
}

subprojects{
    apply{
        plugin("base")
        plugin("application")
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
        testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.3")
        testImplementation("org.mockito:mockito-core:5.3.1")
    }

    tasks{
        test{
            useJUnitPlatform()
        }
    }


}