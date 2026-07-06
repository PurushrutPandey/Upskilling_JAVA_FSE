package com.example;

public class App {

    public static void main(String[] args) {

        ExternalApi api = new ExternalApi() {
            @Override
            public String getData() {
                return "Real API Data";
            }
        };

        MyService service = new MyService(api);

        System.out.println("Fetched Data: " + service.fetchData());
    }
}