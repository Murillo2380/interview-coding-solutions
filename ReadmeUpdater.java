import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadmeUpdater {

    private static final String README_FILE_NAME = "./README.md";
    private static final String PROBLEMS_SECTION = "## Problems";

    private static class FilesGetter {

        private List<File> files;

        FilesGetter(String path) {
            files = new ArrayList<>(64);
            File folder = new File(path);

            Stream.of(folder.listFiles()).forEach(files::add);
        }

        public List<File> getFiles() {
            return files;
        }

    }

    private static class SolutionTransformer {

        private static final String PROBLEM_TITLE_PREFIX = "### ";

        private static final String IDEA_FILE_NAME = "Idea.md";
        private static final String JAVA_FILE_NAME = "Solution.java";
        private static final String JAVASCRIPT_FILE_NAME = "solution.js";

        private static final String JAVA_SOLUTION_PREFIX = "[Java Solution]";
        private static final String JAVA_SOLUTION_IDEA_PREFIX = "[Java Solution Idea]";

        private static final String JAVASCRIPT_SOLUTION_PREFIX = "[JavaScript Solution]";
        private static final String JAVASCRIPT_SOLUTION_IDEA_PREFIX = "[JavaScript Solution Idea]";

        private File folder;

        SolutionTransformer(File folder) {
            if (!folder.isDirectory())
                throw new IllegalArgumentException(folder.getName() + " must be a directory");

            this.folder = folder;
        }

        private String getSolutionLink(String ideaPrefix, String codePrefix, String solutionCodeFileName, File folder) {

            String codeLink = codePrefix + "(" + folder.getPath() + File.separator + solutionCodeFileName + ")";
            String ideaLink = ideaPrefix + "(" + folder.getPath() + File.separator + IDEA_FILE_NAME + ")";

            return codeLink + System.lineSeparator() + ideaLink;

        }

        private String getJavaSolutionLink(File folder) {
            return getSolutionLink(JAVA_SOLUTION_IDEA_PREFIX, JAVA_SOLUTION_PREFIX, JAVA_FILE_NAME, folder);
        }

        private String getJavaScriptSolutionLink(File folder) {
            return getSolutionLink(JAVASCRIPT_SOLUTION_IDEA_PREFIX, JAVASCRIPT_SOLUTION_PREFIX, JAVASCRIPT_FILE_NAME,
                    folder);
        }

        private String getSolutionLink(File f) {
            if (f.getName().endsWith("js"))
                return getJavaScriptSolutionLink(f);
            else
                return getJavaSolutionLink(f);
        }

        private String getReadmeContent(File readmeFile) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(readmeFile));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while ((line = br.readLine()) != null) {
                if (line == "# Description")
                    continue;
                if (line.startsWith("# Source"))
                    sb.append("###");
                sb.append(line).append(System.lineSeparator());

            }

            br.close();
            return sb.toString();
        }

        public String getSolutionDescription() {
            FilesGetter solutionFiles = new FilesGetter(folder.getPath());
            StringBuilder sb = new StringBuilder();

            String problemTitle = PROBLEM_TITLE_PREFIX + folder.getName();
            String readmeContent = null;

            sb.append(problemTitle).append(System.lineSeparator()).append(System.lineSeparator());

            try {

                for (File f : solutionFiles.getFiles()) {
                    if (!f.isDirectory())
                        readmeContent = getReadmeContent(f);
                    else
                        sb.append(getSolutionLink(f)).append(System.lineSeparator());
                }

            } catch (IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }

            sb.append(readmeContent).append(System.lineSeparator());

            return sb.toString();
        }

    }

    public static void main(String[] args) {

        File readmeFile = new File(README_FILE_NAME);

        StringBuffer sb = new StringBuffer();
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(readmeFile));

            while ((line = br.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
                if (line.startsWith(PROBLEMS_SECTION))
                    break;
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-2);
        }

        sb.append(System.lineSeparator());

        FilesGetter filesGetter = new FilesGetter("./src");
        filesGetter.getFiles().stream().parallel().map(SolutionTransformer::new).map(st -> st.getSolutionDescription())
                .forEach(sb::append);

        try {
            Files.write(Paths.get(README_FILE_NAME), sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-3);
        }
    }

}