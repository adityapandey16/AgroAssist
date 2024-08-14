package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
	
	
	@Bean	 
	public UserDetailsService userDetailsService( )  // UserDetailsService ko hum custom banaye ge over-ride kr ke DB seh bhi data leh sakte hai
	{
		// neeche wala User build-in CLASS hai ....
		//    .password(passwordEncoder( ).encode("shivendra")),roles("Admin").build( ); ---ye bhi likh sakte hai
//		UserDetails user=User.builder().username("shivendra").password("shivendra").roles("Admin").build();
//		UserDetails user1=User.builder().username("shiv").password("shiv").roles("Admin").build();
		//----Modifying the above two lines using Password Encoder-->>
		UserDetails user=User.builder().username("shivendra").password(passwordEncoder().encode("shivendra")).roles("Admin").build();
		UserDetails user1=User.builder().username("shiv").password(passwordEncoder().encode("shiv")).roles("Admin").build();
		
		
		return new InMemoryUserDetailsManager(user,user1);
	}
	
	@Bean      // Jis seh hum esko kahe bahar use krna chahe toh use kr sakte hai 
	public PasswordEncoder passwordEncoder( )
	{
		return new BCryptPasswordEncoder();
		
	}

}
//UserDetails is an I/F serializable