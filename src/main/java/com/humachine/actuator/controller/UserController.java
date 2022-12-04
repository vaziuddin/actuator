package com.humachine.actuator.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.humachine.actuator.dto.UserEntity;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserEntity user;

	@GetMapping("/data")
	public UserEntity getUser(UserEntity user) throws JsonProcessingException {

		return user;

	}

//	private final String[] names = "jean, Yuxin, Mario, Mia, Maria, Dave, Johan, Francoise, Jose, Ibrahim".split(",");
//	
//	private final AtomicInteger counter =new AtomicInteger();
//	
//	private final Flux<UserEntity> users = Flux.fromStream(
//			Stream.generate(()->{
//				var id = counter.incrementAndGet();
//				return new UserEnity(id, users[id% users.length]); 
//			}))
//			.delayElements(Duration.ofSeconds(3));
//	@Bean
//	Flux<UserEntity> user () {
//		return this.users.publish().autoConnect();
//	}
//	
//	@Configuration
//	@RequiredArgsConstructor 
//	class WebSocketConfiguration{
//		
//		private ObjectMapper objectMapping;
//		
//		@SneakyThrows
//		@GetMapping("/data")
//		public String getUser(UserEntity user) throws JsonProcessingException {
//			
//			return this.objectMapping.writeValueAsString(user);
//
//		}
//		@Bean 
//		WebSocketHandler webSocketHandler(Flux<UserEntity> userEntityFlux) {
//			return new WebSocketSession -> {
//				
//				
//				
//				
//				var map =userEntityFlux
//					.map(user -> from(user))
//					.map(webSocketSession :: textMessage);
//					return webSocketSession.send(map);
//				
//			};
//		}
//	}

}
