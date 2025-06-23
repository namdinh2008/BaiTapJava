package OwnAnnotation;

public class Main {
    public static void main(String[] args) {
        Class<JavaClass> obj = JavaClass.class;

        if (obj.isAnnotationPresent(CourseInfo.class)) {
            CourseInfo info = obj.getAnnotation(CourseInfo.class);
            System.out.println("Course Name: " + info.name());
            System.out.println("Year: " + info.year());
        }
    }
}
