import java.util.*;

public class BuildOrder {
    public static void main(String[] args) {
        char[] projects = {'a', 'b', 'c', 'd', 'e', 'f'};
        List pList = Arrays.asList(projects);
        char[][] dependencies = {{'a', 'd'}, {'f', 'b'}, {'b', 'd'}, {'f', 'a'}, {'d', 'c'}};
        badBuildOrder(pList, dependencies);
    }
    private static void badBuildOrder(List<Character> projects, char[][] dependencies) {
        List<Character> result = new LinkedList<>();
        for (int i = 0; i < dependencies.length; i++) {
            if (!projects.contains(dependencies[i][0]) || !projects.contains(dependencies[i][1])) {
                System.out.println("project doesn't exist");
                return;
            }
            if (!result.contains((dependencies[i][0])) && !result.contains((dependencies[i][1]))) {
                result.add(dependencies[i][0]);
                result.add(dependencies[i][1]);
            }
        }
    }
    /*
    Build Order: You are given a list of projects and a list of dependencies
    (which is a list of pairs of projects, where the second project is dependent on the first project).
    All of a project's dependencies must be built before the project is. Find a build order that
    will allow the projects to be built. If there is no valid build order, return an error.
    Example:
        Input:
            projects: a, b, c, d, e, f
            dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
        Output: f, e, a, b, d, c
     */
}
