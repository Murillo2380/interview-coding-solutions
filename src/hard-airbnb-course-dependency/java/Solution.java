import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.LinkedList;

public class Solution {

    private static String solve(Map<String, List<String>> prerequisitesMap) {

        List<String> answer = new ArrayList<>(prerequisitesMap.entrySet().size());

        Map<String, List<String>> prerequisiteOfMap = new HashMap<>();
        Queue<String> coursesWithoutPrerequesite = new LinkedList<>();

        for (String course : prerequisitesMap.keySet()) {
            List<String> prerequisites = prerequisitesMap.get(course);

            if (prerequisites.size() == 0)
                coursesWithoutPrerequesite.add(course);

            for (String prerequisite : prerequisites) {
                prerequisiteOfMap.computeIfAbsent(prerequisite, c -> new ArrayList<>()).add(course);
            }
        }

        while (!coursesWithoutPrerequesite.isEmpty()) {

            String courseWithoutPrerequisite = coursesWithoutPrerequesite.poll();
            answer.add(courseWithoutPrerequisite);

            if (!prerequisiteOfMap.containsKey(courseWithoutPrerequisite))
                continue;

            for (String course : prerequisiteOfMap.get(courseWithoutPrerequisite)) {
                List<String> filteredPrerequisites = prerequisitesMap.get(course).stream()
                        .filter(p -> p != courseWithoutPrerequisite).collect(Collectors.toList());

                if (filteredPrerequisites.size() == 0)
                    coursesWithoutPrerequesite.add(course);

                prerequisitesMap.put(course, filteredPrerequisites);
            }

            prerequisiteOfMap.remove(courseWithoutPrerequisite);
        }

        return answer.toString();

    }

    public static void main(String[] args) {
        Map<String, List<String>> prerequisitesMap = new HashMap<>();
        prerequisitesMap.put("CSC300", Arrays.asList("CSC100", "CSC200"));
        prerequisitesMap.put("CSC200", Arrays.asList("CSC100"));
        prerequisitesMap.put("CSC100", Arrays.<String>asList());

        System.out.println(solve(prerequisitesMap)); // [CSC100, CSC200, CSC300]

    }
}