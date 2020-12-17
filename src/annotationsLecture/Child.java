package annotationsLecture;

public class Child extends Parent {
    @Override
    public void sayHello(){
        System.out.println("Hello from child class!");
    }

    /**
     * @deprecated Use newMethod instead {@link #imAMethod()}
     */
    // this links to a different method, IDE will say to use a deprecated method call with w/e may be in the @link annotation in this
    // case it is the #imAMethod()
    // the comment needs to be written this way


    @Deprecated
    public void deprecatedMethod(){
        System.out.println("I'm a deprecated method!");
    }

    public void imAMethod(){
        System.out.println("I'm a method!");
    }
}
