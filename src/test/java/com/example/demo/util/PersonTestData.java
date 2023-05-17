import com.example.demo.data.PersonData;
import com.example.demo.data.Project;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.data.Address;
import com.example.demo.data.Education;
import com.example.demo.data.Experience;

public class PersonTestData {
    
    public  PersonData getPersonData(Long id){
        PersonData personData = new PersonData(id, "John", "Doe", "john" + id + "@email.com", id+ "234567890", getAddresses(1), getEducations(1), getSkills(1), getExperiences(1),getProjects(1));           
        return personData; 
    }

    public  List<PersonData> getPersonDatas(int len){
        List<PersonData> personDatas = new ArrayList<>();
        for(int i = 1; i< len+1; i++){
            personDatas.add(getPersonData(Long.valueOf(i)));
        }
        return personDatas;
    }

    public  List<Address> getAddresses(int len){
        List<Address> addresses = new ArrayList<>();
        for(int i = 1; i < len+1; i++){
            addresses.add(new Address(Long.valueOf(i), 1, "test address", "test-street", "test-other-landmark", "test_city", 111111, "test-country"));
        }
        return addresses;       
    }

    public  List<Education> getEducations(int len){
        List<Education> educations = new ArrayList<>();
        for(int i = 1; i < len+1; i++){
            educations.add(new Education(Long.valueOf(i), "test-education", "full-time", "test university", 2010, 2020, 77.8));
        }
        return educations;
    }

    public  List<String> getSkills(int len){
        List<String> skills = new ArrayList<>();
        for(int i = 1; i < len+1; i++){
            skills.add("skill" + i);
        }
        return skills;
    }
    public  List<Experience> getExperiences(int len){
        List<Experience> experiences = new ArrayList<>();
        for(int i = 1; i < len+1; i++){
            experiences.add(new Experience(Long.valueOf(i), "test-designation", "test inc.", 2010, 2020, true, "test is test designation"));   
        }
        return experiences;
    }
    public  List<Project> getProjects(int len){
        List<Project> projects = new ArrayList<>();
        for(int i = 1; i < len+1; i++){
            projects.add(new Project(Long.valueOf(1), "test project", 2010, 2020, false, "test project descrption", getSkills(1), "test project source"));
        }
        return projects;
    }
}
