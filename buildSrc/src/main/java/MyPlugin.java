import org.gradle.api.*;

public abstract class MyPlugin implements Plugin<Project> {
    public void apply(Project project) {
        ExtensiblePolymorphicDomainObjectContainer first = project.getObjects().polymorphicDomainObjectContainer(Named.class);
        ExtensiblePolymorphicDomainObjectContainer second = project.getObjects().polymorphicDomainObjectContainer(Named.class);
        project.getExtensions().add("first", first);
        project.getExtensions().add("second", second);

        first.registerBinding(Named.class, Named.class);
        second.registerBinding(Named.class, Named.class);

        first.create("element1", Named.class);
        second.create("element2", Named.class);
    }
}