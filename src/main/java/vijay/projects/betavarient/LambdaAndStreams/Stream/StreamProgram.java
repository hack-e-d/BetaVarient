package vijay.projects.betavarient.LambdaAndStreams.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamProgram {

    private List<String> countries = new ArrayList<String>();

    public StreamProgram() {
        this.getCountries().add("india");
        this.getCountries().add("america");
        this.getCountries().add("africa");
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public static void main(String[] args) {

        StreamProgram streamProgram = new StreamProgram();

        Stream<String> countriesStream = streamProgram.getCountries().stream();

//        sort,map and foreach in stream
        countriesStream.sorted()
                .map(s -> {
                    return s.toUpperCase();
                })
                .forEach(s -> {
            System.out.println(s);
        });

    }
}
