package caseStudy.UserMicroservices.SecurityConfig;
//package caseStudy.UserMicroservices.SecurityConfig;
//

//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//


//	private AuthenticationManager authenticationManager;
//
//	@Autowired
//	private JwtUtil jwtTokenUtil;
//
//	@Autowired
//	private MyUserDetailsService userDetailsService;
//
//	// Authenticates the admin using user name and password and returns JWT
//	// token
//	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//	]
//		final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//
//		final String jwt = jwtTokenUtil.generateToken(userDetails);
//		return ResponseEntity.ok(jwt);
//	}
//
//	
//
//}