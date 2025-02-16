package in.sita.sangita.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.sita.sangita.bindings.Passenger;

@Service
public class PassengerService {
	
	/*
	 * public String sendPassengerDetails(Passenger passenger) {
	 * 
	 * return "passenger"; }
	 */
	
	public  static void getListPassenger(){
		
		String apiUrl="https://www.classes.ashokit.in/tickets";
		WebClient webClient = WebClient.create();
		System.out.println("========Programm started request===========");
		webClient.get()
				.uri(apiUrl)
				.retrieve()
				.bodyToMono(Passenger.class)
				.subscribe(response->{
					handlResponse(response);
				});
		System.out.println("========Programm end request===========");
		//return new ArrayList<>();
	}

	private  static void handlResponse(Passenger response) {
		System.out.println(response);
	}
}
