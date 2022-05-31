package caseStudy.UserMicroservices.SecurityConfig;
//package caseStudy.UserMicroservices.SecurityConfig;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//

//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
////filter intercepts every request once and examine the header
//@Component
//@Autowired
//private JwtUtil jwtUtil;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//			throws ServletException, IOException {
//
//		final String authorizationHeader = request.getHeader("Authorization");
//
//		String username = null;
//		String jwt = null;
//
//	SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//			}
//		}
//		chain.doFilter(request, response);
//	}
//
//}