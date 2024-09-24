package StreamsJava;


import domain.enums.Role;
import domain.enums.Status;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    User user1 = new User(1, "John Doe", "password123", "123 Main St", "123-456-7890", true, Role.Admin, new ArrayList<>());
    User user2 = new User(2, "Jane Smith", "password456", "456 Elm St", "987-654-3210", false, Role.Client, new ArrayList<>());
    User user3 = new User(3, "Alice Johnson", "password789", "789 Oak St", "555-666-7777", true, Role.Admin, new ArrayList<>());

    // Create projects
    Project project1 = new Project(1, "Project Alpha", 0.15, 100000.0, Status.InProgress, new ArrayList<>(), new ArrayList<>(), user1, new ArrayList<>());
    Project project2 = new Project(2, "Project Beta", 0.10, 50000.0, Status.Completed, new ArrayList<>(), new ArrayList<>(), user1, new ArrayList<>());
    Project project3 = new Project(3, "Project Gamma", 0.20, 150000.0, Status.InProgress, new ArrayList<>(), new ArrayList<>(), user2, new ArrayList<>());
    Project project4 = new Project(4, "Project Delta", 0.25, 200000.0, Status.Canceled, new ArrayList<>(), new ArrayList<>(), user2, new ArrayList<>());

    // Assign projects to users
        user1.setProjects(Arrays.asList(project1,project2));
        user2.setProjects(Arrays.asList(project3,project4));

    // Create materials and assign to projects
    Material material1 = new Material(1, "Bricks", "Construction", 0.2, 1.0, project1, 2.0, 1000.0, 50.0);
    Material material2 = new Material(2, "Cement", "Construction", 0.2, 1.0, project1, 5.0, 500.0, 30.0);
    Material material3 = new Material(3, "Bricks", "Construction", 0.2, 1.0, project2, 2.0, 1000.0, 50.0);
    Material material4 = new Material(4, "Cement", "Construction", 0.2, 1.0, project2, 5.0, 500.0, 30.0);

        project1.setMaterials(Arrays.asList(material1,material2));
        project2.setMaterials(Arrays.asList(material3,material4));

    // Create labors and assign to projects
    Labor labor1 = new Labor(1, "Electrician", "Labor", 0.15, 1.0, project1, 20.0, 40.0);
    Labor labor2 = new Labor(2, "Plumber", "Labor", 0.15, 1.0, project1, 25.0, 35.0);
    Labor labor3 = new Labor(3, "Electrician", "Labor", 0.15, 1.0, project2, 20.0, 40.0);
    Labor labor4 = new Labor(4, "Plumber", "Labor", 0.15, 1.0, project2, 25.0, 35.0);

        project1.setLabors(Arrays.asList(labor1,labor2));
        project2.setLabors(Arrays.asList(labor3,labor4));

    // Create estimates and assign to projects
    Estimate estimate1 = new Estimate(1, 20000.0, LocalDate.now().minusDays(30), LocalDate.now().minusDays(10), true, project1);
    Estimate estimate2 = new Estimate(2, 15000.0, LocalDate.now().minusDays(20), LocalDate.now().minusDays(5), false, project1);
    Estimate estimate3 = new Estimate(3, 20000.0, LocalDate.now().minusDays(30), LocalDate.now().minusDays(10), true, project2);
    Estimate estimate4 = new Estimate(4, 15000.0, LocalDate.now().minusDays(20), LocalDate.now().minusDays(5), false, project2);

        project1.setEstimates(Arrays.asList(estimate1,estimate2));
        project2.setEstimates(Arrays.asList(estimate3,estimate4));

    // Create a list of users to use in testing
    List<User> users = Arrays.asList(user1, user2, user3);
    List<Project> projects = Arrays.asList(project1, project3, project4, project2);

//filter professional projects :
 users.stream().filter(user->user.isProfessional()).map(user->user.getName()).forEach(System.out::println);
//print all projects associated with users :
 users.stream().flatMap(user->user.getProjects().stream()).map(project -> project.getName()).forEach(System.out::println);
//each project and total cost of estimates :
 projects.stream().forEach(project -> System.out.println(project.getEstimates().stream().mapToDouble(estimate6->estimate6.getCostTotal()).sum()));
//count of completed projects :
 System.out.println(projects.stream().filter(project -> project.getStatus().equals(Status.Completed)).count());
//sort projects by cost total :
 projects.stream().sorted((projectA,projectB) -> projectA.getCostTotal()<projectB.getCostTotal() ? 1 : -1).forEach(project -> System.out.println(project.getName() + " : " + project.getCostTotal()));
//sort project by sum of total cost of estimates    :
 projects.stream().sorted((proA,proB)->proA.getEstimates().stream().mapToDouble(Estimate::getCostTotal).sum() >proB.getEstimates().stream().mapToDouble(Estimate::getCostTotal).sum() ? 1: -1).forEach(project -> System.out.println(project.getName()+ " : " + project.getEstimates().stream().mapToDouble(Estimate::getCostTotal).sum()));
//filter materials with cost low or equal 1 :
 projects.stream().flatMap(project -> project.getMaterials().stream()).filter(material -> material.getCostPerUnit()>1).forEach(material -> System.out.println(material.getName()));
//get average worked hours :
 System.out.println(projects.stream().flatMap(project -> project.getLabors().stream()).mapToDouble(Labor::getHoursOfWork).sum()/projects.stream().flatMap(project -> project.getLabors().stream()).count());
//get average hours worked by project :
 projects.stream().forEach(project -> System.out.println(project.getName() + ":" + project.getLabors().stream().mapToDouble(Labor::getHoursOfWork).sum()/project.getLabors().stream().count()));
//grouping projects by status :
 Map<Status , List<Project>> map = projects.stream().collect(groupingBy(Project::getStatus));
//get project that contains bricks in materials :
 projects.stream().filter(project -> project.getMaterials().stream().filter(material -> material.getName().equals("Bricks")).count()>0).forEach(project -> System.out.println(project.getName()));
    users.stream().forEach(user-> System.out.println(user.getName() + " : " + user.getProjects().stream().mapToDouble(Project::getCostTotal).sum()));

//flattern labors and materials into one list :
        List<Component> flattenList = new ArrayList<>();
        projects.stream().flatMap(project -> project.getMaterials().stream()).forEach(material -> flattenList.add(material));
        projects.stream().flatMap(project -> project.getLabors().stream()).forEach(labor -> flattenList.add(labor));

//        estimate with highest cost
        Estimate estimate = projects.stream().flatMap(project -> project.getEstimates().stream()).sorted((estimateA,estimateB)->estimateA.getCostTotal()<estimateB.getCostTotal()?1:-1).findFirst().get();
         System.out.println(estimate.getProject().getName() + ":"+estimate.getCostTotal());
}
